import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxNumberTest {
    @Test
    void MaxNumber(){
        MaxNumberService service = new MaxNumberService();
        int expected = 10;
        int actual = service.max(10, 9);
        Assertions.assertEquals(expected, actual);
    }
}
