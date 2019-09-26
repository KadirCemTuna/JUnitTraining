package jUnitHelper;

import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class QuickBeforeAfterTest {

  StringHelper stringHelper;

  @Before
  public void setup(){
   System.out.println("Before Tests.");
  }

  @Test
  public void basictest1(){
   System.out.println("test1 executed.");
  }

  @Test
  public void basictest2(){
   System.out.println("test2 executed.");
  }
 }
