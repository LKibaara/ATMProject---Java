// ATMCalc constructor class with all its methods

public class ATMCalc
{
    int decide, topup;
    double amounts, totalWithdrawal, totalDeposit;
    public static final String ACCOUNTNAME = "Oladipupo A. Popoola";
    public static double BALANCE = 1500.65;

    Scanner input = new Scanner(System.in);
    
    public ATMCalc(double amount)
    {
        amounts = amount;
    }
    public String getName()
    {
        return ACCOUNTNAME;
    }
    public double withdrawCash(double wd)
    {
    	amounts = wd;
        if (amounts == 20)
        {
            totalWithdrawal = BALANCE - 20;
            return totalWithdrawal;
        }else if (amounts == 40){
            totalWithdrawal = BALANCE - 40;
            return totalWithdrawal;            
        }else if (amounts == 60){
            totalWithdrawal = BALANCE - 60;
            return totalWithdrawal;
        }else if (amounts == 100){
            totalWithdrawal = BALANCE - 100;
            return totalWithdrawal;
        }else if (amounts == 200){
            totalWithdrawal = BALANCE - 200;
            return totalWithdrawal;
        }
        else{ //this section under review
            String complainWithdrawal = "Please, you need to select appropriate amount";
            double showWithdrawal = Double.parseDouble(complainWithdrawal);
            return showWithdrawal;
        } 
        
    }
    public double depositCash(double dp)
    {
    	amounts = dp;
        if (amounts == 20){
            totalDeposit = BALANCE + 20;
            return totalDeposit;
        }else if (amounts == 40){
            totalDeposit = BALANCE + 40;
            return totalDeposit;
        }else if (amounts == 60){
            totalDeposit = BALANCE + 60;
            return totalDeposit;
        }else if (amounts == 100){
            totalDeposit = BALANCE + 100;
            return totalDeposit;
        }else if (amounts == 200){
            totalDeposit = BALANCE + 200;
            return totalDeposit;
        }
        else{ //this section under review
            String complainDeposit = "Please, you need to select appropriate amount";
            Double showDeposit = Double.parseDouble(complainDeposit);
            return showDeposit;
        }
    }
    public void transferFund()
    {
        System.out.println("1. \tTransfer from Your Account to Debit Card");
        System.out.println("2. \tTransfer from Your Account to Another Account");
        System.out.println("3. \tTransfer from Your Account to Third Party Account");
        System.out.println("4. \tExit/Return to Main Menu");
        System.out.println(" ");

        System.out.println("Select your Choice: ");
        decide = input.nextInt();
        
        switch(decide)
        {
          case 1:
                System.out.println("Retrieving your account data.....\n");
                System.out.println("Are you still waiting? Please don't bcus am still learning");
                break;
          case 2:
                System.out.println("Retrieving your account data.....\n");
                System.out.println("Are you still waiting? Please don't bcus am still learning");
                break;
          case 3:
                System.out.println("Retrieving your account data.....\n");
                System.out.println("Are you still waiting? Please don't bcus am still learning");
                break;
          case 4:
                break;
        }
    }
    public void topUp()
    {
        System.out.println("As a learner, we are upgrading our brain....");
        System.out.print("Please visit the nearest ATM to solve that problem for now");
    }
    /**
    public void UpdateBalance()
    {
    	for(amounts = )
    }*/
    public void getBalance()
    {
        System.out.println("===Your Account Balance Information===");
        if (totalWithdrawal != BALANCE)
        {
            System.out.println("You have withdrawn: $" + amounts);
            System.out.println("Your total after withdrawal is: $" + totalWithdrawal);
        }else if (totalDeposit != BALANCE)
        {
            System.out.println("You have deposited: $" + amounts);
            System.out.println("Your total after deposit is: $" + totalDeposit);
            
        }
        else
        {
            System.out.println("Your Current Balance is: $" + BALANCE);
        }
        
    }    
}
