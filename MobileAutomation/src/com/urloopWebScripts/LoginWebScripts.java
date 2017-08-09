package com.urloopWebScripts;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.excelGetterSetter.LoginGS;
import com.urloopWeb.ModuleObjects.LoginWeb_Object;

public class LoginWebScripts {

	
	public static String Validation;
	
	
	public static void login(LoginWeb_Object loginWeb_Object,LoginGS loginGS) throws InterruptedException, FileNotFoundException{
		
		try{
		loginWeb_Object.Deleted.click();}
		
		catch(Exception e){
			/*System.out.println("Exception Caught : "+e);*/
			PrintStream pw = new PrintStream(new File("resources/File.txt"));
			e.printStackTrace(pw); 
			pw.close();
		}
		
		loginWeb_Object.WebUsername.clear();
		loginWeb_Object.WebUsername.sendKeys(loginGS.getUserName());
		loginWeb_Object.WebPassword.clear();
		loginWeb_Object.WebPassword.sendKeys(loginGS.getPassWord());
		loginWeb_Object.LoginClick.click();
		Thread.sleep(2000);
		}
}
