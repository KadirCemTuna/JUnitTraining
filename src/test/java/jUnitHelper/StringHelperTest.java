package jUnitHelper;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.jupiter.api.Assertions.*;


public class StringHelperTest {

  private static StringHelper stringHelper;

  @BeforeClass
  public static void beforeclass(){
    System.out.println("before class");
  }

  @Before
  public void sep() {
    stringHelper = new StringHelper();
    System.out.println("before each");
  }

  @Test
  public void truncateAInFirst2Positions() {
    assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    System.out.println("Test1 done!");
  }

  @Test
  public void truncateAInFirstPosition() {
    assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    System.out.println("Test2 done!");
  }


  @Test
  public void areFirstAndLastTwoCharactersTheSame() {
    assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("abab"));
    System.out.println("Test positive done!");
  }

  @Test
  public void areFirstAndLastTwoCharactersTheSameNegative() {
    assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("abascasd"));
    System.out.println("Test negative done!");
  }

  @AfterClass
  public static void teardown() {
    System.out.println("done!");
  }

}