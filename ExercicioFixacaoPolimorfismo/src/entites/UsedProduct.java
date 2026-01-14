package entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	private LocalDate manufactureDate;
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, String manufactueDate) {
		super(name, price);
		this.manufactureDate = LocalDate.parse(manufactueDate, format);
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = LocalDate.parse(manufactureDate, format);
	}
	
	@Override
	public String priceTag() {
		return name + " (used) $ " +
			   String.format("%.2f", price) +
			   " (Manufacture date: " +
			   manufactureDate.format(format) + ")";
	}
}
