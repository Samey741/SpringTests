import org.example.Ramp;
import org.testng.annotations.Test;

public class TestRamp extends MyTest{

    private Ramp ramp = new Ramp();

    @Test
    public void lift(){
        ramp.lift();
    }
    @Test
    public void lowerTheLamp(){
        ramp.lowerTheLamp();
    }

}
