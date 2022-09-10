package src.backjun.easy;

public class Temp {
    public static void main(String[] args) {
        String temp = "NA";

        char c = temp.charAt(1);
        System.out.println("c = " + c);

        char a = temp.charAt(0);
        char b = temp.charAt(1);

        System.out.println(a < b ? a : b);
    }
}
