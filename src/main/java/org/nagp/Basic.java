package org.nagp;

public class Basic {

  public Basic(){

  }

  public int compareNumbers(int number1, int number2){
    if(number1<number2){
      return 1;
    } else if (number1>number2) {
      return -1;
    }
    return 0;
  }


}
