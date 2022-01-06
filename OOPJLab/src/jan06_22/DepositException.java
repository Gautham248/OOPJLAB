package jan06_22;

public class DepositException extends Exception {

	
		String message;
		public DepositException(String msg)
		{
			message=msg;
		}
		public String getMessage()
		{
			return message;
		}

	}


