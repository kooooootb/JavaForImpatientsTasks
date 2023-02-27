package Lab1;

public class Task9 {
    public static void main(String[] args) {
        String str1 = "HelloWorld", str2 = "World", str3="Hello";
        String res = str3.concat(str2);
        System.out.println("String 1: " + str1 + " || " + "String 2: " + res);
        System.out.println("Comparison with ==        -> " + (res == str1));
        System.out.println("Comparison with .equals() -> " + res.equals(str1));
    }
}
