package io.glacier.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import io.glacier.exception.ServiceException;
import io.glacier.model.PlatformError;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler   {

	
	//@ExceptionHandler(ServiceException.class)
	
/*public ResponseEntity<PlatformError> mapException(ServiceException ex){
		
		PlatformError error=new PlatformError(HttpStatus.NOT_FOUND.value(),ex.getMessage());
	
		return new ResponseEntity<PlatformError>(error,HttpStatus.NOT_FOUND);
	}
*/
	
	@ExceptionHandler(ServiceException.class)
	public void mapException(HttpServletResponse response) throws IOException
	{
		response.sendError(HttpStatus.NOT_FOUND.value());
	}
	
}
