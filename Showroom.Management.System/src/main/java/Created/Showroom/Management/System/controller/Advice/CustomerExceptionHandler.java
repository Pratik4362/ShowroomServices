package Created.Showroom.Management.System.controller.Advice;

import java.util.HashMap;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class CustomerExceptionHandler {
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	//(msg(key):statment(value))
	public Map<String,String> ExceptionHandle(MethodArgumentNotValidException Ex){
		Map<String, String> errormap=new HashMap<>();
		Ex.getBindingResult().getFieldErrors().forEach(error ->{
			errormap.put(error.getField(),error.getDefaultMessage());
		});
		return errormap;
	}
}
