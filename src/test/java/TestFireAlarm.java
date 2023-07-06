import org.example.FireAlarm;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFireAlarm extends MyTest{

    private FireAlarm fireAlarm = new FireAlarm();

    @Test(dataProvider = "co2DataProvider")
    public void chekCO2(int par1) {
        fireAlarm.checkCO2(par1);
    }

    @Test(dataProvider = "co2DataProvider")
    public void switchOnSpeaker(int par1) {
        fireAlarm.switchOnSpeaker(par1);
    }

    @DataProvider(name = "co2DataProvider")
    public Object[][] co2DataProvider() {
        return new Object[][] {
                {1}, // Argument 1
                {2}, // Argument 2
                {3}  // Argument 3
        };
    }

}
