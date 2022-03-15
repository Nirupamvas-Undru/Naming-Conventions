package com.company;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.*;
public class Main {

    public static void main(String[] args) {
        //inputText is a variable here
        //Invoking StringBuilder parametrized constructor
        StringBuilder inputText = new StringBuilder("AAAAABBCCCCC");
        //toString() is a method
        System.out.println("String = " + inputText.toString());
        //reverse() is also a method of StringBuilder
        StringBuilder reverseInputText = inputText.reverse();
        System.out.println("Reverse String = "+ reverseInputText.toString());
        //Append 'C' to the string
        inputText.appendCodePoint(67);
        System.out.println("Modified StringBuilder = "+ inputText);
        //capacity is a method which returns current capacity of the inputText
        int capacity = inputText.capacity();
        System.out.println("StringBuilder = " + inputText);
        System.out.println("Capacity of StringBuilder = " +  capacity);
        //StringBuilder() which takes capacity as input
        StringBuilder inputString = new StringBuilder(10);
        System.out.println("inputString Capacity = " + inputString.capacity());
    }
}
