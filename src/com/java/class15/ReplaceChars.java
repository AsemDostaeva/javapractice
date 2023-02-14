package com.java.class15;

public class ReplaceChars {

    public static void main(String[] args) {
         String str = "earth is flat";
         str = str.replace('e', 'E');
        System.out.println(str);


        String str2 = "system.out.println(Hello World)";
        str2 = str2.replace("system", "System").replace("(Hello", "(\"Hello").replace("World)", "World\")").replace(")",");");
        System.out.println(str2);
    }
}
