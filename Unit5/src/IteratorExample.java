
import java.util.ArrayList;
import java.util.ListIterator;

 
public class IteratorExample {
    
    static ArrayList list = new ArrayList();
    static ListIterator li;
    static int pos;
  
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        li = list.listIterator();
        System.out.println("1-Move over item: "+li.next());
        //move2 
        System.out.println("Move over item"+ li.next());
        pos++;
        System.out.println("Remove" );
        li.remove();
        pos--;
        //add b back
        li.add("b");
        pos++;
        li.next();
        pos++;
        li.previous();
        pos--;
        //move7
        System.out.println("Remove last item seen");
        li.remove();
        //move 8 - move back over item
        li.previous();
        pos--;
        //move 9 - set last thing to e
        li.set("e");
        //move 10 - add b back in
        li.add("b");
        pos++;
        //move 11 - add c
        li.add("c");
        pos++;
        showList();
    }
    public static void showList(){
        for (int x=0; x<list.size();x++){
        //if(x==pos)
    }
    }
    
}
