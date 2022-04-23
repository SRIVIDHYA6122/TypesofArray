package com.edu1;
class A extends Thread(){
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" "+Thread.currentThread());
		}
	}
}

public class ThreadLifeCycle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A ob= new A();
	System.out.println(ob.isAlive());

	}

}
