package core.string;

import core.core.Employee;

public class StringDemo {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        boolean b1 = (s1 == s2);
        System.out.println(b1);

        System.out.println(s2);

        String s = new String("abcdef");
        System.out.println(s);
//        s = s + "d";

//        s = s.concat("def");
//        System.out.println(s);

        /*int j = 10;
        String k = j + "";
        for (int i = 10; i<100; i++) {
//            System.out.println(s);
        }*/

        String s3 = new String("ABCDEF");
        System.out.println(s3);

        boolean b = (s.equalsIgnoreCase(s3));
        System.out.println(b);

        if (s.startsWith("abcdef")) {
            System.out.println("Yes this is true");
        }

        System.out.println(s.isBlank());

        String s4 = s.substring(3);
        System.out.println(s4);

        s4 = s.replace("c", "z");
        System.out.println(s4);

        String s5 = new String("ABABCBDB ");
        System.out.println("Length :: " + s5.length());
        s5 = s5.trim();
        System.out.println("Length after trim :: " + s5.length());

        s5 = s5.replaceAll("B", "Z");
        System.out.println(s5);
        char c = s5.charAt(0);
        System.out.println(c);
        int p = s5.indexOf('C');
        System.out.println(p);

        String[] sp = s5.split("Z");
        System.out.println("After splitting length :: "+ sp.length);
        System.out.println("After splitting length :: "+ sp[5]);

        StringBuffer sb = new StringBuffer("");
        sb = sb.append("abc");


        String s10 = "abcdef";
//        int num = 1; // "fabcde";
//        int num = 2; // "efabcd";
//        int num = 3; // "defabc";
    }

}
