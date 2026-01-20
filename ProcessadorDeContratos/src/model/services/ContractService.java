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
		double baseAmount = contract.getTotalValue() / months;
		LocalDate nextDate = contract.getDate().plus(Period.ofMonths(1));		
		
		for (int i=1; i<=months; i++) {
			double interestAmount = onlinePaymentService.interest(baseAmount, i);
			double feeAmount = onlinePaymentService.paymentFee(baseAmount + interestAmount);
			
			double totalInstallment = baseAmount + interestAmount + feeAmount;
			
			contract.getInstallments().add(new Installment(nextDate, totalInstallment));
			
			nextDate = nextDate.plus(Period.ofMonths(1));
		}
	}
}
