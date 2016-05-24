package abstractFactory;

import dataStore.DataStore;
import strategy.*;
import dataStore.DataStore1;

public class ConcreteFactory1 extends AbstractSuper {
	
	DataStore dataStore = new DataStore1();

	public DataStore CreateDataStore()
	{
		// creates DataStore 1 object
		return(this.dataStore);
	}
	
	public DataStore GetDataStore()
	{
		// returns object of DataStore1
		return this.dataStore;
	}

	public StoreData getStoredata() {
		// returns object of StoreData1
		return new StoreData1();
	}

	public IncorrectIdmsg getIncorrectid() {
		// returns object of IncorrectIdmsg1
		return new IncorrectIdmsg1();
	}
	public IncorrectPinmsg getIncorrectpin() {
		// returns object of IncorrectPinmsg1
		return new IncorrectPinmsg1();
	}
	public TooManyattempts getTooattempts() {
		// returns object of TooManyattempts1
		return new TooManyattempts1();
	}
	public DisplayMenu getDmenu() {
		// returns object of DisplayMenu1
		return new DisplayMenu1();
	}

	public MakeDeposit getMdeposit() {
		// returns object of MakeDeposit1
		return new MakeDeposit1();
	}

	public DisplayBalance getDbalance() {
		// returns object of DisplayBalance1
		return new DisplayBalance1();
	}

	public PromptPin getPromptpin() {
		// returns object of PromptPin1
		return new PromptPin1();
	}

	public MakeWithdraw getMwithdraw() {
		// returns object of MakeWithdraw1
		return new MakeWithdraw1();
	}

	public Penalty getPenalty() {
		// returns object of Penalty1
		return new Penalty1();
	}

	public IncorrectLockmsg getLock() {
		// returns object of IncorrectLockmsg1
		return new IncorrectLockmsg1();
	}
	
	public IncorrectUnlockmsg getUnlock() {
		// returns object of IncorrectUnlockmsg1
		return new IncorrectUnlockmsg1();
	}

	public NoFundsmsg getNofunds() {
		// returns object of NoFundsmsg1
		return new NoFundsmsg1();
	}
	
}
