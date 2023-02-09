package com.rohitha;

class Browser{
	private static String[] history = new String[100];
	private static int historyIndex = 0;
	
	public Browser() {	//empty constructor
	}
	
	public Browser(String[] urls) {	//constructor
		for(int i=0; i<urls.length; ++i) {
			Browser.history[Browser.historyIndex] = urls[i];
			Browser.historyIndex ++;
		}
	}
	
	public void setBrowser(String url) { //to add new url to history
		Browser.history[Browser.historyIndex] = url;
		Browser.historyIndex ++;
	}
	
	public void accessBrowser() {	//to display all the browser history
		for(int i=0; i<Browser.historyIndex; ++i) {
			System.out.println("[history[" + (i+1) +"]:" + Browser.history[i]);
		}
	}
}


public class Dynamic {

	public static void main(String[] args) {
		Browser b1 = new Browser();
		String url = "https://www.google.com";
		b1.setBrowser(url);
		String[] urlArray = new String[] {"https://www.facebook.com", "https://www.web.whatsapp.com"}; 
		Browser b2 = new Browser(urlArray);
		b2.accessBrowser();	

	}

}
