package jUnitHelper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

  StringHelper stringHelper = new StringHelper();

  @Test
  void truncateAInFirst2Positions() {
    assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
  }

  @Test
  public void truncateAInFirstPosition() {
    assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
  }


  @Test
  public void areFirstAndLastTwoCharactersTheSame() {
    assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("abab"));
  }

  @Test
  public void areFirstAndLastTwoCharactersTheSameNegative(){
    assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("abascasd"));
  }

}