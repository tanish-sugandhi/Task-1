package com.example.CRUD_Operation.exception.custom;

import com.example.CRUD_Operation.exception.GenericException;
import org.springframework.http.HttpStatus;

public class NoSuchUserExist extends GenericException {
     public NoSuchUserExist(String message, HttpStatus httpStatus){
           super(message, httpStatus);
     }
}
