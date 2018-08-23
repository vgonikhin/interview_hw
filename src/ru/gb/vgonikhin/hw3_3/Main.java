package ru.gb.vgonikhin.hw3_3;

public class Main {
    public static void main(String[] args) {
        VectorList<String> vectorList = new VectorList<>();
        vectorList.add("a");
        vectorList.add("b");
        vectorList.add("c");
        vectorList.add("d");
        System.out.println("first");
        for(String item : vectorList){
            System.out.println(item);
        }
        vectorList.remove("a");
        vectorList.remove("c");
        System.out.println("second");
        for(String item : vectorList){
            System.out.println(item);
        }
    }
}
