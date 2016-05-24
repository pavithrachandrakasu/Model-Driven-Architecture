package strategy;

import dataStore.DataStore;

public class StoreData2 extends StoreData {
	
	@Override
	public void StoreData(DataStore ds){
		// sets pin,userid, balance from temporary to permanent variables in DataStore2
		ds.setA2pin(ds.getA2temp_pin());
		ds.setA2userid(ds.getA2temp_userid());
		ds.setA2bal(ds.getA2temp_bal());
		//String user = ds.getUserid();
	}
}
