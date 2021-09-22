import java.util.Locale;

public class StringType {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "welcome";
        boolean isEqual = s1.equalsIgnoreCase(s2);
        int i = 1197;
        double j = 1267.45;
        String s3 = j + "";
        String s = i + "";


//        String s3 = "Welcome to Java";
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//        System.out.println(s1.equals(s2));
//        System.out.println(s2.equals(s3));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s2.compareTo(s3));
//        System.out.println(s2.compareTo(s2));
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.indexOf('j'));
//        System.out.println(s1.indexOf("to"));
//        System.out.println(s1.lastIndexOf('a'));
//        System.out.println(s1.lastIndexOf("o", 15));
//        System.out.println(s1.length());
//        System.out.println(s1.substring(5));
//        System.out.println(s1.substring(5, 11));
//        System.out.println(s1.startsWith("Wel"));
//        System.out.println(s1.endsWith("Java"));
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.concat(s2));
//        System.out.println(s1.contains(s2));
//        System.out.println("\t Wel \t".trim());

//        char c = s1.charAt(s1.length() - 1);
//        System.out.println("1" + 1);
//        System.out.println('1' + 1);
//        System.out.println("1" + 1 + 1);
//        System.out.println("1" + (1 + 1));
//        System.out.println('1' + 1 + 1);

//        System.out.println(1 + "Welcome" + 1 + 1);
//        System.out.println(1 + "Welcome" + (1 + 1));
//        System.out.println(1 + "Welcome" + ('\u0001' + 1));
//        System.out.println(1 + "Welcome" + 'a' + 1);

        System.out.println(isEqual);
        System.out.println(s.length());
        System.out.println(s3.length() - 1);
    }
}
