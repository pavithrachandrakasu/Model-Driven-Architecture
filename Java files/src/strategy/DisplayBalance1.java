package strategy;

import dataStore.DataStore;

public class DisplayBalance1 extends DisplayBalance {
	public void DisplayBalance(DataStore ds){
		// Displays the current Balance of Account1
		System.out.println("ACCOUNT-1 CURRENT BALANCE IS "+ds.getA1bal());
	}
}
