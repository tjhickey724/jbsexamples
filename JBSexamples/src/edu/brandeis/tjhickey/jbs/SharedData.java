package edu.brandeis.tjhickey.jbs;

import java.util.ArrayList;
import java.util.List;

public class SharedData {
  private int x = 0;
  private List<String> y = new ArrayList<String>();
  
  public void push(String s){
	  y.add(s);
  }
  
  public String pop(){
	  String s = y.remove(y.size()-1);
	  return s;
  }
  
  public int size(){
	  return y.size();
  }
  
  public int getX(){
	  return x;
  }
  
  public void setX(int z){
	  x = z;
  }
  
  public void add(int y){
	  x += y;
  }
  
  public String toString(){
	  return "x="+x+" y = "+y;
  }
}
