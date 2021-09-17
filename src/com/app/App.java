package com.app;

class App {
	public static void main(String[] args) {
		Thread intAsslep = new Thread_1();
		try{
			intAsslep.start();
			Thread.sleep(2000);
			intAsslep.interrupt();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
