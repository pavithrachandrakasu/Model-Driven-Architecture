package strategy;

import dataStore.DataStore;

public class DisplayBalance2 extends DisplayBalance {
	public void DisplayBalance(DataStore ds){
		// Displays the current Balance of Account2
		System.out.println("ACCOUNT-2 CURRENT BALANCE IS "+ds.getA2bal());
	}
}
