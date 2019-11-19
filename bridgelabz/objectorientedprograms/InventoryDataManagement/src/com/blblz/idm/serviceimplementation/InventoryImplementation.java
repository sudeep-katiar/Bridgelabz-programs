package com.blblz.idm.serviceimplementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.blblz.idm.service.DataInventoryService;
import com.blblz.idm.util.Utility;

public class InventoryImplementation implements DataInventoryService {
	 Utility utility = new Utility();
	 
	 public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		
		try
		{
			Object obj = parser.parse(new FileReader("/home/admin1/bridgelabz/objectorientedprograms/InventoryDataManagement/DataManagement.json"));
			JSONObject jsonObject = (JSONObject)obj;
			
			//loop array
//			JSONArray riceArray = (JSONArray) jsonObject.get("Rice");
//			Iterator<String> iterator = riceArray.iterator();
//			
//			while(iterator.hasNext())
//			{
//				System.out.println("Rice: "+iterator.next());
//			}
//			
//			JSONArray wheatArray = (JSONArray) jsonObject.get("Wheat");
//			Iterator<String> iterator1 = wheatArray.iterator();
//			
//			while(iterator1.hasNext())
//			{
//				System.out.println("Wheat: "+iterator1.next());
//			}
//			
//			JSONArray pulsesArray = (JSONArray) jsonObject.get("Pulses");
//			Iterator<String> iterator2 = pulsesArray.iterator();
//			
//			while(iterator2.hasNext())
//			{
//				System.out.println("Pulses: "+iterator2.next());
//			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 
	 @SuppressWarnings("static-access")
	public void addInventory()
	 {
		
		System.out.println("Enter the product name: ");
		setName(utility.inputString());
		
		return ;
	 }
	@Override
	public void setName(String inputString) {
		// TODO Auto-generated method stub
		
	}
	
}