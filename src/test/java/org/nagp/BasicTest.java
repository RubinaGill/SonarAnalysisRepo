package org.nagp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

  @Test
  public void testCompareNumbers() {
    Basic basic1 = new Basic();
    Assert.assertEquals(0,basic1.compareNumbers(1,1),"numbers are not equal");
  }
}