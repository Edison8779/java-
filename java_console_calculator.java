import java.util.*;
public class java_console_calculator {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        boolean b=true;
       while(b){
           System.out.println("-----CALCULATOR-----");
           System.out.println("Enter the Option:");
           System.out.println("Addition-1\nSubtraction-2\nMultiplcation-3\nDivision-4\nExit-5");
           int op= sc.nextInt();
           switch (op){
               case 1:
                   add();
                   break;
               case 2:
                   sub();
                   break;
               case 3:
                   mul();
                   break;
               case 4:
                   div();
                   break;
               case 5:
                   b=false;
                   sc.close();
                   break;
               default:
                   System.out.println("wrong option");
                   return;
           }
       }
    }
    static void add(){
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2:");
        int b=sc.nextInt();
            int c=a+b;
        System.out.println("addition of two numbers:"+c);
    }
    static void sub(){
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2:");
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("Subtraction of two numbers:"+c);
    }
    static void mul(){
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2:");
        int b=sc.nextInt();
        long c=a*b;
        System.out.println("Multiplcation of two numbers:"+(int)c);
    }
    static void div(){
        System.out.println("Enter number 1:");
        int a=sc.nextInt();
        System.out.println("Enter number 2:");
        int b=sc.nextInt();
        int c=0;
        if(b>0){
        c=a/b;
            System.out.println("Division of two numbers:"+c);}
        else{
            System.out.println("undefined because of diviser 0");
        }
    }
}
