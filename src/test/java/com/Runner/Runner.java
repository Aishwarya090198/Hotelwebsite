package com.Runner;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\featurefile.feature",
glue="src\\test\\java\\com\\stepdefinition\\StepDefinition.java")
public class Runner {
	
	public static WebDriver driver;
	
	public class Mytest{
		@BeforeClass
		private void setup() {
			driver=BaseClass.Browser_Launch("chrome");
		}
	}
	}
