import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Stringmani {
    public static void main() {
        String greeting = "Hello World";

//        System.out.println(greeting.toLowerCase());
//        System.out.println(greeting.toUpperCase());
//
//        //concatination
//        String V = "John";
//        V = V + greeting;
//
//        //index of
//        System.out.println(greeting.indexOf("W"));
//
//        //Char Art
//        System.out.println(greeting.charAt(6));
//
//        //Substring extract a part of a sting
//        System.out.println(greeting.substring(6));
//        System.out.println(greeting.substring(6,8));
//
//        //contains
//        System.out.println(greeting.contains("World"));
//
//        //Startswith
//        System.out.println(greeting.startsWith("H"));
//        System.out.println(greeting.endsWith("d"));
//
//        //split
//        String[] parts = greeting.split(" ");//delimeter --> only one can be parsed
//        for(String p:parts){
//            System.out.println(p);
//        }

//        String s1 = "Hello";
//        String s2 = "Hello";
//        String s3 = new String("Hello");
//        //equals, ==, equalsIgnoreCase
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s2 == s3);


//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//        sc.nextLine();
//        int dex = name.indexOf(" ");
//
//
//        String[] parts = name.toUpperCase().split(" ");
//        System.out.print("Hello ");
//
//        for(String i:parts) {
//            System.out.print( i.charAt(0) + " ");
//        }
//    }

        System.out.println("Enter your name");
        String name = new Scanner(System.in).nextLine();
        int len = name.length();

        System.out.println(reverse(name).toUpperCase());

    }

        public static String reverse (String name) {
              String name2 = "";
              int len = name.length();
               for(int i=len-1; i>=0; i--){
                   name2 += name.charAt(i);
               }


               return name2;
        }
}