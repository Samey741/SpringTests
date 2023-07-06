import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;

public class BeforeTest1 {

    @BeforeTest
    public void printTestName1(ITestContext iTestContext){
        System.out.println(iTestContext.getCurrentXmlTest().getParameter("par1"));
    }
}
