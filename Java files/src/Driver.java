import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import abstractFactory.ConcreteFactory1;
import abstractFactory.ConcreteFactory2;
import inputProcessor.Account_1;
import inputProcessor.Account_2;
import mda_Efsm.Efsm;
import mda_States.StateSuper;
import outputProcessor.Output;

public class Driver {

	public static void main(String[] args){
			int input;
			System.out.println("Model Driven Architecture");
				Scanner in = new Scanner(System.in);
				System.out.println("Select the Account Components");
				System.out.println("1. ACCOUNT-1");
				System.out.println("2. ACCOUNT-2");
				input = in.nextInt();
				if( input == 1){
					System.out.println("You selected ACCOUNT -1");
					ConcreteFactory1 factory = new ConcreteFactory1();
					Output output = new Output(factory,factory.GetDataStore());
					StateSuper states = new StateSuper();
					states.initializeOutput(output);
					Efsm mda = new Efsm( );
					Account_1 a1 = new Account_1(mda, factory,factory.GetDataStore());
					account1_operations(a1);
				}
				else if(input == 2){
					System.out.println("You selected ACCOUNT -2");
					ConcreteFactory2 factory = new ConcreteFactory2();
					Output output = new Output(factory,factory.GetDataStore());
					StateSuper states = new StateSuper();
					states.initializeOutput(output);
					Efsm mda = new Efsm( );
					Account_2 a2 = new Account_2(mda, factory,factory.GetDataStore());
					account2_operations(a2);
				}
				else{
					System.out.println("Enter valid option");
				}
		}
		
