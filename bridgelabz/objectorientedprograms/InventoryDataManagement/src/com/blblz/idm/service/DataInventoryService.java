package com.blblz.idm.service;

import org.json.simple.JSONArray;

import com.blblz.idm.model.InventoryDetails;

public interface DataInventoryService {
	
	public InventoryDetails  addInventory();
	public void  readInventory();
	public double getValue(JSONArray array);
}
