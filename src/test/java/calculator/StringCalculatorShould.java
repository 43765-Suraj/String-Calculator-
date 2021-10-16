package calculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class StringCalculatorShould {

    @Test
    public void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    public void twoNumbersCommaDeliminatedReturnSum() throws Exception {
    	  StringCalculator stringCalculator = new StringCalculator();
          assertEquals(3, stringCalculator.add("1,2"));
    }
    @Test
    public void twoNumbersSeprateLineDeliminatedReturnSum() throws Exception {
    	  StringCalculator stringCalculator = new StringCalculator();
          assertEquals(3, stringCalculator.add("1\n2"));
    }
    @Test
    public void threeNumbersDeliminatedBothWaysReturnSum() throws Exception {
    	 StringCalculator stringCalculator = new StringCalculator();
         assertEquals(6, stringCalculator.add("1,2,3"));
    }
    @Test(expectedExceptions = Exception.class)
    public void negativeInputsReturnException() throws Exception {
   	 StringCalculator stringCalculator = new StringCalculator();
      stringCalculator.add("-1");
    }
    
    public void ignoresNumbersGreaterThan1000() throws Exception {
    	 StringCalculator stringCalculator = new StringCalculator();
         assertEquals(20, stringCalculator.add("10,10,1001"));
    }
}