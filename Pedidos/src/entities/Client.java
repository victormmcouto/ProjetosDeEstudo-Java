package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	
	private String name;
	private String email;
	private LocalDate birthDate;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Client() {
		
	}  
	
	public Client(String name, String email, String birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = LocalDate.parse(birthDate, formatter);
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Client: ");
		sb.append(getName() + " (");
		sb.append(formatter.format(getBirthDate()) + ") - ");
		sb.append(getEmail());
		
		return sb.toString();
	}
}
