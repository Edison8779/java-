import java.util.*;
public class account {
    static ArrayList<acc> account=new ArrayList<>();
    acc ispresent(int accno,int pass){
        acc ac=null;
        for(acc a:account){
            if(a.getAccno()==accno && a.getPass()==pass){
                ac=a;
            }
        }
        if(ac!=null){
            return ac;
        }
        return null;
    }
   /* boolean isvalid(int amount){
        for(acc a:account){
            if(a.getBalance()>=amount){
                return true;
            }
        }
    }*/
    void add(int acno,String name,int pass){
        account.add(new acc(acno,name,pass));
    }
    void withdraw(acc ac,int amount){
        HashMap<Integer,String> map=ac.getHistory();
        if(ac.getBalance()>=amount){
            int am=ac.getBalance()-amount;
            ac.setBalance(am);
            map.put(ac.getAccno(),map.getOrDefault(ac.getAccno(),"")+"\nnew balance"+ac.getBalance());
            ac.setHistory(map);
            System.out.println("new balance:"+ac.getBalance());
        }
        else {
            map.put(ac.getAccno(),map.getOrDefault(ac.getAccno(),"")+"\ninsufficient balance");
            ac.setHistory(map);
            System.out.println("insufficient balance");
        }
    }
    void deposite(acc ac,int amount){
        HashMap<Integer,String> map=ac.getHistory();
        ac.setBalance(amount);
        map.put(ac.getAccno(),map.getOrDefault(ac.getAccno(),"")+"\nnew balance:"+ac.getBalance());
        ac.setHistory(map);
        System.out.println("new balance:"+ac.getBalance());
    }
    void balance(acc ac){
        HashMap<Integer,String> map=ac.getHistory();
        map.put(ac.getAccno(),map.getOrDefault(ac.getAccno(),"")+"\nBalance:"+ac.getBalance());
        ac.setHistory(map);
        System.out.println("Balance:"+ac.getBalance());
    }
    void history(){
        for(acc ac:account){
            ac.his();
        }
    }
}
