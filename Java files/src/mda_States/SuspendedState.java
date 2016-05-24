package mda_States;

import mda_Efsm.Efsm;

public class SuspendedState extends StateSuper {

	public SuspendedState(Efsm ef){
		this.mda = ef;
		id = 8;
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
		
	}
	@Override
	public void Deposit()
	{
		
	}
	@Override
	public void BelowMinBalance()
	{
		
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
		// Calls DisplayBalance to do output action
		output.DisplayBalance(); // display available balance
	}
	@Override
	public void Withdraw()
	{
		// Do nothing
	}
	@Override
	public void WithdrawBelowMinBalance()
	{
		// Do nothing
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
