import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OtusTest {

    @Before
    public void setUpTests() {
        System.out.println("setUp");

    }

    @Test
    public void firstTest() {
        System.out.println("testStart");
        Assert.assertEquals("It's very strange", 0, 0);
        System.out.println("testEnd");
    }

    @Test
    public void secondTest() {
        System.out.println("testStart");
        Assert.assertEquals("0!=1 In's OK", 0, 1);
        System.out.println("testEnd");
    }

    @After
    public void TierDownTests() {
        System.out.println("tierDown");
    }
}
