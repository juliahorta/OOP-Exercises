
public class TestAccount
{
public static void main(String[] args){
Account[] accounts=new Account[30];
//System.out.println(acc1.getBalance());

for(int i=0;i<30;i++){
accounts[i]=new Account(100*i);
System.out.println(accounts[i].getBalance());
}
}
}