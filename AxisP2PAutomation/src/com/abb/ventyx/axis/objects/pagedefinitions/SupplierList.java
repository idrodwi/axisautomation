package com.abb.ventyx.axis.objects.pagedefinitions;

public class SupplierList {
	public static final String SUPPLIERNAME_ID = "psuName";
	public static final String COMPANYREGISTRATIONNO_ID = "psuCoRegnNo";
	public static final String TAXREGRISTRATIONNO_ID = "psuTaxRegnNo";
	public static final String SUPPLIEREMAIL_ID = "emailAddress";
	public static final String SUPPLIERSTATUS_XPATH = "//*[@id='psuStatus']/div";
	public static final String FIRSTSTATUS = "//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[1]/td/span";
	public static final String SECONDSTATUS = "//*[@id='VAADIN_COMBOBOX_OPTIONLIST']/div/div[2]/table/tbody/tr[2]/td/span";
	public static final String CREATENEWSUPPLIERTITLE = "//*[@id='createsupplierwindow']/div/div/div[3]/div/div/div[1]/div/div/div/div/div/div";
	public static final String SAVEBTN_ID = "createEditBtn";
	public static final String SUPPLIERNAME_SEARCHFIELD_ID = "psuNameTxt";
	public static final String SUPPLIERADMINUSERID_ID = "gwt-uid-41";

	public static final String PROFILE_CSS = "#psuProfile > div";
	public static final String COMBOBOX_CSS = "#VAADIN_COMBOBOX_OPTIONLIST > div > div.v-filterselect-suggestmenu > table > tbody";
	public static final String ACTIVATE_CSS = "#HeaderMenuBar > span:nth-child(3)";
	public static final String DEACTIVATE_CSS = "#HeaderMenuBar > span:nth-child(4)";
	public static final String SUPPLIER_EMAIL_FILTER_XPATH = "(//input[@id='filterField'])[6]";
	public static final String SUPPLIER_ID_FILTER_XPATH = "(//input[@id='filterField'])[1]";
	public static final String SUPPLIER_STATUS_FILTER_XPATH = "(//input[@id='filterField'])[4]";
	
	// --- Address And Contact
	public static final String SUPPLIER_NAME_ID = "companyNameField";
	public static final String COMPANY_REGISTRATION_NO_ID = "companyRegistrationNoField";
	public static final String TAX_REGRISTRATION_NO_ID = "taxRegistrationNoField";
	public static final String SUPPLIER_NOTIFICATION_EMAILID = "supplierEmail";

}
