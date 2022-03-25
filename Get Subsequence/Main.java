import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       
       ArrayList<String> ans = gss(str);
       System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rr = gss(ros);
        
        ArrayList<String> myAns = new ArrayList<>();
        
        for(String rstr : rr){
            myAns.add(rstr);
        }
        
        for(int i = 0; i<rr.size(); i++){
            myAns.add(ch+rr.get(i));
        }
        
        return myAns;
    }

}