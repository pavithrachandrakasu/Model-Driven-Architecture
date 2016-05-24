package inputProcessor;

import abstractFactory.AbstractSuper;
import dataStore.DataStore;
import dataStore.DataStore2;
import mda_Efsm.Efsm;

public class Account_2 extends AbstractSuper{

	private AbstractSuper af;
	private Efsm mda;
	private DataStore ds;
	
	public Account_2(Efsm mda , AbstractSuper factory , DataStore ds2)
	{
		this.af = factory;
		this.mda = mda;
		this.ds = ds2 ;
	}
	public void OPEN (int p, int y, int a) {
		// store p, y and a in temp data store
		ds.setA2temp_pin(p);
		ds.setA2temp_userid(y);
		ds.setA2temp_bal(a);
		mda.Open();
		}
	public void PIN (int x) 
	{
		// checks the pin value and calls events based on minimum balance criterion
		 if (x == ds.getA2pin())
			 mda.CorrectPinAboveMin ();		
		 else mda.IncorectPin(2);
	} 
	public void DEPOSIT (int d)
	{
		// Stores the deposit user input in DataStore and calls events based on min balance criterion
		 ds.setA2temp_deposit(d);
		 mda.Deposit();
	} 
	public void WITHDRAW (int w) 
	{
		// stores withdraw amt in Datastore and calls respective events
		 ds.setA2temp_withdraw(w);
		 if (ds.getA2bal() > 0){
			 mda.Withdraw();
		 	 mda.AboveMinBalance();}
		 else 
			 mda.NoFunds();
	} 
	public void BALANCE() 
	{
		// calls Balance event
		mda.Balance();
	} 
	public void LOGIN (int y) 
	{
		// gets permanent userid and checks it with user input. Calls respective events on condition
		 if (y == ds.getA2userid())
			 mda.Login();
		 else
			 mda.IncorrectLogin(); 
	}
	public void LOGOUT() 
	{
		mda.Logout();
	} 
	public void suspend () 
	{
		 mda.Suspend();
	}
	public void	activate () 
	{
		 mda.Activate();
	}
	public void close () 
	{
		 mda.Close();
	} 
}
