package strategy;

import dataStore.DataStore;
import dataStore.DataStore.*;

public class StoreData1 extends StoreData{

	@Override
	public void StoreData(DataStore ds){
		// sets pin,userid, balance from temporary to permanent variables in DataStore1
		ds.setA1pin(ds.getA1temp_pin());
		ds.setA1userid(ds.getA1temp_userid());
		ds.setA1bal(ds.getA1temp_bal());
	}

}
