package strategy;

import dataStore.DataStore;

public class MakeDeposit2 extends MakeDeposit{
	public void MakeDeposit(DataStore ds)
	{
		// adds deposit amount to the current balance and sets current balance again in DataStore2
		ds.setA2bal(ds.getA2bal()+ ds.getA2temp_deposit());
	}
}
