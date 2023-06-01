public class pattern15 {
    public static void main(String[] args) {
        //     1
        //   2 3 2
        // 3 4 5 4 3
        //   2 3 2
        //     1

        int n = 5;
        int sp = n / 2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("	");
            }
            int cval = val;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + "	"); // cval++;
                if (j <= st / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }

            if (i <= n / 2) {
                sp--;
                st += 2;
                val++;
            } else {
                sp++;
                st -= 2;
                val--;
            }
            // val++;
            System.out.println();
        }
    }
}
