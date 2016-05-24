package mda_States;

import mda_Efsm.Efsm;
import outputProcessor.Output;

public class ReadyState extends StateSuper {
	
	public ReadyState(Efsm ef){
		this.mda =  ef; // pointer to efsm object
		id = 4; // initializes state id
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
		// Calls MakeDeposit output action
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
		// Calls DisplayBalance to do output action
		output.DisplayBalance(); // Display balance
	}
	@Override
	public void Withdraw()
	{
		// Calls MakeWithdraw to do output action
		output.MakeWithdraw(); //withdraw action
	}
	@Override
	public void WithdrawBelowMinBalance()
	{
		// Do nothing
	}
	@Override
	public void NoFunds()
	{
		// Calls NoFundsmsg to do respective output action 
		output.NoFundsmsg(); //displays the no funds message
	}
	@Override
	public void Lock()
	{
		// Do nothing
	}
	@Override
	public void IncorrectLock(){
		// Calls IncorrectLockmsg to do output action
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

