package com.company;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Str = ");
        String str = Sc.nextLine();
        System.out.print("Key = ");
        int K = Sc.nextInt();
        String keyStr="";

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' '){
                keyStr = keyStr + ' ';
                continue;
            }
            int Key = K%26;
            int asciiOfCh1 = ch;
            int asciiOfCh2 = asciiOfCh1 - Key;
            if(asciiOfCh2 < 97 && asciiOfCh2 > 90){
                int temp = asciiOfCh1-97;
                Key = Key - temp;
                asciiOfCh2 = 122 - (Key-1);
            }
            char chForReplace = (char)asciiOfCh2;

            keyStr = keyStr + chForReplace;
        }
        System.out.println(keyStr);
    }
}
