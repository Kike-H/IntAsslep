package com.app;

public class Thread_1 extends Thread {
	@Override
	public void run(){ //Override the method run
		while(true){ //Make the infinite loop
			try{
				System.out.println("Hello!");
				Thread.sleep(100);
			}
			catch(InterruptedException e){ //Out when make a interruption
				System.out.println("Interrupted");
				break;
			}
		}
	}
}
