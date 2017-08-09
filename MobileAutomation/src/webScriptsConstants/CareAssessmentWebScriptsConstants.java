package webScriptsConstants;

public interface CareAssessmentWebScriptsConstants {
	
	String CAREASSESSMENT_MENU =".//*[@id='side-menu']/li[6]/a/span['Care Assessments']";
	String CREATE_CAREASSESSMENT_BUTTON =".//*[@id='btn-create']/span['Create New Assessment']";
	String CAREASSESSMENT_TITLE_NAME =".//*[@id='formtitlename']";
	String CAREASSESSMENT_QUESTIONTYPE_FILED =".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[1]/div[1]/div[2]/div/select";
	String CAREASSESSMENT_QUESTIONTYPE_FILED_SINGLE_CHOICE ="//option[contains(@value,'radio')]";
	
	String CAREASSESSMENT_QUESTIONTYPE_FILED_MULTIPLE_CHOICE ="//option[contains(@value,'multiple')]";
	
	String CAREASSESSMENT_QUESTIONTYPE_FILED_TEXT_CHOICE ="//option[contains(@value,'text')]";
	
	String CAREASSESSMENT_SERVICE_NAME_FIELD =".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[1]/div[2]/div[2]/div/select";
	String CAREASSESSMENT_SERVICE_NAME_FIELD_VALUE="//option[contains(.,'None')]";
	String CAREASSESSMENT_QUESTION_TITLE=".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[1]/div[3]/div[2]/input";
	String CAREASSESSMENT_ANSWER_1=".//*[@id='questAns1']";
	String CAREASSESSMENT_ANSWER_SAVE=".//*[@id='cacreate']/div[2]/div/div/div[3]/div/form/div/div[4]/div[text()='Save Question']";
	String CAREASSESSMENT_SAVE=".//*[@id='cacreate']/div[1]/div[2]/div/a[text()='Save']";
	String CAREASSESSMENT_BREAD_CRUMS=".//*[@id='page-wrapper']/div/ol";
	/*CareAssessment*/
	

}
