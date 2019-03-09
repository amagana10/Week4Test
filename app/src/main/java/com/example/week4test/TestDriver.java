package com.example.week4test;

import java.util.Stack;

public class TestDriver {
    public static void main(String[] args) {
        String input = "ad1234 bye can!";

        System.out.println("input: " + input);
        System.out.println("output: " + encode(input));

        String reverse = "1";
        System.out.println("input reverse: " + reverse);
        reverse = reverse(reverse);
        System.out.println("output: " + reverse);

        reverse = "12";
        System.out.println("input reverse: " + reverse);
        reverse = reverse(reverse);
        System.out.println("output: " + reverse);

        reverse = "123";
        System.out.println("input reverse: " + reverse);
        reverse = reverse(reverse);
        System.out.println("output: " + reverse);

        reverse = "1234";
        System.out.println("input reverse: " + reverse);
        reverse = reverse(reverse);
        System.out.println("output: " + reverse);

    }

    private static String reverse(String string){
        if (string.length() == 1)
            return string;
        if (string.length() == 2){

            return "" +string.charAt(1) + string.charAt(0);
        }

        return   reverse(string.substring(string.length()/2+1,string.length())) +
                 reverse(string.substring(string.length()/2 ,string.length()/2+1))

                + reverse(string.substring(0,string.length()/2));
    }

    public static String encode(String string){
        char[] str = string.toCharArray();

        boolean startOfNumber = true;
        int start = 0;
        Stack stack = new Stack();

        for (int i=0; i<str.length;i++){

            if (str[i] == '1' ||
                str[i] == '2' ||
                str[i] == '3' ||
                str[i] == '4' ||
                str[i] == '5' ||
                str[i] == '6' ||
                str[i] == '7' ||
                str[i] == '8' ||
                str[i] == '9' ||
                str[i] == '0' ){
                if (startOfNumber){
                    start = i;
                    startOfNumber=false;
                }
                stack.push(str[i]);

            }else {
                if (!startOfNumber){
                    startOfNumber=true;
                    while (!stack.empty()){
                        str[start++] = (char)stack.pop();
                    }
                }
            }



        }
        System.out.println("output num reverse: " + new String(str));

        for (int i = 0; i<str.length;i++) {
            
            switch (str[i]){
                case 'a':
                    str[i] = '1';
                    break;
                case 'b':
                    str[i] = 'a';
                    break;
                case 'c':
                    str[i] = 'b';
                    break;
                case 'd':
                    str[i] = 'c';
                    break;
                case 'e':
                    str[i] = '2';
                    break;
                case 'f':
                    str[i] = 'e';
                    break;
                case 'g':
                    str[i] = 'f';
                    break;
                case 'h':
                    str[i] = 'g';
                    break;
                case 'i':
                    str[i] = '3';
                    break;
                case 'j':
                    str[i] = 'i';
                    break;
                case 'k':
                    str[i] = 'j';
                    break;
                case 'l':
                    str[i] = 'k';
                    break;
                case 'm':
                    str[i] = 'l';
                    break;
                case 'n':
                    str[i] = 'm';
                    break;
                case 'o':
                    str[i] = '4';
                    break;
                case 'p':
                    str[i] = 'o';
                    break;
                case 'q':
                    str[i] = 'p';
                    break;
                case 'r':
                    str[i] = 'q';
                    break;
                case 's':
                    str[i] = 'r';
                    break;
                case 't':
                    str[i] = 's';
                    break;
                case 'u':
                    str[i] = '5';
                    break;
                case 'v':
                    str[i] = 'u';
                    break;
                case 'w':
                    str[i] = 'v';
                    break;
                case 'x':
                    str[i] = 'w';
                    break;
                case 'y':
                    str[i] = ' ';
                    break;
                case 'z':
                    str[i] = 'y';
                    break;
                case ' ':
                    str[i] = 'y';
            }
        }
        return new String(str);
    }
}
