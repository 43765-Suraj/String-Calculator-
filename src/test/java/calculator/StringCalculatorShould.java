package calculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class StringCalculatorShould {

    @Test
    public void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();  
        // An Empty String return Zero
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void string_with_single_number_should_return_number_as_int() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();   
    	// Single number return the value
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    public void twoNumbersCommaDeliminatedReturnSum() throws Exception {   
    	  StringCalculator stringCalculator = new StringCalculator(); 
    	// Two numbers comma deliminated ,return the sum
          assertEquals(3, stringCalculator.add("1,2"));
    }
    @Test
    public void twoNumbersSeprateLineDeliminatedReturnSum() throws Exception {
    	  StringCalculator stringCalculator = new StringCalculator(); 
    	  // Two numbers Seperated Line deliminated returns sum 
          assertEquals(3, stringCalculator.add("1\n2"));
    }
    @Test
    public void threeNumbersDeliminatedBothWaysReturnSum() throws Exception {
    	 StringCalculator stringCalculator = new StringCalculator(); 
    	    	//Three numbers deliminated either way,return the sum

         assertEquals(6, stringCalculator.add("1,2,3"));
    }
    @Test(expectedExceptions = Exception.class)
    public void negativeInputsReturnException() throws Exception {
         StringCalculator stringCalculator = new StringCalculator();
       //Negative value throw an Exception
         stringCalculator.add("-1");
    }
    
    public void ignoresNumbersGreaterThan1000() throws Exception {
    	 StringCalculator stringCalculator = new StringCalculator();
     	//Numbers greater than 1000 are ignored!
         assertEquals(20, stringCalculator.add("10,10,1001"));
    }
}
