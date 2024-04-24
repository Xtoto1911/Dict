package org.example;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        try {
            File file = new File("file.txt");
            NumDictionary numDictionary = new NumDictionary(file.getPath().toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}