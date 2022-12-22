package src.kakao.two022;

public class Exem1 {
    public static void main(String[] args) {

        int x = 4, y = 4, z = 6;

        int answer = 0;
        int diff = Math.abs(x - y);
        int ttt = z - diff;

        if( x >= y) {
            if(ttt >= 2) {
                answer = x + (ttt/2);
            }
            answer = x;
        } else {
            if(ttt >= 2) {
                answer = y + (ttt/2);
            }
            answer = y;
        }
        System.out.println("answer = " + answer);
    }
}
