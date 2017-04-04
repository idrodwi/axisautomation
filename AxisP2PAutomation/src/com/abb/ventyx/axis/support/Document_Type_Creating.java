package com.abb.ventyx.axis.support;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.Test;

import com.abb.ventyx.utilities.ALM;
import com.abb.ventyx.utilities.BaseGrid;
import com.abb.ventyx.utilities.BaseTestCase;
import com.abb.ventyx.utilities.Credentials;
import com.abb.ventyx.axis.objects.pagedefinitions.AxisConfigMenu;
import com.abb.ventyx.axis.objects.pagedefinitions.DocType;
import com.abb.ventyx.axis.objects.pagedefinitions.Messages;

@ALM(id = "158") 
@Credentials(user = "5", password = "testuser")
public class Document_Type_Creating extends BaseTestCase {
	private final String DOCTYPE_B = "Abb";
	private final String DESC_B = "AA_MAINTAIN_DOCTYPES";
	BaseGrid grid;
	@Test
	public void Document_Type_Create(){
		   // Create Permission 
		    WebElement axisConfigParentButton = (new WebDriverWait(driver, 10))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(AxisConfigMenu.AXIS_CONFIGURATION)));
		    axisConfigParentButton.click();
		    //Document Types is unique.
		    driver.findElement(By.cssSelector(AxisConfigMenu.DOC_TYPE)).click();
		    
		    grid = new BaseGrid(driver, DocType.GRID);
		    driver.findElement(By.cssSelector(DocType.ADD)).click();
		    driver.findElement(By.id(DocType.DOCTYPES)).click();
		    driver.findElement(By.id(DocType.DOCTYPES)).sendKeys(DOCTYPE_B);
		    driver.findElement(By.id(DocType.DESC)).click();
		    driver.findElement(By.id(DocType.DESC)).sendKeys(DESC_B);
		    driver.findElement(By.id(DocType.SAVE)).click();
	}
	@Test(dependsOnMethods ="Document_Type_Create")
	public void Checking_Message(){
//		    WebElement flashDialogue = (new WebDriverWait(driver, 10))
//		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(DocType.CONFIRM_DAILOGUE)));
//		    Assert.assertEquals(flashDialogue.getCssValue("visibility"), "visible");
		    WebElement flashMessage = (new WebDriverWait(driver, 10))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(DocType.SUCCESS_MESSAGE)));
		    Assert.assertEquals(flashMessage.getCssValue("visibility"), "visible");
		    Assert.assertEquals(flashMessage.getCssValue("display"), "inline-block");
		    Assert.assertEquals(flashMessage.getCssValue("color"), "rgba(255, 255, 255, 1)");
		    Assert.assertEquals(flashMessage.getText(), Messages.DOCUMENT_CREATE_SUCCESSFULLY);
		    
		    System.out.println(flashMessage.getText());
		    grid = new BaseGrid(driver, DocType.GRID);
		    Assert.assertNotEquals(grid.findItemByColumnName("Document Types", "Abb"),-1,"Data not created");
		   			    
   }	    
}




