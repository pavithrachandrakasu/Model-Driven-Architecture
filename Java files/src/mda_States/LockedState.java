package mda_States;

import mda_Efsm.Efsm;

public class LockedState extends StateSuper {

	public LockedState( Efsm ef){
		this.mda =ef; // pointer to efsm object
		id = 7; // initializes state id
	}
	@Override
	public void Open()
	{
		// Do Nothing
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
	public void IncorrectLock(){
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
		// Calls Output action IncorrectUnlock message
		output.IncorrectUnlockmsg();
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
