package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String line = "Convert this to alternate case";
        alternateCase(line);
    }

    public static void alternateCase(String line){
        char[] lineChars = line.toCharArray();

        StringBuilder sb = new StringBuilder();

        int isIndexInWord = 0;

        for(int i = 0; i < lineChars.length; i++){
            char c = lineChars[i];
            int ascii = c;

            if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                if(isIndexInWord % 2 == 0){
                    sb.append(Character.toUpperCase(c));
                }
                else{
                    sb.append(Character.toLowerCase(c));
                }
                isIndexInWord++;
            }
            else{
                isIndexInWord = 0;
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
