package com.abhi.corejava.assignments;
import java.util.ArrayList;
public class ArrayListFirst5Values {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        names.add("Abhi");
        names.add("Swaraj");
        names.add("Abhishek");
        names.add("Abhishek Lad");
        names.add("Swaraj Lad");
        names.add("Shravani");
        names.add("Shravani Patil");

        for (int i=0;i<5;i++){
            System.out.println(names.get(i));
        }

    }


}
