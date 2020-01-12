package test.Example1
import org.junit.Assert._
import org.junit._
import Example1.StringReverse


@Test
class TestStringReverse {
  
  @Test
  def testReverse1={
    
    assertEquals("ilaw", StringReverse.reverse1("wali"))
  }
  
  @Test
  def testReverse2={
    assertEquals("ilaw", StringReverse.reverse2("wali"))
  }
  
}

