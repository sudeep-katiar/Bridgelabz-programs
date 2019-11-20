package com.blblz.idm.controller;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class InventoryJson {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		JSONObject obj = new JSONObject();
		
		JSONArray list = new JSONArray();

		list.add("Name: Basmati");
		list.add("Weight: 20kg");
		list.add("Price: Rs500");
		
		obj.put("Rice", list.clone());
		
		list.clear();
		list.add("Name: Dumur");
		list.add("Weight: 3kg");
		list.add("Price: Rs100");
		
		obj.put("Wheat", list.clone());
		
		list.clear();
		list.add("Name: Peas");
		list.add("Weight: 5kg");
		list.add("Price: Rs600");
		
		obj.put("Pulses", list);
		
		try(FileWriter file = new FileWriter("DataManagement.json"))
		{
			file.write(obj.toJSONString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(obj);
	}

}
