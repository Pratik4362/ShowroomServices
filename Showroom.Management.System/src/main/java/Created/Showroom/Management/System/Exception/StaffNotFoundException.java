package Created.Showroom.Management.System.Exception;

public class StaffNotFoundException extends Exception {

	public StaffNotFoundException() {
		super();
	}

	public StaffNotFoundException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StaffNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StaffNotFoundException(String message) {
		super(message);
	}

	public StaffNotFoundException(Throwable cause) {
		super(cause);
	}

}
