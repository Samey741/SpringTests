import org.example.FireAlarm;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFireAlarm {

    @Test
   @Parameters({"v1", "v2"})
    public void Sum(int v1, int v2) {
        FireAlarm fireAlarm = new FireAlarm();
        Assert.assertEquals(fireAlarm.Sum(v1,v2),6,"wrong");
    }
}
