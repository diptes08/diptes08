package com.annobased.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;


public class Color implements Mobile {
	String color;

	@Override
	public String feature() {
		// TODO Auto-generated method stub
		System.out.println("Following colors are available :");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Black");
		list.add("Gold");
		list.add("White");
		list.add("Grey");
		
		for (String brnd:list)
			System.out.println(brnd);
		
		try {
		BufferedReader  bf=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Select any one Color:");
		color = bf.readLine();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		if(list.contains(color)) {
			System.out.println("Color you have selected : " +color);
		}
		else {
			System.out.println("not available:");
	}
		return color;
	 
	}


}


