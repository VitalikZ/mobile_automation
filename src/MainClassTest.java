import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int number = MainClass.getLocalNumber();

        if (number == 14) {
        } else System.out.println("The number is wrong");
    }

    @Test
    public void testGetClassNumber() {
        int number = MainClass.getClassNumber();

        if (number < 45) {
        }  else System.out.println("The number is wright");
    }

    @Test
    public void testGetClassString () {

        String text = MainClass.getClassString();

        if (text.contains("hello")) {
            System.out.println("The expression is right");
        } else if (text.contains("Hello")){
            System.out.println("The expression is right");
        } else {
            System.out.println("The expression is wrong");
        }

    }
}
