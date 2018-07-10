package com.Selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLoaction_Industry {

	public static void main(String[] args) {
		
		FirefoxDriver di = new FirefoxDriver();
		di.get("https://my.monsterindia.com/sponsered_popup.html");
//select class="border_grey1" size="4" style="width:196px;" name="currentloc">		
//html/body/metaã/table/tbody/tr[1]/td/form/table/tbody/tr[6]/td[3]/select		
	
//WebElement currentlocation=di.findElementByClassName("border_grey1");		
		
//Select selection = new Select(currentlocation);
Select selection = new Select(di.findElementByClassName("border_grey1"));

selection.selectByIndex(1);
//selection.selectByValue("3");
selection.selectByVisibleText("Agra");

//<select id="id_industry" multiple="multiple" onchange="loadFA(this,document.POPUNDER.jobCategory,''); displayAllFunction();" size="4" name="industry">

WebElement industry=di.findElementById("id_industry");

Select select = new Select(industry);
select.selectByVisibleText("Education");
select.selectByVisibleText("Insurance");

	}

}