		public static void account1_operations(Account_1 a1){
			String inputPin , inputUserid;
			float inputBal, inputdeposit, inputwithdraw;
			int userInput =0 ;
			System.out.println("\n");
			System.out.println("ACCOUNT-1");
			System.out.println("MENU OF OPERATIONS");
			System.out.println("1. open(String p,string y , float a)");
			System.out.println("2. login (string y)");
			System.out.println("3. pin(string x)");
			System.out.println("4. deposit(float d)");
			System.out.println("5. withdraw (float w)");
			System.out.println("6. balance()");
			System.out.println("7. lock(string x)");
			System.out.println("8. unlock(string x)");
			System.out.println("9. logout( )");
			System.out.println(" 10. Quit the demo program" );
			System.out.println(" Please make a note of these operations" );
			System.out.println("ACCOUNT-1 Execution");
			do{
				System.out.println("Select Operation:");
				System.out.println(" 1-open , 2-login, 3-pin, 4-deposit, 5-withdraw, 6-balance, 7-lock"
						+ " 8-unlock, 9-logout, 10-Quit");
				Scanner sc1 = new Scanner(System.in);
				userInput=sc1.nextInt();
				if(userInput <= 10 )
				{
				Scanner sc2 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in);
				Scanner sc4 = new Scanner(System.in);
				switch (userInput) {
				case 1: System.out.println("OPERATION open(String, String, float):");
				System.out.println("Enter the value of parameter p (pin)");
				inputPin = sc2.nextLine();
				System.out.println("Enter the value of parameter y (user_id)");
				inputUserid = sc3.nextLine();
				System.out.println("Enter the value of parameter a (balance)");
				inputBal = sc3.nextFloat();
				a1.open(inputPin, inputUserid, inputBal);
				break;
				case 2: System.out.println("OPERATION login(String):");
				System.out.println("Enter the value of parameter y (user_id)");
				inputUserid = sc3.nextLine();
				a1.login(inputUserid);
				break;
				case 3: System.out.println("OPERATION pin(String):");
				System.out.println("Enter the value of parameter x (pin)");
				inputPin = sc3.nextLine();
				a1.pin(inputPin);
				break;
				case 4: System.out.println("OPERATION deposit(float):");
				System.out.println("Enter the value of parameter d (deposit amount)");
				inputdeposit = sc3.nextFloat();
				a1.deposit(inputdeposit);
				break;
				case 5: System.out.println("OPERATION withdraw(float):");
				System.out.println("Enter the value of parameter w (withdrawal amount)");
				inputwithdraw = sc3.nextFloat();
				a1.withdraw(inputwithdraw);
				break;
				case 6: System.out.println("OPERATION balance():");
				a1.balance();
				break;
				case 7: System.out.println("OPERATION lock(String):");
				System.out.println("Enter the value of parameter x (pin)");
				inputPin = sc3.nextLine();
				a1.lock(inputPin);
				break;
				case 8: System.out.println("OPERATION unlock(String):");
				System.out.println("Enter the value of parameter x (pin)");
				inputPin = sc3.nextLine();
				a1.unlock(inputPin);
				break;
				case 9: System.out.println("OPERATION logout():");
				a1.logout();
				break;
				case 10: System.out.println("OPERATION quit()");
				System.exit(0);
				default: System.out.println("ENTER VALID INPUT OPERTION");
				break;
				}
				}
				else
				{
					System.out.println("ENTER VALID INPUT OPERTION");
					account1_operations(a1);
				}
		}while(( userInput > 0 )&&( userInput < 11 ));
	}
		public static void account2_operations(Account_2 a2){
			int inputPin , inputUserid, inputBal, inputdeposit, inputwithdraw;
			int userInput =0 ;
			System.out.println("\n");
			System.out.println("ACCOUNT-2");
			System.out.println("MENU OF OPERATIONS");
			System.out.println("0. OPEN(int p,int y , int a)");
			System.out.println("1. LOGIN(int y)");
			System.out.println("2. PIN (int x)");
			System.out.println("3. DEPOSIT(int d)");
			System.out.println("4. WITHDRAW (int w)");
			System.out.println("5. BALANCE()");
			System.out.println("6. LOGOUT()");
			System.out.println("7. suspend()");
			System.out.println("8. activate() " );
			System.out.println("9. close() " );
			System.out.println("10. Quit the Program");
			System.out.println(" Please make a note of these operations" );
			System.out.println("ACCOUNT-2 Execution");
			do{
				System.out.println("Select Operation:");
				System.out.println(" 0-OPEN , 1-LOGIN, 2-PIN, 3-DEPOSIT, 4-WITHDRAW, 5-BALANCE, 6-LOGOUT, 7-suspend"
						+ " 8-activate, 9-close, 10-Quit");
				Scanner sc1 = new Scanner(System.in);
				userInput=sc1.nextInt();
				if(userInput <= 10 )
				{
				Scanner sc2 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in);
				Scanner sc4 = new Scanner(System.in);
				switch (userInput) {
				case 0: System.out.println("OPERATION OPEN(int, int, int):");
				System.out.println("Enter the value of parameter p (pin)");
				inputPin = sc2.nextInt();
				System.out.println("Enter the value of parameter y (user_id)");
				inputUserid = sc3.nextInt();
				System.out.println("Enter the value of parameter a (balance)");
				inputBal = sc3.nextInt();
				a2.OPEN(inputPin, inputUserid, inputBal);
				break;
				case 1: System.out.println("OPERATION LOGIN(int):");
				System.out.println("Enter the value of parameter y (user_id)");
				inputUserid = sc3.nextInt();
				a2.LOGIN(inputUserid);
				break;
				case 2: System.out.println("OPERATION PIN(int):");
				System.out.println("Enter the value of parameter x (pin)");
				inputPin = sc3.nextInt();
				a2.PIN(inputPin);
				break;
				case 3: System.out.println("OPERATION DEPOSIT(int):");
				System.out.println("Enter the value of parameter d (deposit amount)");
				inputdeposit = sc3.nextInt();
				a2.DEPOSIT(inputdeposit);
				break;
				case 4: System.out.println("OPERATION WITHDRAW(INT):");
				System.out.println("Enter the value of parameter w (withdrawal amount)");
				inputwithdraw = sc3.nextInt();
				a2.WITHDRAW(inputwithdraw);
				break;
				case 5: System.out.println("OPERATION BALANCE():");
				a2.BALANCE();
				break;
				case 6: System.out.println("OPERATION LOGOUT():");
				a2.LOGOUT();
				break;
				case 7: System.out.println("OPERATION suspend():");
				a2.suspend();
				break;
				case 8: System.out.println("OPERATION activate():");
				a2.activate();
				break;
				case 9: System.out.println("OPERATION close():");
				a2.close();
				break;
				case 10: System.out.println("OPERATION quit()");
				System.exit(0);
				default: System.out.println("Enter Valid Input Operation");
				break;
				}
				}
				else
				{
					System.out.println("ENTER VALID INPUT OPERTION");
					account2_operations(a2);
				}
		}while(( userInput >= 0 )&&( userInput < 11 ));
	}
}			
				