package com.rohitha;
import java.util.*;

class Browser{
	private static ArrayList<String> history = new ArrayList<>();
	
	public Browser() {	//empty constructor
	} 
	
	public void setBrowser(String history) {	//adding new visited url
		Browser.history.add(history);
	}
	
	public Browser(ArrayList<String> urls) {		//constructor with parameter
		for(int i=0; i< urls.size(); i++) {
			Browser.history.add(urls.get(i));
		}
	}
	public void accessBrowser() {		//displaying the browser history
		for(int i = 0; i<history.size(); i++) {
			System.out.println("[history[" + (i+1) +"]:" + history.get(i));
		}
	}
	
}
	

public class Learning {

	public static void main(String[] args) {
		Browser b1 = new Browser();
		String url = "https://www.google.com";
		b1.setBrowser(url);
		ArrayList<String> urlArray = new ArrayList<>();
		urlArray.add("https://www.facebook.com");
		urlArray.add("https://www.web.whatsapp.com");
		Browser b2 = new Browser(urlArray);
		b2.accessBrowser();
		
		
		
	}

}
