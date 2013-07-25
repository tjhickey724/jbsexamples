package edu.brandeis.tjhickey.jbs;

public class MyRunnable implements Runnable {

	public int countTo=100;
	public SharedData d;
	public String name = "thread";
	
	
	public MyRunnable(String name,int a, SharedData d){
		this.name=name;
		this.countTo=a;
		this.d = d;
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<countTo;i++){
			if (i%10000000==0)
				System.out.println(name+" i="+i+" d="+d.toString());
			//d.push(name);
			d.add(1);
			//d.pop();
		}
		
	}
	
	

}
