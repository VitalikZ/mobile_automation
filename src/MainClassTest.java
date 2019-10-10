import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int number = MainClass.getLocalNumber();

        if (number == 14) {
        } else System.out.println("The number is wrong");
    }
}
