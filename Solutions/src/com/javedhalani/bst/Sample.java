package com.javedhalani.bst;

import java.util.HashMap;

public class Sample {

    public static void main(String[] args) {

        String str="Better better";



        HashMap<String,Integer> hm=new HashMap<>();



        String[] s=str.split("");



        for( String ss : s){
            if(hm.containsKey(ss)){
                hm.put(ss,hm.get(ss)+1);
            }
            else{
                hm.put(ss,1);
            }
        }
        System.out.println("hm");
    }

}
