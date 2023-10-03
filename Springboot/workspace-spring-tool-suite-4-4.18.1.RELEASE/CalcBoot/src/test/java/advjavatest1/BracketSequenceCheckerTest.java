package advjavatest1;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import Advajavaassesment.Bracket_Sequence_Checker; 

class BracketSequenceCheckerTest { 

	Bracket_Sequence_Checker obj = new Bracket_Sequence_Checker();
    String i = "(a+[b*c]-{d/3})";
    String j = "(a + [b * c) - 17]";

 

    @Test
    public void BracketSequenceCheckerTestCase() {
        int expectedResult = 1;
        @SuppressWarnings("static-access")
        int result = obj.checkBracketSequence(i);

 

        assertEquals(expectedResult, result);

 

    }

    @Test
    public void BracketSequenceCheckerTestCase1() {
        int expectedResult = 0;
        @SuppressWarnings("static-access")
        int result = obj.checkBracketSequence(j);

 

        assertEquals(expectedResult, result);

 

    }

 

}