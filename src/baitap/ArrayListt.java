package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListt {
    public void vidu1(){
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors.get(1));
        colors.set(1,"yellow");
        colors.remove("Red");
        System.out.println(colors);
        colors.remove(1);
        for(String color:colors){
            System.out.println(color);
        }
        String[] colorsArray={"Red","Green","Blue"};
        ArrayList<String> colorsList=new ArrayList<>(Arrays.asList(colorsArray));
        Collections.sort(colorsList);
//Collections.sort(colorsList,(s1,s2)->s1.compareTo(s2));
        System.out.println(colorsList);
    }
}
