package com.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Utility.Base;
import com.Utility.ExcelDataProvider;
import com.pom.Homepage;

public class VerifyLoginPage extends Base {
	
	@Test
	public void verifyLoginPage() throws IOException	 {
		
		Homepage hp=new Homepage(driver);
		
		ExcelDataProvider edp=new ExcelDataProvider();
		edp.getData();
		
		String user = edp.getStringData("Sheet", 0, 0);
		hp.username(user);
		String pass = edp.getStringData("Sheet", 1, 0);
		hp.password(pass);
		hp.login();
		
		
	}

}
