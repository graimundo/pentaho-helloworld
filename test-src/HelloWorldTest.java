import junit.framework.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void helloWorldTest() {

        String helloWorldString = HelloWorld.main(null);
        Assert.assertEquals(helloWorldString, "Hello, World!");
    }
}