package org.runnerpar;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "C:\\Users\\DELL 7450\\Desktop\\eclipse\\MavenCucumberParallel\\src\\test\\resources\\Feature\\LoginFeaturepar.Feature", glue = "org.stepdefin.par",monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests{	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
