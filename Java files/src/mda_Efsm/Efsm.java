package mda_Efsm;

import mda_States.*;
import outputProcessor.Output;
import abstractFactory.*;;

public class Efsm {
	
	// pointer to all States
	private StateSuper slist[] = { new StartState(this), new IdleState(this), new CheckpinState(this), 
			new ReadyState(this), new S1State(this), new OverdrawnState(this), new LockedState(this), new SuspendedState(this), 
			new StopState(this)};
	// Pointer to current State
	public StateSuper s = slist[0];
	// attempts variable for checking pin entries
	public int attempts; 
	AbstractSuper factory =null; // initializes abstract factory
	Output output = null; // initializes output processer

	public void Open()
	{
		// store p, y and a in temp data store
		s.Open();
		switch (s.get_id()) { 
		case 1: s=slist[1]; //State change from Start to Idle State
		//System.out.println("State changed to Idle");
		break;
	}
	}
	public void Login()
	{
		// set attempts to zero and Display Prompt for Pin message
		s.Login();
		switch (s.get_id()) { 
		case 2: s=slist[2]; //State change from Idle to Check Pin State
		//System.out.println("State changed to CheckPin");
		break;
		}
	}
	public void IncorrectLogin()
	{
		// displays a incorrectId msg
		s.IncorrectLogin();
		// No change of state
	}
	public void IncorectPin(int max) 
	{
		// checks for maximum number of attempts and displays a TooManyAttemptsMsg if exceeds maxximum
		s.IncorectPin(max);	
		switch (s.get_id()) {
		case 3: 
		if(attempts  == max+1 )
		{
		s=slist[1];
		//System.out.println("State changed to IDLE");
		}
		else if(attempts  < max+1)
		{	//No change of State
		//System.out.println("State - CHECKPIN");
		}
		break;
		}
	}
	public void CorrectPinBelowMin()
	{
		// Calls CorrectPinBelowMin to do action in respective state and changes to State Overdrawn
		s.CorrectPinBelowMin();
		switch (s.get_id()) {
		case 3: s = slist[5];
		//System.out.println("State changed to OVERDRAWN");
		break;
		}
	}
	public void CorrectPinAboveMin()
	{
		/**
		 * Calls CorrectPinAboveMin to do action in respective state and changes to State to Ready
		 */
		s.CorrectPinAboveMin();
		switch (s.get_id()) {
		case 3: s = slist[3];
		//System.out.println("State changed to READY");
		break;
		}
	}
	public void Deposit()
	{
		/**
		 * Calls Deposit to do action in respective state and performs respective state Transition
		 */
		s.Deposit();
		switch (s.get_id()) {
		case 4: s = slist[3];
		//System.out.println("State - READY");
		break;
		case 6: s = slist[4];
		//System.out.println("State changed to S1");
		break;
		}
	}
	public void BelowMinBalance()
	{
		/**
		 * Calls BelowMinBalance to do action in states and changes to state overdrawn
		 */
		s.BelowMinBalance();
		switch (s.get_id()) {
		case 5: s = slist[5];
		//System.out.println("State changed to OVERDRAWN");
		break;
		}
	}
	public void AboveMinBalance()
	{
		/**
		 * Calls AboveMinBalance to do action in states and changes to state ready
		 */
		s.AboveMinBalance();
		switch (s.get_id()) {
		case 5: s = slist[3];
		//System.out.println("State changed to READY");
		break;
		}
	}
	public void Logout()
	{
		/**
		 * Calls Logout to do action in states and changes state respectively
		 */
		s.Logout();
		switch (s.get_id()) {
		case 3: s = slist[1];
		//System.out.println("State changed to IDLE");
		break;
		case 4: s = slist[1];
		//System.out.println("State changed to IDLE");
		break;
		case 6: s = slist[1];
		//System.out.println("State changed to IDLE");
		break;
	}
	}
	public void Balance()
	{
		/**
		 * Calls Balance to do action in states and performs state transition here
		 */
		s.Balance();
		// No state Change
		switch (s.get_id()) {
		case 4: s = slist[3];
		//System.out.println("State - READY");
		break;
		case 8: s = slist[7];
		//System.out.println("State - Suspended");
		break;
		case 6: s = slist[5];
		//System.out.println("State - Overdrawn");
		break;
		}
	}
	public void Withdraw()
	{
		/**
		 * Calls withdraw to do action in states and performs state transition here
		 */
		s.Withdraw();
		switch (s.get_id()) {
		case 4: s = slist[4];
		//System.out.println("State changed to S1");
		break;
		case 6: s = slist[5];
		//System.out.println("State - Overdrawn"); // no change of state
		break;

		}
	}
	public void WithdrawBelowMinBalance()
	{
		/**
		 * Calls WithdrawBelowMinBalance to do action in states and performs state transition here
		 */
		s.WithdrawBelowMinBalance();
		switch (s.get_id()) {
		case 5: s = slist[5];
		//System.out.println("State changed to OVERDRAWN");
		break;

		}
	}
	public void NoFunds()
	{
		/**
		 * Calls NoFunds to do action in states and performs state transition here
		 */
		s.NoFunds();
		switch (s.get_id()) {
		case 4: s = slist[3];
		//System.out.println("State - READY");
		break;

		}
	}
	public void Lock()
	{
        // Calls Lock to do action in states and performs state transition here
		s.Lock();
		switch (s.get_id()) {
		case 4: s = slist[6];
		//System.out.println("State changed to LOCKED");
		break;
		case 6: s = slist[6];
		//System.out.println("State changed to LOCKED");
		break;

		}
	}
	public void IncorrectLock(){
		
		// Calls IncorrectLock to do action in states and performs state transition here
		
		s.IncorrectLock();
		switch (s.get_id()) {
		case 4: s = slist[3];
		// no state change
		//System.out.println("State - READY");
		break;
		case 6: s = slist[5];
		//System.out.println("State - Overdrawn");
		break;


		}
	}
	public void Unlock()
	{
		// Calls Unlock to do action in states and performs state transition here
		s.Unlock();
		switch (s.get_id()) {
		case 7: s = slist[4];
		//System.out.println("State changed to S1");
		break;

		}
	}
	public void IncorrectUnlock()
	{
		// Calls IncorrectUnlock to do action in states and performs state transition here
		s.IncorrectUnlock();
		switch (s.get_id()) {
		case 7: s = slist[6];
		//System.out.println("State - LOCK");  // no change of state
		break;

		}
	}
	public void Suspend()
	{
		// Calls Suspend to do action in states and performs state transition here
		s.Suspend();
		switch (s.get_id()) {
		case 4: s = slist[7];
		//System.out.println("State changed to SUSPENDED");  
		break;
		}
	}
	public void Activate()
	{
		// Calls Activate to do action in states and performs state transition here
		s.Activate();
		switch (s.get_id()) {
		case 8: s = slist[3];
		//System.out.println("State changed to READY"); 
		break;

		}
	}
	public void Close()
	{
		// Calls Close to do action in states and performs state transition here
		s.Close();
		switch (s.get_id()) {
		case 8: s = slist[8];
		//System.out.println("State changed to CLOSED"); 
		break;

		}
	}
	public int get_attempts( )
	{
		return attempts;
	}
	public void set_attempts(int attempts) {
		this.attempts = attempts;
	}
}
