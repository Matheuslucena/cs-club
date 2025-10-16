package Programs.src.chapterFive;

/*
***********************************************************
ManageAccounts.java
Author: 
Use Account class to create and manage Sally and Joe's
bank accounts
************************************************************
**/
public class BankTester {
    public static void main(String[] args) {

        System.out.println(" Welcome to the Bank ");

        // create BankAccount object using the BankAccount class
        BankAccount acct1 = new BankAccount();

        // Display the state of acct1 (call toString method)
        System.out.println(acct1.toString() + "\n");

        /*
         * set the name of acct1 to Joe, acct number to 2345 and deposits $400
         * You need to invoke/call setName and setAcctNumber and deposit methods of
         * acct1 object
         * respectively
         */
        System.out.println("After calling the setter methods of acct1");
        acct1.setName("Joe");
        acct1.setAcctNumber(2345);
        acct1.deposit(400);

        // Display the state (values of all of the instance variables) of acct1
        System.out.println(acct1.toString() + "\n");

        // deposit $500 to acct1 object
        acct1.deposit(500);

        // withdraw $200 from acct1 object
        acct1.withdraw(200);

        // print acct1's new balance (use getBalance())
        System.out.println("The balance of acct1: " + acct1.getBalance());

        // display the state(values of all of its instance variables) of acct1
        System.out.println(acct1.toString());

    }
}

/*
 * Name: unknown
 * Account Number: 0
 * Balance: 0.0
 * 
 * After calling the setter methods of acct1
 * Name: Joe
 * Account Number: 2345
 * Balance: 400.0
 * 
 * The balance of acct1 : 700.0
 * Name: Joe
 * Account Number: 2345
 * Balance: 700.0
 * 
 * 
 * 
 */
