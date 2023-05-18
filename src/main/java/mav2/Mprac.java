package mav2;

import org.testng.annotations.Test;

import mav.Mpractice;

public class Mprac extends Mpractice{
	@Test
	public void GetTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void GetURL() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test
	public void getWindowHandle() {
		String whandle=driver.getWindowHandle();
		System.out.println(whandle);
	}
}
