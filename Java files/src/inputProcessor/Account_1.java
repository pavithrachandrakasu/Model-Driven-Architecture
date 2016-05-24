package inputProcessor;
import mda_Efsm.Efsm;
import dataStore.DataStore;
import dataStore.DataStore1;
import abstractFactory.AbstractSuper;
import abstractFactory.ConcreteFactory1;

public class Account_1 {

	private AbstractSuper af;
	private Efsm mda;
	private DataStore ds;
	
	public Account_1(Efsm mda , AbstractSuper factory , DataStore ds)
	{
		// Creates pointer to objects of Efsm, AbstractSuper , DataStore 
		this.af = factory;
		this.mda = mda;
		this.ds = ds ;
	}
	
	public void open (String pin , String user_id , float bal)
	{
		// store p, y and a in temp data store
		
		ds.setA1temp_pin(pin);
		ds.setA1temp_userid(user_id);
		ds.setA1temp_bal(bal);
		mda.Open();
	}
	
	public void pin(String x) 
	{
		// checks the pin value and calls events based on minimum balance criterion
		 String value = ds.getA1pin();
		 if (x.equals(value))
		{
		 if (ds.getA1bal() > 500)
			 mda.CorrectPinAboveMin ();
		 else 
			 mda.CorrectPinBelowMin();
		}
		 else
		 {
			 mda.IncorectPin(3);
		 }
	}
	
	
	public void deposit (float d) 
	{
		// Stores the deposit user input in DataStore and calls events based on min balance criterion
		 ds.setA1temp_deposit(d);
		 mda.Deposit();
		 if (ds.getA1bal()>500)
			 mda.AboveMinBalance();
		 else 
			 mda.BelowMinBalance();
	}
	public void withdraw (float w) 
	{
		// stores withdraw amt in Datastore and calls respective events
		ds.setA1temp_withdraw(w);
		mda.Withdraw();
		 if ((ds.getA1bal()>500))
				 mda.AboveMinBalance();
		 else 
			 mda.WithdrawBelowMinBalance();
	}
	public void balance() 
	{
		// calls Balance event
		mda.Balance();
	}
	
	public void login (String y) 
	{
		// gets permanent userid and checks it with user input. Calls respective events on condition
		 if (y.equals(ds.getA1userid())){
			 mda.Login();}
		 else 
			 mda.IncorrectLogin();
	}
	public void logout() 
	{
		// Calls Logout event
		mda.Logout();
	}
	public void lock (String x) 
	{
		// Checks the entered pin with permanent pin in DataStore and calls events.
		 if (ds.getA1pin().equals(x)) 
			 mda.Lock();
		 else 
			 mda.IncorrectLock();
	}
	public void unlock (String x) 
	{
		// Checks the entered pin with permanent pin in DataStore and calls events.
		 if (x.equals(ds.getA1pin())) 
		 {
			 mda.Unlock();
		 if (ds.getA1bal() > 500)
			 mda.AboveMinBalance ();
		 else 
			 mda.BelowMinBalance();
		 }
		 else mda.IncorrectUnlock();
	} 
	
}
