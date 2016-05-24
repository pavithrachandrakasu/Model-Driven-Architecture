package mda_States;

import outputProcessor.Output;
import mda_Efsm.Efsm;

public class StateSuper {
		
	protected static Output output; // initialize pointer to output object
	protected int id; // declares state id
	protected Efsm mda; // intialize pointer to efsm object
	

	public void initializeOutput(Output output){
		// initializes output processor
		this.output = output;
	}
	
	public int get_id()
	{
		// returns current state id
		return id;
	}
	public void Open()
	{
		// Do nothing
	}
	public void Login()
	{
		// Do nothing
	}
	public void IncorrectLogin()
	{
		// Do nothing
	}
	public void IncorectPin(int max) 
	{
		// Do nothing
	}
	public void CorrectPinBelowMin()
	{
		// Do nothing
	}
	public void CorrectPinAboveMin()
	{
		// Do nothing
	}
	public void Deposit()
	{
		// Do nothing
	}
	public void BelowMinBalance()
	{
		// Do nothing
	}
	public void AboveMinBalance()
	{
		// Do nothing
	}
	public void Logout()
	{
		// Do nothing
	}
	public void Balance()
	{
		// Do nothing
	}
	public void Withdraw()
	{
		// Do nothing
	}
	public void WithdrawBelowMinBalance()
	{
		// Do nothing
	}
	public void NoFunds()
	{
		// Do nothing
	}
	public void Lock()
	{
		// Do nothing
	}
	public void IncorrectLock(){
		// Do nothing	
	}
	public void Unlock()
	{
		// Do nothing
	}
	public void IncorrectUnlock()
	{
		// Do nothing
	}
	public void Suspend()
	{
		// Do nothing
	}
	public void Activate()
	{
		// Do nothing
	}
	public void Close()
	{
		// Do nothing
	}

}
