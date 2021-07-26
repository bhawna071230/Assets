package com.example.Assests;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
@Service
public class AssetServiceImpl implements AssestServices{


	List<Assets> list;
	Assets asset;
	
	public AssetServiceImpl() {
		list = new ArrayList<>();
		list.add(new Assets(1,"bhawna","software engineer","lenovo","7","12/03/2017","1table","1chair"));
		list.add(new Assets(2,"aman","frontend developer","apple macbook","8","1/09/2021","2table","2chair"));
		list.add(new Assets(3,"akansha","finance","thinkpad","9","3/07/2017","3table","3chair"));
		list.add(new Assets(4,"molu","HR","assus","20","4/09/2014","4table","4chair"));
		list.add(new Assets(5,"","","assus","21","4/09/2014","4table","4chair"));

	}
	
	

	@Override
	public List<Assets> getAllAssets() {
		return list ;
	}

	@Override
	public Assets getAssets(long AssetsId) {
		Assets c = null;
		for(Assets assets:list) {
			if(assets.getId()==AssetsId) {
				c=assets;
				break;
			}
		}
		return c;
	}

	@Override
	public Assets addAssets(Assets assets) {
		 assets.getLaptop();
		if(!list.isEmpty())
			assets.setLaptop(Status.assigned);
		else if(asset.name.isEmpty())
			assets.setLaptop(Status.available);
		list.add(assets); 
		return assets;
	}


	@Override
	public Assets updateAssets(Assets update) {
		for(Assets assets:list) {
			if(assets.getId()==update.getId()) {
				update.setLaptop(update.getLaptop());
				update.setVersion(update.getVersion());}
			
		}
	
		return update;
	
	}

	@Override
	public void removeAssets(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}

	}


