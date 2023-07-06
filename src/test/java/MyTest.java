import org.testng.annotations.BeforeClass;

import java.time.LocalDateTime;

public abstract class MyTest {

    @BeforeClass
    public void init() {
        System.out.println("Initializing test class: " + this.getClass().getSimpleName());
        System.out.println("Current time: " + LocalDateTime.now());
        System.out.println("------------------------------------------------ \n");
    }
}
