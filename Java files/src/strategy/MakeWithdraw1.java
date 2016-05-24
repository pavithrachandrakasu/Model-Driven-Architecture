package strategy;

import dataStore.DataStore;

public class MakeWithdraw1 extends MakeWithdraw{

	public void MakeWithdraw(DataStore ds)
	{
		// deducts withdraw amount from the current balance and sets current balance again in DataStore1
		ds.setA1bal(ds.getA1bal() - ds.getA1temp_withdraw());
	}
}
