//encapsulation and access modifiers
//encapsulation: binding the data with the methods that manipulate the data


package bank;

class account {
    public String name;
    protected String email;
    private String password;   // to relose private access modifier,we use getters and setters

    // getter
    public String getPassword() {
        return this.password;
    }
    // setter
    public void setPassword(String password) {
        this.password = password;
    }
}

public class bank {
    public static void main(String[] args) {
        account account1 = new account();
        account1.email= "select@123" ;
        account1.name = "John";
        // account1.password = "1234"; // error: password has private access in account
        account1.setPassword("1234");
        System.out.println(account1.getPassword());


        //if setter is private, then we can't set the value of password but
        
    }
}














// private String name;
// private int balance;
// private int accountNumber;
// private static int lastAccountNumber = 0;

// public account(String name, int balance) {
//     this.name = name;
//     this.balance = balance;
//     this.accountNumber = lastAccountNumber++;
// }

// public void deposit(int amount) {
//     balance += amount;
// }

// public void withdraw(int amount) {
//     balance -= amount;
// }

// public int getBalance() {
//     return balance;
// }

// public int getAccountNumber() {
//     return accountNumber;
// }

// public String getName() {
//     return name;
// }