package mda_States;

import mda_Efsm.Efsm;
import outputProcessor.Output;

public class IdleState extends StateSuper {

	public IdleState(Efsm ef){
        this.mda =  ef;  // pointer efsm object
        id = 2; // initializes state id
	}
	
	@Override
	public void Login()
	{
		// intializes number of attempts to zero and calls output action PromptPin
		mda.set_attempts(0);
		output.PromptPin();
		
	}
	
	@Override
	public void IncorrectLogin()
	{
		// Calls output action IncorrectID Message
		output.IncorrectIdmsg();
	}
	@Override
	public void Open()
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
