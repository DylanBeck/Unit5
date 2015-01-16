
import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue{

    private ArrayList list[];//an array of ArrayLists
    private int size; // refers to number of priorities

    public LinkedPriorityQueue(int s) {
        size = s;
        list = new ArrayList[size]; //establish how many lists
        for(int x = 0; x < size; x++)
        {
            list[x] = new ArrayList(); //instantiate each list
        }

    }
    public Object dequeue(){
        if (hasData() == false){
                
        }
        return list.remove(0);
    }
    
    public void enqueue(Object o){
        //required to satisfy implentation of parent interface Queue
        throw new IllegalStateException("Must give a priority");
    }
    public void enqueue(Object o, int i){
        //given priority I, add to the correct list
        list[i].add(o);
    }
    
    public int size(){
        //refers to the number of priorities
        return list.length;
    }
    
    public int queueSize(int i){
        //refers to number of items in a given priority level
        return list[i].size();
    }
    public boolean hasData(){
        //tests to see if ANY of the ques have anything waiting
        for(int i=0;i<size;i++){
            if(queueSize(i)>0)
                return true;
        }
        return false;
    }

    @Override
    public Object peekFront() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

