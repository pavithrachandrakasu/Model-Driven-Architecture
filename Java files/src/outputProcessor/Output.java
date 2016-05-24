package outputProcessor;

import abstractFactory.*;
import dataStore.DataStore;
import strategy.*;

public class Output {

	private DataStore data;
	private StoreData storedata;
	private IncorrectIdmsg incorrectid;
	private IncorrectPinmsg incorrectpin;
	private TooManyattempts tooattempts;
	private DisplayMenu dmenu;
	private MakeDeposit mdeposit;
	private DisplayBalance dbalance;
	private PromptPin promptpin;
	private MakeWithdraw mwithdraw;
	private Penalty penalty;
	private IncorrectLockmsg lock;
	private IncorrectUnlockmsg unlock;
	private NoFundsmsg nofunds;
	AbstractSuper factory =null;
	DataStore dataStore = null;

	public Output(AbstractSuper factory,DataStore dataStore) 
	{
		// Initializes respective factory and datastore of ACCOUNT Components
        this.factory = factory;
        this.dataStore = dataStore;
    }
	public void StoreData(){
		// Initializes StoreData object and Calls output action StoreData
		storedata = factory.getStoredata();
		storedata.StoreData(dataStore);
	}
	public void PromptPin(){
		// Initializes PromptPin object and Calls output action PromptPin
		promptpin = factory.getPromptpin();
		promptpin.PromptPin();
	}
	public void DisplayMenu(){
		// Initializes DisplayMenu object and Calls output action DisplayMenu
		dmenu = factory.getDmenu();
		dmenu.DisplayMenu();
	}
	public void IncorrectIdmsg() {
		// Initializes IncorrectIdmsg object and Calls output action IncorrectIdmsg
		incorrectid = factory.getIncorrectid();
		incorrectid.IncorrectIdmsg();
	}
	public void IncorrectPinmsg() {
		// Initializes IncorrectPinmsg object and Calls output action IncorrectPinmsg
		incorrectpin = factory.getIncorrectpin();
		incorrectpin.IncorrectPinmsg();
	}
	public void TooManyattempts() {
		// Initializes TooManyattempts object and Calls output action TooManyattempts
		tooattempts = factory.getTooattempts();
		tooattempts.TooManyattempts();
	}
	public void IncorrectLockmsg(){
		// Initializes IncorrectLockmsg object and Calls output action IncorrectLockmsg
		lock = factory.getLock();
		lock.IncorrectLockmsg();
		
	}
	public void IncorrectUnlockmsg(){
		// Initializes IncorrectLockmsg object and Calls output action IncorrectLockmsg
		unlock = factory.getUnlock();
		unlock.IncorrectUnlockmsg();
	}
	public void DisplayBalance(){
		// Initializes DisplayBalance object and Calls output action DisplayBalance
		dbalance = factory.getDbalance();
		dbalance.DisplayBalance(dataStore);
	}
	public void Penalty(){
		// Initializes Penalty object and Calls output action Penalty
		penalty = factory.getPenalty();
		penalty.Penalty(dataStore);
	}
	public void NoFundsmsg(){
		// Initializes NoFundsmsg object and Calls output action NoFundsmsg
		nofunds = factory.getNofunds();
		nofunds.NoFundsmsg();
	}
	public void MakeDeposit()
	{
		// Initializes MakeDeposit object and Calls output action MakeDeposit
		mdeposit = factory.getMdeposit();
		mdeposit.MakeDeposit(dataStore);
	}
	public void MakeWithdraw()
	{
		// Initializes MakeWithdraw object and Calls output action MakeWithdraw
		mwithdraw = factory.getMwithdraw();
		mwithdraw.MakeWithdraw(dataStore);
	}
}
