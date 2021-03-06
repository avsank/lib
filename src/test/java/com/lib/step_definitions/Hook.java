package com.lib.step_definitions;

import com.lib.utilities.ConfigurationReader;
import com.lib.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    @Before
    public void setUpScenario(){
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }


    @After
    public void tearDownScenario(Scenario scenario){
        //if my scenario failed
        // go and take screen shot

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }


        Driver.closeDriver();

    }

    @BeforeStep
    public void runBeforeSteps(){
        System.out.println("________________Running Before Each STEP ________________");

    }

    @AfterStep
    public void runsAfterSteps(){
        System.out.println("________________Running AFTER Each STEP ________________");
    }

}
