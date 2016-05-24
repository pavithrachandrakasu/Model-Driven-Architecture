package abstractFactory;

import dataStore.*;
import strategy.*;

public class AbstractSuper {
	
	public DataStore CreateDataStore()
	{
		return null;
	}
	public DataStore GetDataStore()
	{
		return null;
	}

	public StoreData getStoredata() {
		return null;
	}

	public IncorrectIdmsg getIncorrectid() {
		return null;
	}
	public IncorrectPinmsg getIncorrectpin() {
		return null;
	}
	public TooManyattempts getTooattempts() {
		return null;
	}
	public DisplayMenu getDmenu() {
		return null;
	}

	public MakeDeposit getMdeposit() {
		return null;
	}

	public DisplayBalance getDbalance() {
		return null;
	}

	public PromptPin getPromptpin() {
		return null;
	}

	public MakeWithdraw getMwithdraw() {
		return null;
	}

	public Penalty getPenalty() {
		return null;
	}

	public IncorrectLockmsg getLock() {
		return null;
	}
	
	public IncorrectUnlockmsg getUnlock() {
		return null;
	}

	public NoFundsmsg getNofunds() {
		return null;
	}

}
