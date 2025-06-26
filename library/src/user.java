import java.util.*;

public class user {
    int id;
    String name;
    static ArrayList<book> cbook=new ArrayList<>();
    user(){

    }
    public user(int id,String name) {
        this.id=id;
        this.name=name;
    }
    boolean addbook(book book){
        if(cbook.size()<6 && book.isavailable()){
            book.setIsavailable(false);
            cbook.add(book);
            System.out.println("book added successfully");
            return true;
        }
        System.out.println("not available");
        return false;
    }
    book rebook(book book){
        String bna=book.bname;
        for(book b:cbook){
            if(bna.equals(b.bname)){
                b.setIsavailable(true);
                System.out.println("book removed successfully");
                return b;
            }
        }
        System.out.println("not found");
        return null;
    }
    void showbook(){
        for (book b:cbook){
            System.out.println(b.getBname()+" "+b.getJournal()+" "+b.getAuthor());
        }
    }
    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cbook=" + cbook +
                '}';
    }
}
