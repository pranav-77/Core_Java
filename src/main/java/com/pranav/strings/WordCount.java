package com.pranav.strings;

public class WordCount {
    public static void main(String[] args) {
        String name="howaawhw";
        for (int i=0;i<name.length();i++){
            int count=1;
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)&&name.charAt(i)!=' ')
                    count++;
            }
            if (count>1){
                System.out.println(name.charAt(i)+":"+count);
            }
        }
    }
}
