package strategy;

import dataStore.DataStore;

public class Penalty1 extends Penalty {
	public void Penalty(DataStore ds){
		// set Penalty if withdrawal amount is lesser than minimum balance
		
		System.out.println(" Minimum required balance is $500. So Penalty is applied.");
		float bal = ds.getA1bal();
		float afterpenalty = bal - 20;
		ds.setA1bal(afterpenalty);
		System.out.println(" After a Penalty of 20$, Balance is " 
		+ ds.getA1bal() );

	}

}
