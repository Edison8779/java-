import java.util.*;

public class admin {
    static String name="admin";
    static int pas=0000;
    static ArrayList<book> bo=new ArrayList<>();
    static ArrayList<user> us=new ArrayList<>();
    static int count=0;
    user isuser(String name){
        user uu=null;
        for(user u:us){
            if(u.name.equals(name)){
               uu=u;
            }
        }
        if(uu!=null){
            return uu;
        }
        return null;
    }
    void adduser(String name){
        int c=++count;
        us.add(new user(c,name));
        System.out.println("user added successfully");
    }
    user add(String name){
        int c=++count;
        user u=new user(c,name);
        us.add(u);
        return u;
    }
    void deleteuser(String name){
        user user=null;
        for(user u:us){
            if(u.name.equals(name)){
                user=u;
                break;
            }
        }
      if(user!=null){
          us.remove(user);
          System.out.println("user removed!!");
      }
      else{
          System.out.println("user not found!!");
      }
    }
    void addbook(String name,String journal,String author){
        bo.add(new book(name,journal,author));
        System.out.println("book added successfully");
    }
    book isbook(String name){
        book bb=null;
        for (book b:bo){
            if(name.equals(b.bname)){
                bb= b;
            }
        }
        if(bb!=null){
            return bb;
        }
        return null;
    }
    void updatebook(String name){
        book bb=isbook(name);
        if(bb!=null){
            System.out.println("enter bname:");
            Scanner sc=new Scanner(System.in);
            String bn=sc.next();
            System.out.println("enter journal:");
            String bj=sc.next();
            System.out.println("enter Author:");
            String ba=sc.next();
            bb.setBname(bn);
            bb.setAuthor(ba);
            bb.setJournal(bj);
            System.out.println("updated successfully");
        }
        else {
            System.out.println("book not found!!");
        }
    }
    void  removbook(String name){
        book bb=null;
        for(book b:bo){
            if(b.bname.equals(name)){
                bb=b;
                break;
            }
        }
        if(bb!=null){
            bo.remove(bb);
            System.out.println("book removed successfully");
        }else{
        System.out.println("not fount");}
    }
    void showbook(){
        if(!bo.isEmpty()){
            for (book b:bo){
                System.out.println(b.bname+" "+b.journal+" "+b.author);
            }
        }
        else{
            System.out.println("no books available");
        }
    }
    void showuser(){
        if(!us.isEmpty()){
        for(user u:us){
            System.out.println(u.id+" "+u.name+" "+u.cbook);
        }}
        else {
            System.out.println("no user available");
        }
    }
}
