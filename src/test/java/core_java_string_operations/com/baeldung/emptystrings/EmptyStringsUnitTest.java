package core_java_string_operations.com.baeldung.emptystrings;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmptyStringsUnitTest {

	private String emptyString = "";
    private String blankString = "  \n\t  ";
    private String nonEmptyString = "   someString   ";
    
    /*
     * Empty check
     */
    @Test
    public void givenSomeEmptyString_thenEmptyStringCheckIsEmptyStringReturnsTrue() {
    	assertTrue(new EmptyStringCheck().isEmptyString(emptyString));
    }
}
