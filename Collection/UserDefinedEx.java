package com.bookutil;
import java.io.*;
import java.util.*;

class UserDefinedExp{
	long acno;
	String name;
	double acblnc;
	int age;
	UserDefinedExp(long acno,String name,double acblnc,int age){ // constructor of bank class
		this.acno=acno;
		this.name=name;
		this.acblnc=acblnc;
		this.age=age;
	}}
public class UserDefinedEx {
public static void main(String[] args) {
	
	// creating objects of bank class passing appropriate inputs
	UserDefinedExp b1=new UserDefinedExp(123536,"dev",3003.8,24);
	UserDefinedExp b2=new UserDefinedExp(178373,"abc",3113.8,25);
	UserDefinedExp b3=new UserDefinedExp(172846,"def",3223.8,26);
	UserDefinedExp b4=new UserDefinedExp(486336,"ijk",3443.8,27);
	UserDefinedExp b5=new UserDefinedExp(457383,"lmn",3553.8,28);
	UserDefinedExp b6=new UserDefinedExp(769853,"dgh",3663.8,29);
	
	//taking a new arraylist to store the objects of bank class
	ArrayList<UserDefinedExp>al=new ArrayList<UserDefinedExp>();
	
	// adding bank objects in the arraylist
	al.add(b1);
	al.add(b2);
	al.add(b3);
	al.add(b4);
	al.add(b5);
	al.add(b6);
	Iterator itr=al.iterator(); //creating object of iterator
	while(itr.hasNext()) {
		UserDefinedExp obj= (UserDefinedExp) itr.next(); //casting
		System.out.println(obj.acno+" "+obj.name+" "+obj.acblnc+" "+obj.age); // printing elements inside objects
	}}}
