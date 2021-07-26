package com.example.Assests;
import java.util.List;

public interface AssestServices {
	
	

	
	public List<Assets> getAllAssets();


	public Assets getAssets(long assetId);
	public Assets addAssets(Assets assets);


	public Assets updateAssets(Assets update);


	public void removeAssets(long parseLong);



}
