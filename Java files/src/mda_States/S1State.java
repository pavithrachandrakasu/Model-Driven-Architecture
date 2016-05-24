package mda_States;

import mda_Efsm.Efsm;

public class S1State extends StateSuper{
	
	public S1State(Efsm ef) { 
		
		this.mda =  ef; // pointer to efsm object
		id = 5; // initializes state id
	}
	@Override
	public void Open()
	{
		// Do nothing
	}
	@Override
	public void Login()
	{
		// Do nothing
	}
	@Override
	public void IncorrectLogin()
	{
		// Do nothing
	}
	@Override
	public void IncorectPin(int max) 
	{
		// Do nothing
	}
	@Override
	public void CorrectPinBelowMin()
	{
		// Do nothing
	}
	@Override
	public void CorrectPinAboveMin()
	{
		// Do nothing
	}
	@Override
	public void Deposit()
	{
		// Do nothing
	}
	@Override
	public void BelowMinBalance()
	{
		// Do nothing
	}
	@Override
	public void AboveMinBalance()
	{
		// Do nothing
	}
	@Override
	public void Logout()
	{
		// Do nothing
	}
	@Override
	public void Balance()
	{
		// Do nothing
	}
	@Override
	public void Withdraw()
	{
		// Do nothing
	}
	@Override
	public void WithdrawBelowMinBalance()
	{
		// Calls Penalty to do output action with respect to Penalty
		output.Penalty();  
	}
	@Override
	public void NoFunds()
	{
		// Do nothing
	}
	@Override
	public void Lock()
	{
		// Do nothing
	}
	@Override
	public void IncorrectLock(){
		// Do nothing
	}
	@Override
	public void Unlock()
	{
		// Do nothing
	}
	@Override
	public void IncorrectUnlock()
	{
		// Do nothing
	}
	@Override
	public void Suspend()
	{
		// Do nothing
	}
	@Override
	public void Activate()
	{
		// Do nothing
	}
	@Override
	public void Close()
	{
		// Do nothing
	}
}
