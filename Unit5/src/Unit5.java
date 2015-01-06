

import java.util.ArrayList;

   static ArrayList al = new ArrayList()

public class Unit5 {
 
        al.add("A");
        al.add(0,"B");
        al.add("BANANA");
        al.add("PEAR");
        al.add(1,"ORANGE");
        
        
        System.out.println("BANANA is at: "+al.indexOf("BANANA"));
        al.set(3,"KIWI");
        al.remove(0);
        al.remove("A");
        show();
    public static void main(String[] args) {

    }
    public static void show(){
        for (int x=0;x<al.size();x++){
            String letter = String.valueOf(al.get(x));
            System.out.println("Location"+x+"->"+letter);
        }
            
    }
}


