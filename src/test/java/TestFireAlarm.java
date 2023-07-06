import org.example.FireAlarm;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFireAlarm extends MyTest{

    private FireAlarm fireAlarm = new FireAlarm();

    @Test
    @Parameters({"par1"})
    public void chekCO2(int par1) {
        fireAlarm.checkCO2(par1);
    }

    @Test
    @Parameters({"par1"})
    public void switchOnSpeaker(int par1){
        fireAlarm.switchOnSpeaker(par1);
    }

}
