package P5;

public class Faktorial {
    int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;

        // kalau pakai for
        // for (int i = 1; i <= n; i++) {
        // fakto = fakto * i;
        // }

        // kalau pakai while
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    int faktorDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorDC(n - 1);
            return fakto;
        }
    }
}
