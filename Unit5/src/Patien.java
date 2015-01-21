/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dylan
 */
public class Patien {
    private String name, status;
    
    public Patien(String nm, String st){
        name=nm;
        
        status = st;
    }
    public String toString(){
        return "Name: "+ name + "\tStatus:"+status+"\n";
    }
}
