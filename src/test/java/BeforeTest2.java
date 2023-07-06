import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;

public class BeforeTest2 {
    @BeforeTest
    public void printTestName2(ITestContext iTestContext){
        System.out.println(iTestContext.getCurrentXmlTest().getName());
        System.out.println(iTestContext.getCurrentXmlTest().getIndex() + "\n");
    }
}
