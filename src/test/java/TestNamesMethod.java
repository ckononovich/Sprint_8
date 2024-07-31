import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestNamesMethod {

    public TestNamesMethod(String name) {
        this.name = name;
    }
    private final String name;

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"Test Name"},
                {"Test  Name2"},
                {"Test name long one"},
                {"t"},
                {" Test"},
                {"test   "},
                {"44444444444444444444444444444444444444444444444444444444444444444444444"},
        };
    }

    @Test
    public void testAccountMethodNames(){
        Account nameTest = new Account(name);
        boolean actualResult = nameTest.checkNameToEmboss();
        Assert.assertEquals(nameTest.checkNameToEmboss(), actualResult);
    }
}
