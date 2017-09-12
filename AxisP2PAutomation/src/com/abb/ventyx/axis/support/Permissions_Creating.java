package com.abb.ventyx.axis.support;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.abb.ventyx.axis.objects.pagedefinitions.AxisConfigMenu;
import com.abb.ventyx.axis.objects.pagedefinitions.Messages;
import com.abb.ventyx.axis.objects.pagedefinitions.Permissions;
import com.abb.ventyx.axis.objects.pagedefinitions.ScreenObjects;
import com.abb.ventyx.utilities.ALM;
import com.abb.ventyx.utilities.BaseTestCase;
import com.abb.ventyx.utilities.Credentials;
import com.abb.ventyx.utilities.PermissionsAction;
import com.abb.ventyx.utilities.ScreenAction;
import com.ventyx.testng.TestDataKey;

@ALM(id = "106")
@Credentials(user = "mail5@abb.com", password = "testuser")
public class Permissions_Creating extends BaseTestCase {
	@TestDataKey
	private final String PERMISSION_NAME_A = "AA_MAINTAIN_PERMISSION";
	@TestDataKey
	private final String DOCUMENT_TYPE_A = "PurchaseOrderAcknowledgement";
	@TestDataKey
	private final String USER_TYPE_A = "A";
	@TestDataKey
	private final String ADDPERMISSIONHEADER = "Add Permission";
	@TestDataKey
	private final String MAINTAINPERMISSIONHEADER = "Maintain Permissions";

	@Test
	public void createPermission() throws Exception {
		PermissionsAction permissionsAction = new PermissionsAction(driver);
		ScreenAction action = new ScreenAction(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		// Step 1
		permissionsAction.clickSystemConfigurationMenu();
		permissionsAction.clickPermissionsSubMenu();

		// Check there is any permission AA_MAINTAIN_PERMISSION existing
		permissionsAction.filterPermission(PERMISSION_NAME_A);
		int numberOfRowsBeforeAdding = permissionsAction.countRow(Permissions.TABLEBODY);
		System.out.print(numberOfRowsBeforeAdding + "numberOfRowsBeforeAdding");

		// Step 2
		permissionsAction.clickAddButton();
		permissionsAction.enterPermissionName(PERMISSION_NAME_A);
		permissionsAction.selectDocumentType(Permissions.PURCHASE_ORDER_ACK);
		permissionsAction.selectUserType(Permissions.AXIS_ADMIN);
		
		// Step 3, 4
		permissionsAction.clickSaveButtonOnAddPermisisonPopUp();
		assertEquals(
				driver.findElement(
						By.cssSelector(Messages.PERMISSION_CREATED_SUCCESSFULLY_CSS))
						.getText(), Messages.PERMISSION_CREATED_SUCCESSFULLY);
		// Filter
		permissionsAction.enterValueTofilterPermission(PERMISSION_NAME_A);
		Thread.sleep(2000);
		int numberOfRowsAfterAdding = permissionsAction.countRow(Permissions.TABLEBODY);

		assertEquals(numberOfRowsBeforeAdding + 1, numberOfRowsAfterAdding);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector(Permissions.PNROW1)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector(Permissions.UTROW1)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector(Permissions.DTROW1)));

		assertEquals(
				driver.findElement(
						By.xpath("//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']//tr["
								+ numberOfRowsAfterAdding + "]//td[2]"))
						.getText(), DOCUMENT_TYPE_A);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']//tr["
								+ numberOfRowsAfterAdding + "]//td[3]"))
						.getText(), PERMISSION_NAME_A);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']//tr["
								+ numberOfRowsAfterAdding + "]//td[4]"))
						.getText(), USER_TYPE_A);
		Thread.sleep(1000);

		// Step 5
		permissionsAction.clickAddButton();

		// Step 6
		permissionsAction.clickSaveButtonOnAddPermisisonPopUp();
		Thread.sleep(1000);
		assertEquals(
				driver.findElement(
						By.cssSelector(ScreenObjects.ERROR_WITHOUT_ICON_CSS))
						.getText(), Messages.EMPTYPERMISSIONNAME);

		// Step 7
		permissionsAction.enterPermissionName("ECHO 1");
		permissionsAction.clickSaveButtonOnAddPermisisonPopUp();
		assertEquals(
				driver.findElement(
						By.cssSelector(ScreenObjects.ERROR_WITHOUT_ICON_CSS))
						.getText(), Messages.EMPTYUSERTYPE);
		Thread.sleep(2000);

		// Step 8
		permissionsAction.clickCancelButtonOnAddPermisisonPopUp();
		assertEquals(
				driver.findElement(
						By.cssSelector(Permissions.CONFIRMATION_OF_DELETION))
						.getText(), Messages.UNSAVED_CHANGE);

		// Step 9
		driver.findElement(By.id(ScreenObjects.NO_BTN_ID)).click();
		Thread.sleep(1000);
		assertEquals(
				driver.findElement(
						By.cssSelector(Permissions.ADDPERMISSIONHEADER))
						.getText(), ADDPERMISSIONHEADER);

		// Step 10
		permissionsAction.clickCancelButtonOnAddPermisisonPopUp();
		driver.findElement(By.id(ScreenObjects.YES_BTN_ID)).click();
		Thread.sleep(1000);
		assertEquals(
				driver.findElement(By.cssSelector(Permissions.PERMISSIONHEADER))
						.getText(), MAINTAINPERMISSIONHEADER);

		// Step 11
		permissionsAction.clickAddButton();
		permissionsAction.clickCancelButtonOnAddPermisisonPopUp();
		
		assertEquals(action.isElementPresent(By.cssSelector(Permissions.CONFIRMATION_OF_DELETION)), false);
		assertEquals(action.isElementPresent(By.cssSelector(Permissions.ADDPERMISSIONHEADER)), false);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector(Permissions.PERMISSIONHEADER)));
		assertEquals(
				driver.findElement(By.cssSelector(Permissions.PERMISSIONHEADER))
						.getText(), MAINTAINPERMISSIONHEADER);

	}
}
