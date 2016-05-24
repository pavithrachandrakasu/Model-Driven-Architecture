package mda_States;

import mda_Efsm.Efsm;
import outputProcessor.Output;

public class StartState extends StateSuper {
	
	Efsm mda =null;
    
    public StartState(Efsm mda) 
    {
        this.mda =  mda; // pointer efsm object
        id = 1; // initializes state id
    }  

	@Override
	public void Open()
	{
		// calls output action to store p, y and a in temp data store
		output.StoreData();
	}
	@Override
	public void Login()
	{
	 // Do Nothing
	}
	@Override
	public void IncorrectLogin()
	{
		// Do Nothing
	}
	@Override
	public void IncorectPin(int max) 
	{
		// Do Nothing
	}
	@Override
	public void CorrectPinBelowMin()
	{
		// Do Nothing
	}
	@Override
	public void CorrectPinAboveMin()
	{
		// Do Nothing
	}
	@Override
	public void Deposit()
	{
		// Do Nothing
	}
	@Override
	public void BelowMinBalance()
	{
		// Do Nothing
	}
	@Override
	public void AboveMinBalance()
	{
		// Do Nothing
	}
	@Override
	public void Logout()
	{
		// Do Nothing
	}
	@Override
	public void Balance()
	{
		// Do Nothing
	}
	@Override
	public void Withdraw()
	{
		// Do Nothing
	}
	@Override
	public void WithdrawBelowMinBalance()
	{
		// Do Nothing
	}
	@Override
	public void NoFunds()
	{
		// Do Nothing
	}
	@Override
	public void Lock()
	{
		// Do Nothing
	}
	@Override
	public void IncorrectLock()
	{
		// Do Nothing
	}
	@Override
	public void Unlock()
	{
		// Do Nothing
	}
	@Override
	public void IncorrectUnlock()
	{
		// Do Nothing
	}
	@Override
	public void Suspend()
	{
		// Do Nothing
	}
	@Override
	public void Activate()
	{
		// Do Nothing
	}
	@Override
	public void Close()
	{
		// Do Nothing
	}
	
}
