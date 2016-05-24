package abstractFactory;


import dataStore.DataStore;
import dataStore.DataStore2;
import strategy.*;


public class ConcreteFactory2 extends AbstractSuper {
	DataStore dataStore = new DataStore2();
	
	public StoreData getStoredata() {
		// returns object of StoreData2
		return new StoreData2();
	}
	public DataStore CreateDataStore()
	{
		// creates DataStore2 object
		return(this.dataStore);
	}
	public DataStore GetDataStore()
	{
		// returns object of DataStore2
		return this.dataStore;
	}
	public IncorrectIdmsg getIncorrectid() {
		// returns object of IncorrectIdmsg2
		return new IncorrectIdmsg2();
	}
	public IncorrectPinmsg getIncorrectpin() {
		// returns object of IncorrectPinmsg2
		return new IncorrectPinmsg2();
	}
	public TooManyattempts getTooattempts() {
		// returns object of TooManyattempts2
		return new TooManyattempts2();
	}
	public DisplayMenu getDmenu() {
		// returns object of DisplayMenu2
		return new DisplayMenu2();
	}

	public MakeDeposit getMdeposit() {
		// returns object of MakeDeposit2
		return new MakeDeposit2();
	}

	public DisplayBalance getDbalance() {
		// returns object of DisplayBalance2
		return new DisplayBalance2();
	}

	public PromptPin getPromptpin() {
		// returns object of PromptPin2
		return new PromptPin2();
	}

	public MakeWithdraw getMwithdraw() {
		// returns object of MakeWithdraw2
		return new MakeWithdraw2();
	}

	public NoFundsmsg getNofunds() {
		// returns object of NoFundsmsg1
		return new NoFundsmsg1();
	}
	
}
