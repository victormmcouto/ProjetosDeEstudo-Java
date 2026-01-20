package model.services;

import java.time.LocalDate;
import java.time.Period;

import model.entites.Contract;
import model.entites.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		double installmentAmount = 0.0;
		double baseAmount = contract.getTotalValue() / months;
		LocalDate nextDate = contract.getDate().plus(Period.ofMonths(1));		
		
		for (int i=0; i<months; i++) {
			installmentAmount = baseAmount + onlinePaymentService.interest(baseAmount, i);
			installmentAmount += onlinePaymentService.paymentFee(installmentAmount);
			
			contract.getInstallments().add(new Installment(nextDate, installmentAmount));
			
			nextDate = nextDate.plus(Period.ofMonths(1));
		}
	}
}
