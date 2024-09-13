package com.example.CRUD_Operation.exception;

import com.example.CRUD_Operation.exception.custom.NoSuchUserExist;
import com.example.CRUD_Operation.response.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    //@ExceptionHandler(NoSuchUserExist.class)
//    public ResponseEntity<ErrorResponse> noSuchUserExist(NoSuchUserExist ex)
//    {
//        String message= ex.getMessage();
//        HttpStatus httpStatus=ex.getHttpStatus();
//        ErrorResponse errorResponse=new ErrorResponse(message,httpStatus.name());
//       // return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
//        //return ResponseEntity.status(httpStatus).body(errorResponse);
//        return ResponseEntity.status(httpStatus).body(errorResponse);
//    }
    @ExceptionHandler(NoSuchUserExist.class)
    protected ResponseEntity<ErrorResponse> handleException(GenericException exception, WebRequest request, HttpServletRequest response) {
        //log.error(exception.getMessage());
        HttpStatus httpStatus = exception.getHttpStatus();
        Integer errorCode = httpStatus.value();
        String errorMessage = exception.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(errorCode, errorMessage, httpStatus.name());
        return ResponseEntity.status(httpStatus).body(errorResponse);
    }
}
