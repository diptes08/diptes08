package com.xmlbased.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Brand implements Mobile {

	String brand;

	@Override
	public String feature() {
		// TODO Auto-generated method stub
		System.out.println("Following Brands are available :");

		ArrayList<String> list = new ArrayList<String>();

		list.add("SAMSUNG");
		list.add("REDMI");
		list.add("APPLE");
		list.add("ONE PLUS");

		for (String brnd : list)
			System.out.println(brnd);

		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Select any one Brand:");
			brand = bf.readLine().toUpperCase();
			System.out.println(brand);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		if (list.contains(brand)) {

			System.out.println("Brand you have selected : " + brand);
		} else {
			System.out.println("not available:");
		}
		return brand;

	}

}
