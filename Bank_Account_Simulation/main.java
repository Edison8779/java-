import java.util.*;

public class main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        boolean b=true;
        while(b){
            System.out.println("-----Welcome-----\nEnter Account Number:");
            int acno=sc.nextInt();
            System.out.println("Enter Password:");
            int pas=sc.nextInt();
            System.out.println("Enter the Name:");
            String name=sc.nextLine();
            acc a=null;
            account ac=new account();
            if(null==ac.ispresent(acno,pas)){
                ac.add(acno,name,pas);
                System.out.println("Account created!!");
            }
            a=ac.ispresent(acno,pas);
            tt(a,ac);
            //boolean bb=true;
        }
    }
    static void tt(acc a,account ac){
        while (true){
            System.out.println("Enter the choice:");
            System.out.println("1-Deposit\n2-Withdraw\n3-Balance\n4-History\n5-Exit");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter amount to deposit");
                    int am=sc.nextInt();
                    ac.deposite(a,am);
                    break;
                case 2:
                    System.out.println("Enter amount to Withdraw");
                    int amm=sc.nextInt();
                    ac.withdraw(a,amm);
                    break;
                case 3:
                    ac.balance(a);
                    break;
                case 4:
                    System.out.println("History");
                    ac.history();
                    break;
                case 5:
                    return;
            }
        }
    }
}
