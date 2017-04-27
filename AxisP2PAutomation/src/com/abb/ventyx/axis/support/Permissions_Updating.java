package com.abb.ventyx.axis.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abb.ventyx.utilities.ALM;
import com.abb.ventyx.utilities.BaseGrid;
import com.abb.ventyx.utilities.BaseTestCase;
import com.abb.ventyx.utilities.Credentials;
import com.abb.ventyx.axis.objects.pagedefinitions.AxisConfigMenu;
import com.abb.ventyx.axis.objects.pagedefinitions.Messages;
import com.abb.ventyx.axis.objects.pagedefinitions.Permissions;
import com.ventyx.testng.TestDataKey;

@ALM(id = "155") 
@Credentials(user = "5", password = "testuser")
public class Permissions_Updating extends BaseTestCase {
	@TestDataKey private final String PERMISSION_NAME_A = "AA_MAINTAIN_PERMISSION";
	@TestDataKey private final String PERMISSION_NAME_B = "Export PO ABB";
	BaseGrid grid;
	int row;
	@Test
	  public void updatePermission() throws Exception {
		   // Create Permission 
		    WebElement axisConfigParentButton = (new WebDriverWait(driver, 60))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(AxisConfigMenu.AXIS_CONFIGURATION)));
		    axisConfigParentButton.click();
		    WebElement axisConfigPermission = (new WebDriverWait(driver, 60))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(AxisConfigMenu.PERMISSIONS)));
		    axisConfigPermission.click();
		    grid = new BaseGrid(driver, Permissions.GRID);
		    row = grid.findItemByColumnName("Permission Name", PERMISSION_NAME_B);
		    driver.findElement(By.id("permissionIdBtn" + (row-1))).click();
		    WebElement permissionName = driver.findElement(By.id(Permissions.PERMISSION_NAME));
		    permissionName.clear();
		    permissionName.sendKeys(PERMISSION_NAME_A);
		    driver.findElement(By.id(Permissions.SAVE)).click();
		    WebElement flashMessage = (new WebDriverWait(driver, 60))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Permissions.POPUP_SUCCESS)));
		    Assert.assertEquals(driver.findElement(By.cssSelector(Permissions.POPUP_SUCCESS)).getCssValue("background-color"), "rgba(33, 190, 137, 1)");
		    Assert.assertEquals(flashMessage.getCssValue("visibility"), "visible");
		    Assert.assertEquals(flashMessage.getCssValue("display"), "block");
		    Assert.assertEquals(flashMessage.getText(), Messages.PERMISSION_UPADTED_SUCCESSFULLY);
		    
	}
	   @Test(dependsOnMethods = "updatePermission")
			public void returnPermissionToOriginalValue (){
		    grid = new BaseGrid(driver, Permissions.GRID); 
		    row = grid.findItemByColumnName("Permission Name", PERMISSION_NAME_A);
		    Assert.assertNotEquals(row, -1, "Record not found");
		    driver.findElement(By.id("permissionIdBtn" + (row-1))).click();
		    WebElement permissionName = (new WebDriverWait(driver, 60))
		  			.until(ExpectedConditions.presenceOfElementLocated(By.id(Permissions.PERMISSION_NAME)));
		    permissionName.clear();
		    permissionName.sendKeys(PERMISSION_NAME_B);
		    driver.findElement(By.id(Permissions.SAVE)).click();
	}	    
}



