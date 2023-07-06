import org.example.CamSystem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCamSystem extends MyTest{

    private CamSystem camSystem = new CamSystem();

    @Test(invocationCount = 3)
    public void loadSPZ(){
        camSystem.loadSPZ();
        //Assert.fail();
    }

    @Test(dependsOnMethods = "loadSPZ")
    public void takePictureOfSPZ(){
       camSystem.takePictureOfSPZ();
    }

}
