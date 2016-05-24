package mda_States;

import mda_Efsm.Efsm;

public class OverdrawnState extends StateSuper {

	public OverdrawnState(Efsm ef){
		mda =  ef; // pointer to efsm object
		id =6; // initializes to state id
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
		// Calls output action MakeDeposit 
		output.MakeDeposit();
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
		// Calls output action Display Balance
		output.DisplayBalance();
	}
	@Override
	public void Withdraw()
	{
		// Calls Output Action Withdraw
		output.NoFundsmsg(); //withdraw action
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
		
		// calls ouput action incorrectlock to display incorrect lock message
		output.IncorrectLockmsg(); 
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
