package org.songzx.rwreset.strategy;

public class ThemeTest {

	public static void main(String[] args) {
		ThemeManager themeManager = new ThemeManager();
		themeManager.setTheme(new DefaultTheme());
		themeManager.showTheme();
		
		themeManager.setTheme(new MyTheme());
		themeManager.showTheme();
	}

}
