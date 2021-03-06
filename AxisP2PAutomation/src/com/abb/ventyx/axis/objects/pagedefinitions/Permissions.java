package com.abb.ventyx.axis.objects.pagedefinitions;

public class Permissions {
	public static final String MAINTAIN_PERMISSIONS = "Maintain Permissions";
	public static final String ADD_PERMISSIONS = "Add Permission";
	public static final String PERMISSION_CSS = "#permissioncreatewindow > div > div > div.v-window-contents > div > div > div.v-slot.v-slot-v-default-page-header-layout > div > div > div > div";

	public static final String GRID = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > tbody";
	public static final String TABLEBODY = "//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']";
	public static final String GRID_PERMISSIONIDCELL = "//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']//tr[1]//td[1]//div[@class='cr-component-cell']//div[@tabindex=0]";
	public static final String GRID_DOCTYPECELL = "//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']//tr[1]//td[2]";
	public static final String GRID_PERMISSIONNAMECELL = "//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']//tr[1]//td[3]";
	public static final String USERTYPECELL = "//div[@class='v-grid-tablewrapper']//table//tbody[@class='v-grid-body']//tr[1]//td[4]";
	public static final String ADD = "#HeaderMenuBar > span:nth-child(2) > span > span";
	public static final String PERMISSION_ID_FILTER = "(//input[@id='filterField'])[1]";
	public static final String DOCUMENT_TYPE = "doc_type";
	public static final String DOCUMENT_TYPE_FILTER = "(//input[@id='filterField'])[2]";
	public static final String PERMISSION_NAME_COLUMN = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > thead > tr:nth-child(1) > th:nth-child(3) > div.v-grid-column-header-content.v-grid-column-default-header-content";
	public static final String PERMISSION_NAME = "permissionName";
	public static final String PERMISSION_NAME_FILTER = "(//input[@id='filterField'])[3]";
	public static final String DOC_TYPE_FILTER = "(//input[@id='filterField'])[2]";
	public static final String SYSTEM = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(1) > td > span";
	public static final String ADVANCED_SHIPPING_NOTICES = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(2) > td > span";
	public static final String INVOICING = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(3) > td > span";
	public static final String PURCHASE_ORDERS = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(4) > td > span";
	public static final String PURCHASE_ORDER_ACK = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(5) > td";
	public static final String REMITTANCE_ADVICES = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(6) > td > span";
	public static final String TEST_DOCUMENT_TYPE = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(7) > td > span";
	public static final String TESTING = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody > tr:nth-child(8) > td > span";
	public static final String SAVE = "createEditBtn";
	public static final String CANCEL = "cancelBtn";
	public static final String CONFIRMATION_OF_DELETION = "#confirmation-window > div > div > div.v-window-contents > div > div > div.v-slot.v-slot-v-confirmation-window-text-and-button-layout > div > div:nth-child(1) > div";
	public static final String DELETE_YES = "#confirmation-window > div > div > div.v-window-contents > div > div > div.v-slot.v-slot-v-confirmation-window-text-and-button-layout > div > div.v-slot.v-slot-v-bottombar-button-layout.v-align-right.v-align-middle > div > div:nth-child(3) > div";
	public static final String DELETE_NO = "#confirmation-window > div > div > div.v-window-contents > div > div > div.v-slot.v-slot-v-confirmation-window-text-and-button-layout > div > div.v-slot.v-slot-v-bottombar-button-layout.v-align-right.v-align-middle > div > div:nth-child(1) > div";
	public static final String USER_TYPE = "permissionUserType";
	public static final String USER_TYPE_FILTER = "(//input[@id='filterField'])[4]";
	public static final String AXIS_ADMIN = "#permissionUserType > span:nth-child(1) > label";
	public static final String CUSTOMER = "#permissionUserType > span:nth-child(2) > label";

	public static final String CUSTOMER_CHECKBOX = "#permissionUserType > span:nth-child(2) > input[type='checkbox']";
	public static final String SUPPLIER = "#permissionUserType > span:nth-child(3) > label";
	public static final String SUPPLIER_CHECKBOX = "#permissionUserType > span:nth-child(3) > input[type='checkbox']";
	public static final String FILTER = "filterField";
	public static final String ROW0 = "permissionIdBtn0";
	public static final String ROW1 = "permissionIdBtn1";
	public static final String ROW2 = "permissionIdBtn2";
	public static final String ROW3 = "permissionIdBtn3";
	public static final String PNROW1 = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > tbody > tr:nth-child(1) > td:nth-child(3)";
	public static final String PNROW2 = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > tbody > tr:nth-child(2) > td:nth-child(3)";
	public static final String UTROW1 = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > tbody > tr:nth-child(1) > td:nth-child(4)";
	public static final String UTROW2 = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > tbody > tr:nth-child(2) > td:nth-child(4)";
	public static final String DTROW1 = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > tbody > tr:nth-child(1) > td:nth-child(2)";
	public static final String PIROW1 = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > tbody > tr:nth-child(1) > td:nth-child(1)";
	public static final String DELETE0 = "deleteItemBtn0";
	public static final String DELETE1 = "deleteItemBtn1";
	public static final String DELETE2 = "deleteItemBtn2";
	public static final String DELETE45 = "deleteItemBtn45";
	public static final String POPUP_SUCCESS = "#SupplierPortal-1227837064-overlays > div.v-Notification.v-success-notification.v-Notification-v-success-notification";
	public static final String FILTER_XPATH = "//*[@id='HeaderMenuBar']/span[1]/span/span";
	public static final String FILTER_PERSSION_PERSSION_NAME_XPATH = "//*[@id='content-component']/div/div[2]/div/div/div[3]/div/div/div/div/div/div/div/div[3]/table/thead/tr[2]/th[3]";
	public static final String FILTER_PERMISSION_NAME_CSS = "#content-component > div > div.v-panel-content.v-panel-content-borderless.v-panel-content-v-common-page-panel.v-scrollable > div > div > div.v-slot.v-slot-v-common-page-content-layout > div > div > div > div > div > div > div > div.v-grid-tablewrapper > table > thead > tr:nth-child(2) > th:nth-child(3)";
	public static final String PERMISSIONHEADER = "#common-header-left-layout > div > div";
	public static final String PERMISSIONWINDOWHEADER = "#permissioncreatewindow > div > div > div.v-window-contents > div > div > div.v-slot.v-slot-v-default-page-header-layout > div";
	public static final String DOCUMENT_TYPE_LIST_TABLE = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table";
	public static final String DOCUMENT_TYPE_TOTAL_NUMBER = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-status";
	public static final String DOCUMENT_TYPE_NEXT_PAGE = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-nextpage";

}
