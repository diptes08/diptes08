package com.annobased.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;


public class Processor implements Mobile {
	
	
		String processor;

		@Override
		public String feature() {
			// TODO Auto-generated method stub
			System.out.println("Following Processors are available :");
			
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("Octa core 4th gen");
			list.add("Mediatek helio g5");
			list.add("Snapdragon 650");
			list.add("A11 Bionic Chip");
			
			for (String brnd:list)
				System.out.println(brnd);
			
			try {
			BufferedReader  bf=new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Select any one Processor:");
			processor = bf.readLine();
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
			if(list.contains(processor)) {
				System.out.println("Processor you have selected : " +processor);
			}
			else {
				System.out.println("not available:");
		}
			return processor;
		 
		}


	}





