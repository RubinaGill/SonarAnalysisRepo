package org.nagp;

public class App {

  public App(){
  }

  public final static String MESSAGE ="Hello world!";
  public static void main(String[] args) {
    System.out.println(MESSAGE);
  }

  public String getMessage(){
    return MESSAGE;
  }
}