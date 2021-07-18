package com.company;
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        StringBuffer str = new StringBuffer(Sc.nextLine());
        System.out.println("Enter the key: ");
        int key = Sc.nextInt();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = ch;
            if(ascii == 32){
                continue;
            }
            int newAscii = ascii-key;
            if(newAscii<65){
                int diff = 65 - newAscii;
                newAscii = 90 - (diff-1);
            }
            else if(newAscii<97 && newAscii>90){
                int diff = 97 - newAscii;
                newAscii = 122 - (diff-1);
            }
            str.setCharAt(i,(char)newAscii);
        }
        System.out.println(str);
    }
}
