package program1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class projectTest1 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void afterClassTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterClassTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterClassTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterMethodTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterMethodTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterMethodTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterSuiteTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterSuiteTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterSuiteTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void afterTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeClassTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeClassTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeClassTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeMethodTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeMethodTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeMethodTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeSuiteTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeSuiteTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeSuiteTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeTestTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void dpTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void dpTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void dpTestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void fTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void tstmdTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void tstmdTestTest() {
    throw new RuntimeException("Test not implemented");
  }
}
