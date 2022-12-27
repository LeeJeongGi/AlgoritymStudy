package src.exam;

import java.util.HashSet;

public class OneOfOne2 {
    public static void main(String[] args) {
        int[] A = {1,1,2,3,3,4,5,7};
        int K = 3;
        int answer = 0;
        boolean flag = true;

        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                flag = false;

            if(A[i] == K)
                break;
        }
        if (A[0] != 1 && A[n - 1] != K)
            flag = false;
        else
            flag = true;

        System.out.println("flag = " + flag);

    }

}
