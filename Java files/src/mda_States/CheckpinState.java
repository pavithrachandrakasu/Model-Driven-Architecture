package mda_States;

import mda_Efsm.Efsm;
import outputProcessor.Output;

public class CheckpinState extends StateSuper {
	//Efsm mda =null;
	
	public CheckpinState(Efsm ef) { 
		mda =  ef; // pointer to efsm object
		id =3; //intializes state id
	}
	@Override
	public void Open()
	{
		
	}
	@Override
	public void Login()
	{
	
	}
	@Override
	public void IncorrectLogin()
	{
		
	}
	@Override
	public void IncorectPin(int max) 
	{
		/* calls output action incorrectPin msg and calls action TooManyAttempts if number of attempts
		 * exceeds maximum
		 */
		
		if ( mda.get_attempts() < max)
		{
			
			output.IncorrectPinmsg();
			mda.set_attempts(mda.get_attempts()+1);
			//System.out.println("inside if"+ max+ mda.get_attempts());
		}
		else if( max == mda.get_attempts())
		{
			output.IncorrectPinmsg();
			output.TooManyattempts();
			mda.set_attempts(mda.get_attempts()+1);
		}

	}
	@Override
	public void CorrectPinBelowMin()
	{
		// Calls output action Display Menu to display the Menu details 
		output.DisplayMenu();
	}
	@Override
	public void CorrectPinAboveMin()
	{
		// Calls output action Display Menu to display the Menu details
		output.DisplayMenu();
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
