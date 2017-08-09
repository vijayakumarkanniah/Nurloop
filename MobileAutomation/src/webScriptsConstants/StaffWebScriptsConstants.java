package webScriptsConstants;

public interface StaffWebScriptsConstants {
	
	/*Staff*/
	String STAFF_MAINMENU=".//*[@id='side-menu']/li[8]/a/span['Staff']";
	String STAFF_CREATEBUTTON=".//*[@id='staff']/div[1]/div[2]/div/a[2]/button/span['Add New Staff']";
	String STAFF_FIRSTNAME=".//*[@name='stafffirstname']";
	String STAFF_LASTNAME=".//*[@name='stafflastname']";
	String STAFF_GENDER=".//*[@value='%s']";
	String STAFF_EMAIL=".//*[@name='staffemail']";
	String STAFF_COUNTRYCODE=".//*[@value='%s']";
	String STAFF_CELLPHONE=".//*[@name='staffcellphone']";
	String STAFF_BIO=".//*[@name='staffbio']";
	/*HARDCODED*/
	String STAFF_SERVICETEAM=".//*[@value='69']";
	/*HARDCODED*/
	String STAFF_WORKINGHOURS_SUNDAY_STARTTIME=".//*[@id='Staff-workinghours']/div[1]/div[2]/div/md-input-container/input";
	String STAFF_WORKINGHOURS_SUNDAY_ENDTIME=".//*[@id='Staff-workinghours']/div[1]/div[3]/div/md-input-container/input";
	String STAFF_PASSWORD=".//*[@id='gen-pwd']";
	String STAFF_INPUT_2_1 = "html/body/div[6]/table/tbody/tr[2]/td[1]/input";
	String STAFF_INPUT_2_3 = "html/body/div[6]/table/tbody/tr[2]/td[3]/input";
	String STAFF_SAVE =".//*[@id='staffcreate']/div[1]/div[2]/a['Save']";
	String STAFFGLOBALHTML ="html/body/md-backdrop";
	String STAFF_BREAD_CRUMS=".//*[@id='page-wrapper']/div/ol";
	/*Staff*/
	

}
