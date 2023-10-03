package advjavatest1;
import Advajavaassesment.Persistence;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


 

class PersistenceTest {

 

    Persistence obj = new Persistence();
    int i = 999;

 

    @Test
    public void PersistenceTestCase() {
        int expectedResult = 4;
        @SuppressWarnings("static-access")
        int result = obj.persistence(i);

 

        assertEquals(expectedResult, result);

 

    }

 

}