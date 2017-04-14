package com.abb.ventyx.axis.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abb.ventyx.utilities.ALM;
import com.abb.ventyx.utilities.BaseGrid;
import com.abb.ventyx.utilities.BaseTestCase;
import com.abb.ventyx.utilities.Credentials;
import com.abb.ventyx.axis.objects.pagedefinitions.AxisConfigMenu;
import com.abb.ventyx.axis.objects.pagedefinitions.DocType;
import com.abb.ventyx.axis.objects.pagedefinitions.Messages;
import com.ventyx.testng.TestDataKey;

@ALM(id = "159") 
@Credentials(user = "5", password = "testuser")
public class Document_Type_Editing extends BaseTestCase {
	@TestDataKey private final String DOCTYPE_B = "Abb";
	@TestDataKey private final String DESC_B = "UPDATED SECOND TIME";
	@TestDataKey private final String DESC_A = "AA_MAINTAIN_DOCTYPES";
	BaseGrid grid;
	int row;
	@Test
	  public void Update() throws Exception {
		
		    WebElement axisConfigParentButton = (new WebDriverWait(driver, 60))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(AxisConfigMenu.AXIS_CONFIGURATION)));
		    axisConfigParentButton.click();
		  
		    WebElement axisDocType = (new WebDriverWait(driver, 60))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(AxisConfigMenu.DOC_TYPE)));
		    axisDocType.click();
		    
		    // Step 1 Update the record from Add New step.
		    grid = new BaseGrid(driver, DocType.GRID);
		    row = grid.findItemByColumnName("Document Types", DOCTYPE_B);
		    Assert.assertNotEquals(row, -1, "Record not found");
		    driver.findElement(By.id("docTypeBtn" + (row-1))).click();
		    boolean status = driver.findElement(By.id(DocType.DOCTYPES)).isEnabled();
		    Assert.assertEquals(status, false);
		    WebElement desc = driver.findElement(By.id(DocType.DESC));
		    desc.clear();
		    desc.sendKeys(DESC_B);
		    WebElement save = driver.findElement(By.id(DocType.SAVE));
		    save.click();
		    WebElement flashMessage = (new WebDriverWait(driver, 10))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(DocType.SUCCESS_MESSAGE)));
		    Assert.assertEquals(driver.findElement(By.cssSelector(DocType.POPUP_SUCCESS)).getCssValue("background-color"), "rgba(33, 190, 137, 1)");
		    Assert.assertEquals(flashMessage.getCssValue("visibility"), "visible");
		    Assert.assertEquals(flashMessage.getCssValue("display"), "inline-block");
		    Assert.assertEquals(flashMessage.getText(), Messages.DOCUMENT_UPADTED_SUCCESSFULLY);
		    grid = new BaseGrid(driver, DocType.GRID);
		    final String DOCTYPE_C = grid.getGridCellByColumnName("Document Types",row);
		    final String DESC_C = grid.getGridCellByColumnName("Description",row);
		 
		   //Step 2 Compare Values before and after updating.
		    Assert.assertEquals(DOCTYPE_C, DOCTYPE_B);
		    Assert.assertEquals(DESC_C, DESC_B);
		   			    
		   //Step 3 Return Document type to its original value.
		    driver.findElement(By.id("docTypeBtn" + (row-1))).click();
		    WebElement desc2 = driver.findElement(By.id(DocType.DESC));
		    desc2.clear();
		    desc2.sendKeys(DESC_A);
		    driver.findElement(By.id(DocType.SAVE)).click();
		    WebElement flashMessage2 = (new WebDriverWait(driver, 10))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(DocType.SUCCESS_MESSAGE)));
		    Assert.assertEquals(driver.findElement(By.cssSelector(DocType.POPUP_SUCCESS)).getCssValue("background-color"), "rgba(33, 190, 137, 1)");
		    Assert.assertEquals(flashMessage2.getCssValue("visibility"), "visible");
		    Assert.assertEquals(flashMessage2.getCssValue("display"), "inline-block");
		    Assert.assertEquals(flashMessage2.getText(), Messages.DOCUMENT_UPADTED_SUCCESSFULLY);
		    
   }	    
}
