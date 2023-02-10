package com.rohitha;

class Browser{
	private static String[] history = new String[1];
	private static int historyIndex = 0;
	
	public Browser() {	//empty constructor
	}
	
	public Browser(String[] urls) {	//constructor
			for(int i=0; i<urls.length; ++i) {
				try {
				Browser.history[Browser.historyIndex] = urls[i];
				}
				catch(Exception e) {
					Browser.growSize();
					Browser.history[Browser.historyIndex] = urls[i];
				}
				Browser.historyIndex ++;
			
		}
		
	}
	
	public void setBrowser(String url) { //to add new url to history
		try {
			Browser.history[Browser.historyIndex] = url;
			Browser.historyIndex ++;
		}
		catch(Exception e) {
			Browser.growSize();
			Browser.history[Browser.historyIndex] = url;
			Browser.historyIndex ++;
		}
	}
	
	public void accessBrowser() {	//to display all the browser history
		for(int i=0; i<Browser.historyIndex; ++i) {
			System.out.println("[history[" + (i+1) +"]:" + Browser.history[i]);
		}
	}
	private static void growSize() {	//to increase the array size upon exception
		String[] temp = null;
		temp = new String[Browser.historyIndex * 2];
		for(int i=0; i< Browser.historyIndex; ++i) {
			temp[i] = Browser.history[i];
		}
		Browser.history = temp;
		
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
