import java.util.Scanner;

public class ATMProject
{
    
    public static final String ACCOUNTNUMBER = "19820428RS";
    public static final long PIN = 1327515;
    
    public static void main(String[] args)
    {
        int choice; long pinCode; 
        String accountNo; 
        boolean test = true;

        double amount = 0;
              
        do
        {
            //display Welcome Screen Message
            System.out.println("=========Welcome to Rijja Community Bank===========");
        
            Scanner input = new Scanner(System.in); //create an object of the Scanner class
            
            ATMCalc calc = new ATMCalc(amount);
        
            //Replaces the Card biometric scanning processes
            System.out.println("Enter your Account No: \t");
            accountNo = input.next();
        
            System.out.println("Enter your PIN: ");
            pinCode = input.nextInt();
        
            if((accountNo.equals(ACCOUNTNUMBER)) && (pinCode == PIN))
            {
                System.out.println("This is " + ATMCalc.ACCOUNTNAME + " 's Current Account");
                System.out.println(" ");
                //Display Main Menu Options
                System.out.println("======Main Menu (Enter the Number to select option)======");
                System.out.println("1. \rView my Balance");
                System.out.println("2. \rWithdraw Cash");
                System.out.println("3. \rDeposit Cash");
                System.out.println("4. \rTransfer Fund");
                System.out.println("5. \rPurchase Top-up Voucher");
                System.out.println("6. \rExit for Another User");
        
                System.out.println( "Enter your Choice: ");
                choice = input.nextInt();

                switch(choice)
                {
                    case 1:
                    		calc = new ATMCalc(amount);
                            calc.getBalance();
                            test = false;
                            break;
                    case 2: //case for withdrawal
                            System.out.println("===Select Withdrawal Option===");
                            System.out.print("1. $20\t2. $40\t3. $60\t4. $100\t5. $200");
                            System.out.print("Enter the Amount: $");
                            amount = input.nextDouble();
                            //calc = new ATMCalc(amount);
                            calc.withdrawCash(amount);
                            calc.getBalance();
                            test = false;
                            continue;

                    case 3: //case for deposit
                            System.out.println("===Select Deposit Option===");
                            System.out.print("1. $20\t2. $40\t3. $60\t4. $100\t5. $200");
                            System.out.print("Enter the Amount: $");
                            amount = input.nextDouble();
                            //calc = new ATMCalc(amount);
                            calc.depositCash(amount);
                            calc.getBalance();
                            break;
                    case 4:
                            System.out.println("Entering Transfer mode......");
                            calc.transferFund();
                            break;
                    case 5:
                            System.out.println("Entering Phone Top-up mode......");
                            calc.topUp();
                            break;
                    case 6:
                            test = false;
                    		break;
                }
            }
           
            else
            {
                System.out.println("Please enter the correct Account Details");
                System.out.print(" ");
                test = false;
                continue;
            }
            
        }while(test == false);
    }
    
}
