import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        System.out.println("------Library Management System------");
        while (true){
            System.out.println("1-admin\n2-user\n3-exit");
            int n=sc.nextInt();
            if(n==1){
                admin();
            } else if (n==2) {
                user();
            } else if (n==3) {
                return;
            } else {
                System.out.println("choose correct option");
            }
        }
    }
    static void admin(){
        System.out.println("enter user name:");
        String name= sc.next();
        System.out.println("enter password:");
        int pass=sc.nextInt();
        if(name.equals(admin.name) && pass==admin.pas){
            while(true){
                System.out.println("enter the option:");
                System.out.println("1-add user\n2-remove user\n3-add book\n4-remove book\n5-update book\n6-show all books\n7-show all user\n8-exit");
                admin ad=new admin();
                int ch= sc.nextInt();
                switch (ch){
                    case 1:
                        System.out.println("enter user name:");
                        String nam= sc.next();
                        ad.adduser(nam);
                        break;
                    case 2:
                        System.out.println("enter user name:");
                        String unam= sc.next();
                        ad.deleteuser(unam);
                        break;
                    case 3:
                        System.out.println("enter book name:");
                        String bnam= sc.next();
                        System.out.println("enter book journal:");
                        String bj= sc.next();
                        System.out.println("enter book author:");
                        String ba= sc.next();
                        ad.addbook(bnam,bj,ba);
                        break;
                    case 4:
                        System.out.println("enter book name:");
                        String naam= sc.next();
                        ad.removbook(naam);
                        break;
                    case 5:
                        System.out.println("enter book name:");
                        String bnaam= sc.next();
                        ad.updatebook(bnaam);
                        break;
                    case 6:
                        ad.showbook();
                        break;
                    case 7:
                        ad.showuser();
                        break;
                    case 8:
                        return;
                }
            }
        }
    }
    static void user(){
        System.out.println("enter user name");
        String name= sc.next();
        admin s=new admin();
        user us=null;
        if (s.isuser(name) != null) {
            us=s.isuser(name);
        }
        else {
            us=s.add(name);
        }
        while (true){
            System.out.println("enter the option:");
            System.out.println("1-brrow book\n2-return book\n3-show brrowed book\n4-exit");
            int ch= sc.nextInt();
            admin a=new admin();
            user u=new user();
            switch (ch){
                case 1:
                    System.out.println("book name:");
                    String nam= sc.next();
                    book b=a.isbook(nam);
                    u.addbook(b);
                   // System.out.println("book added successfully");
                    break;
                case 2:
                    System.out.println("book name:");
                    String naam= sc.next();
                    book bb=a.isbook(naam);
                    u.rebook(bb);
                    //System.out.println("book removed successfully");
                    break;
                case 3:
                    u.showbook();
                    break;
                case 4:
                    return;
            }
        }
    }
}