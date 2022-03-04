package com.xmlbased.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Processor implements Mobile {
	
	
		String processor;

		@Override
		public String feature() {
			// TODO Auto-generated method stub
			System.out.println("Following Processors are available :");
			
			ArrayList<String> list = new ArrayList<String>();
			
			list.add("OCTA CORE ");
			list.add("MEDIATEK");
			list.add("SNAPDRAGON 650");
			list.add("BIONIC CHIP");
			
			for (String brnd:list)
				System.out.println(brnd);
			
			try {
			BufferedReader  bf=new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Select any one Processor:");
			processor = bf.readLine().toUpperCase().trim();
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





