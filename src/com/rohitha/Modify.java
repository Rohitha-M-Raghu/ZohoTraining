package com.rohitha;

import java.util.ArrayList;

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
	public ArrayList<String> accessBrowser() {		//displaying the browser history
		return history;
	}
	
}

public class Modify {

	public static void main(String[] args) {
		Browser b1 = new Browser();
		String url = "https://www.google.com";
		b1.setBrowser(url);
		ArrayList<String> urlArray = new ArrayList<>();
		urlArray.add("https://www.facebook.com");
		urlArray.add("https://www.web.whatsapp.com");
		Browser b2 = new Browser(urlArray);
		ArrayList<String> his = b2.accessBrowser();
		for(int i = 0; i<his.size(); i++) {
			System.out.println("[history[" + (i+1) +"]:" + his.get(i));
		}
		
	}

}
