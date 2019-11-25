public class Account
{
private double balance; //state

public Account(double amount){
if (amount < 0){
    System.out.println("Unable to open account with negative amount");
}
else {
    balance = amount;
}
}
public Account(){
balance = 0;
}

public void deposit(double amount){
if (amount < 0){
    System.out.println("Unable to deposit negative amount");
}
else {
    balance = balance + amount;
    if (balance >= 100000){
        System.out.println("You are now rich");
}
}
}
public void withdraw(double amount){
if (amount > balance){
    System.out.println("Unable to complete withdrawal - insufficient funds");
}
else {
    balance = balance - amount;
}
}


public double getBalance(){
return balance;
}

public void close(){
balance =0;
}

}
