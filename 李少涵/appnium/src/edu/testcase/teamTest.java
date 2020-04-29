package edu.testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import edu.utils.*;

import edu.base.BaseTest;
import edu.pages.EditPage;
import edu.pages.teamPage;

public class teamTest extends BaseTest {

	@DataProvider(name="team")
	public static Object[][] words() throws IOException{
		ExcelDataProvider excel=new ExcelDataProvider();
		return excel.getTestDataByExcel("C:\\Users\\hp\\Desktop\\team.xlsx", "Sheet1");
	}
	
	@Test(dataProvider="team")
	public void regist_team(String x,String y,String tname,String tsl,String assert_now) throws InterruptedException {
		teamPage tp=new teamPage(driver);
		tp.team_page();
		String result=tp.create_team(x,y,tname,tsl);
		assertTrue(result.contains(assert_now));
	}
}
