package com.integrallis.domain;

import java.io.Serializable;
import java.util.Date;

public class Author implements Serializable {
  private String firstName;
  private String lastName;
  private Date birthDate;
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String f) {
    firstName = f;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String s) {
    lastName = s;
  }
  
  public Date getBirthDate() {
    return birthDate;
  }
  
  public void setBirthDate(Date d) {
    birthDate = d;
  }
}