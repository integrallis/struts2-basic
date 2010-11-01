package com.integrallis.exceptions;

import java.lang.RuntimeException;

public class NotFoundException extends RuntimeException {

  public NotFoundException() {
    super();
  }
  
  public NotFoundException(String s) {
    super(s);
  }  
}