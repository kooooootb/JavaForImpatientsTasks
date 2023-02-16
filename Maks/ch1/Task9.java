package ch1;

public class Task9 {
    public static boolean compareString(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        for(int i = 0;i < s1.length();++i){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s1 = "example";
        String s2 = "example";
        String s3 = "differe";

        System.out.println(compareString(s1, s2));
        System.out.println(compareString(s2, s3));

        System.out.println(s1.compareTo(s2) == 0);
        System.out.println(s2.compareTo(s3) == 0);
    }
}
