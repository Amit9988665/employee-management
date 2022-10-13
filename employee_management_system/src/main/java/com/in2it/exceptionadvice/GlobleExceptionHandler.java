package com.in2it.exceptionadvice;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.in2it.custumexception.UserCustumException;

@RestControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Map<String, String> exceptioHandler(MethodArgumentNotValidException ex) {
		Map<String, String> miMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			miMap.put(error.getField(), error.getDefaultMessage());
		});
		return miMap;
	}
	
	@ExceptionHandler(UserCustumException.class)
	public ResponseEntity<Map<String, List<String>>> userDifineException(UserCustumException ex) {
		List<String> errors = Collections.singletonList(ex.getMessage());
		return new ResponseEntity<>(getErrorsMap(errors), new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	public Map<String, List<String>> getErrorsMap(List<String> errors) {
		Map<String, List<String>> map = new HashMap<>();
		map.put("Error is ", errors);
		return map;
	}
}
