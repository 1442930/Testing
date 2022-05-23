package com.example.FirstTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/com/example/FirstTest/features/search.feature",
        glue = "com.example.FirstTest.Steps"

)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
