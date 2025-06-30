import java.util.*;
public class acc {
    private int accno;
    String name;
    private int pass;
    int balance;
    HashMap<Integer,String> history=new HashMap<>();

    public acc(int accno,String name,int pass) {
        this.accno = accno;
        this.name=name;
        this.pass=pass;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }
    public String getName(String name){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public HashMap<Integer, String> getHistory() {
        return history;
    }

    public void setHistory(HashMap<Integer, String> history) {
        this.history = history;
    }
    void his(){
        for(Integer i: history.keySet()){
            System.out.println(i+" "+history.get(i));
        }
    }
}
