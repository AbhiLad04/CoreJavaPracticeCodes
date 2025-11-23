package com.abhi.corejava.assignments;
import java.util.ArrayList;
public class ArrayListMiddleElement {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        names.add("Abhi");
        names.add("Swaraj");
        names.add("Abhishek");
        names.add("Abhishek Lad");
        names.add("Swaraj Lad");
        names.add("Shravani");
        names.add("Shravani Patil");

        for (int i=0;i<names.size();i++){
            if (i == names.size()/2){
                System.out.println("This is The Mid Element from the Array List :- "+names.get(i)+", With its Index :- "+i);
            }
        }
    }
}
