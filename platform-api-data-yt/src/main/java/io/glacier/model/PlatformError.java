package io.glacier.model;





public class PlatformError {

	private int errorCode;
	private String errorMessage;

	
	public PlatformError() {
		super();
	}
	public PlatformError(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
}
