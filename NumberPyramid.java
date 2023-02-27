public class NumberPyramid {
    public static void printNumberPyramid(int N) {
        // printing number pyramid pattern - logic

        for(int i = 1; i <= N; i++) {
            int k = i;
            for(int j = 1; j < N*2; j++) {
                if(i+j >= N+1 && j-i <= N-1) {
                    if(j < N) {
                        System.out.print(k + " ");
                        k++;
                    } else {
                        System.out.print(k + " ");
                        k--;
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}