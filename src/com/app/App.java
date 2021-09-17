package com.app;

class App {
	public static void main(String[] args) { // The main thread 
		Thread intAsslep = new Thread_1(); // Make the other thread 
		try{
			//Execute the intAsslep thread for two seconds and then make a interruption 
			intAsslep.start(); 
			Thread.sleep(2000); 
			intAsslep.interrupt();
		}
		catch(InterruptedException e){ // Catch a Interrupted Exception 
			e.printStackTrace();
		}
	}
}
