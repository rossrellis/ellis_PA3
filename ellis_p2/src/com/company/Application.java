package com.company;

class SavingsAccount{
    private double annualInterestRate;
    private double savingsBalance;
    public double calculateMonthlyInterest(){
        double interest = (savingsBalance*annualInterestRate)/12;
        savingsBalance = interest + savingsBalance;
        return interest;
    }
    public void savingsAccount(int amount){
        savingsBalance = amount;
    }
    public void interest(double amount){
        annualInterestRate = amount;
    }
    public double savings(){
        return savingsBalance;
    }

}
public class Application {
    public static void modifyInterestRate(double amount){
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.interest(amount);
        saver2.interest(amount);


    }
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        SavingsAccount saver3 = new SavingsAccount();

        saver1.savingsAccount(2000);
        saver2.savingsAccount(3000);

        saver1.interest(.04);
        saver2.interest(.04);
        System.out.println("For an interest rate of 4%:");
        for(int i=0;i<12;i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.printf("Ending balance for saver 1 is %.2f\n", saver1.savings());
        System.out.printf("Ending balance for saver 2 is %.2f\n", saver2.savings());


        modifyInterestRate(.05);
        System.out.println("Modified interest rate to 5%");
        for(int i=0;i<12;i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.printf("Ending balance for saver 1 is %.2f\n", saver1.savings());
        System.out.printf("Ending balance for saver 2 is %.2f\n", saver2.savings());



    }
}
