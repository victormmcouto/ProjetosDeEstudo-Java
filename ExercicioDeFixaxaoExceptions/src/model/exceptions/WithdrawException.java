package model.exceptions;

public class WithdrawException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public WithdrawException() {
		super();
	}
	
	public WithdrawException(String msg) {
		super(msg);
	}
}
