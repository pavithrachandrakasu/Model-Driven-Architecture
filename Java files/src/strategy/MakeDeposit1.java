package strategy;

import dataStore.DataStore;

public class MakeDeposit1 extends MakeDeposit{
	public void MakeDeposit(DataStore ds)
	{
		// adds deposit amount to the current balance and sets current balance again in DataStore1
		ds.setA1bal(ds.getA1bal()+ds.getA1temp_deposit());
	}
}
