package advjavatest1;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import Advajavaassesment.JavalandBuildingJumps;

public class JavalandBuildingJumpsTest {
	JavalandBuildingJumps obj = new JavalandBuildingJumps();
    int N=6;
    int K=2;
    int[] heights= {3, 1, 5, 1, 4, 3};

 

    @Test
    public void BracketSequenceCheckerTestCase() {
        int expectedResult = 3;
        @SuppressWarnings("static-access")
        int result = obj.minimumJumps(N,K,heights);

 

        assertEquals(expectedResult, result);

 

    }

}
