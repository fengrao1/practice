package edu.testcase;

import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.EditPage;

public class NoteTest extends BaseTest{
	@Test
	public void addNew() throws InterruptedException {
		EditPage ep=new EditPage(driver);
		ep.add("112233");
		ep.add("112233");
		ep.add("112233");
	}

	@Test
	public void paste() throws InterruptedException {
		EditPage ep=new EditPage(driver);
		ep.copyAndPaste();
	}
	
	@Test
	public void edit() throws InterruptedException {
		EditPage ep=new EditPage(driver);
		ep.editText("hello");
	}
	@Test
	public void deleteAll() throws InterruptedException {
		EditPage ep=new EditPage(driver);
		ep.deleteAllText();
	}
}
