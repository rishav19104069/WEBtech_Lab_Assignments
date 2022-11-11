package CourseWork_PEC.Assignment5.Question2;

class Bank{
    String parent_bank = "RBI";
    int interest_rate;
    int min_balance;
    int max_withdraw;
    Bank(){
        interest_rate = 4;
        min_balance = 2000;
        max_withdraw = 10000;
    }
    void setInterest_rate(int interest_rate){
        this.interest_rate = interest_rate;
    }
    int getInterest_rate(){
        return interest_rate;
    }

}

class SBI extends Bank{
    void setInterest_rate(int interest_rate){
        this.interest_rate = interest_rate;
    }
    int getInterest_rate(){
        return interest_rate;
    }
}

class ICICI extends Bank{
    void setInterest_rate(int interest_rate){
        this.interest_rate = interest_rate;
    }
    int getInterest_rate(){
        return interest_rate;
    }
}
class Customer{
    String name;
    int age;
    int default_money;
    Customer(String name,int age,int money){
        this.name = name;
        this.age = age;
        default_money = money;
    }


    public Customer(Customer c) {
        this.name = c.name;
        this.age = c.age;
        this.default_money = c.default_money;
    }
}

class Account extends Customer{
    Bank bank;
    Account(String name, int age, int money,Bank bank) {
        super(name, age, money);
        this.bank = bank;
    }
    Account(Customer c, Bank b){
        super(c);
        bank = b;
    }
    void withdraw(int amount){
        if(amount>default_money) {
            System.out.println("You do not have enough balance");
            return;
        }
        if(amount>10000) {
            System.out.println("Limit 10000 exceeded to withdraw cash");
            return;
        }
        else{
            System.out.println("---Withdrawing cash---");
            if(default_money-amount<2000){
                System.out.println("Cannot withdraw money. minimum balance of Rs. 2000 required");
            }
            default_money -= amount;

            System.out.println("Current balance : " + default_money);
            return;
        }
    }
    void deposit_cash(int amount){
        default_money += amount;
        System.out.println("Money deposited successfully!");
        System.out.println("Your Current balance is : " + default_money);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Customer customer = new Customer("Rishav",22,10000);
        Account account1 = new Account(customer,new ICICI());
        account1.bank.setInterest_rate(6);
        System.out.println("Interest rate is : " + account1.bank.getInterest_rate());
        account1.deposit_cash(5000);
        account1.withdraw(7000);
        account1.withdraw(3000);
    }
}
