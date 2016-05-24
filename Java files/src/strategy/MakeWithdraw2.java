package strategy;

import dataStore.DataStore;

public class MakeWithdraw2 extends MakeWithdraw {
	public void MakeWithdraw(DataStore ds)
	{
		// deducts withdraw amount from the current balance and sets current balance again in DataStore2
		ds.setA2bal(ds.getA2bal() - ds.getA2temp_withdraw());
	}
}
