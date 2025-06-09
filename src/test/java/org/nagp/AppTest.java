package org.nagp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

  @Test
  public void compareStrings(){
    App app1 = new App();
    App app2 = new App();
    Assert.assertEquals(app1.getMessage(), app2.getMessage(),"Strings are not equal");
  }

}