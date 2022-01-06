package jan06_22;

public class WithdrawException extends Exception{

	String message;
	public WithdrawException(String msg)
	{
		message=msg;
	}
	public String getMessage()
	{
		return message;
	}

	}


