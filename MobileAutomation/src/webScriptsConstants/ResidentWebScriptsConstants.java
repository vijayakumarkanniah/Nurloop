package webScriptsConstants;

public interface ResidentWebScriptsConstants {

	/*Resident*/
	String RESIDENT_MAINMENU=".//*[@id='side-menu']/li[5]/a['Residents']";
	String RESIDENT_CREATEBUTTON=".//*[@id='residents']/div[1]/div[2]/div/a/button/span['Add New Resident']";
	String RESIDENT_FIRSTNAME_FIELD=".//*[@ng-model='residentfirstname']";
	String RESIDENT_LASTNAME_FIELD=".//*[@ng-model='residentlastname']";
	String RESIDENT_GENDER_VALUE=".//*[@value='%s']";
	String RESIDENT_DOB=".//*[@value='%s']";
	String RESIDENT_EMAIL=".//*[@ng-value='residentemail']";
	String RESIDENT_COUNTRY=".//*[@value='%s']";
	String RESIDENT_PHONE=".//*[@name='residentcellphone']";
	String RESIDENT_ADDRESS_1=".//*[@ng-value='rc.address1']";
	String RESIDENT_ADDRESS_2=".//*[@ng-value='rc.address2']";
	String RESIDENT_BIO=".//*[@ng-model='residentbio']";
	String RESIDENT_SAVE=".//*[@id='residentcreate']/div[2]/div[2]/a['Save']";
	String RESIDENTGLOBALHTML ="html/body/md-backdrop";
	String RESIDENT_BREAD_CRUMS=".//*[@id='page-wrapper']/div/ol";
	/*Resident*/
	
	
	
}
