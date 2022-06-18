import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    //in TestNg methods are not static. And void. And use special annotation @Test. And class Assert for comparing
        public void testAbbr4(){
        String result = Main.abbr("Anna", 4);
        Assert.assertEquals(result, "A...-");

        }

    @Test
    //in TestNg methods are not static. And void. And use special annotation @Test. And class Assert for comparing
    public void testAbbr5(){
        String result = Main.abbr("Hello world", 8);
        Assert.assertEquals(result, "Hello...");

    }

    }

