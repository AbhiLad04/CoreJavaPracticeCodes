package com.abhi.corejava.assignments;

import java.util.ArrayList;

public class ArrayListReversePrint {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        names.add("Abhi");
        names.add("Swaraj");
        names.add("Abhishek");
        names.add("Abhishek Lad");
        names.add("Swaraj Lad");
        names.add("Shravani");
        names.add("Shravani Patil");

        for (int i=names.size()-1;i>=0;i--){
            System.out.println(names.get(i));
        }


    }
}
