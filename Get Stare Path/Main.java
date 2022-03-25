import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       ArrayList<String> ans = getStairPaths(n);
       System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n <= 0){
            ArrayList<String> bres = new ArrayList<>();
         
            if(n == 0){
                bres.add("");
            }
         
            return bres;
        }
        
        // totel possible steps for n-1
        ArrayList<String> rr1 = getStairPaths(n-1);
        //totel possibal steps for n-2
        ArrayList<String> rr2 = getStairPaths(n-2);
        //totel possibal steps for n-3
        ArrayList<String> rr3 = getStairPaths(n-3);
        
        //Ans Array
        ArrayList <String> myAns = new ArrayList<>();
        
        for(int i = 0; i<rr1.size(); i++){
            myAns.add(1+rr1.get(i));
        }
        
        for(int i = 0; i<rr2.size(); i++){
            myAns.add(2+rr2.get(i));
        }
        
        for(int i = 0; i<rr3.size(); i++){
            myAns.add(3+rr3.get(i));
        }
        
        return myAns;
    }

}