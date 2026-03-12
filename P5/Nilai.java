package P5;

public class Nilai {
    int niaiTertinggi(int[][] arr, int l, int r) {
        if (l == r) {
            return arr[l][2];
        }
        int mid = (l + r) / 2;
        int lsum = niaiTertinggi(arr, l, mid);
        int rsum = niaiTertinggi(arr, mid + 1, r);
        return Math.max(lsum, rsum);
    }

    int nilaiTerendah(int[][] arr, int l, int r) {
        if (l == r) {
            return arr[l][2];
        }
        int mid = (l + r) / 2;
        int lsum = nilaiTerendah(arr, l, mid);
        int rsum = nilaiTerendah(arr, mid + 1, r);
        return Math.min(lsum, rsum);
    }

    double rataUAS(int[][] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][3];
        }
        return (double) total / arr.length;
    }

}
