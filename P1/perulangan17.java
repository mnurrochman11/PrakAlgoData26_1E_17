import java.util.Scanner;

public class perulangan17 {

    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        String inputNIM17, hasilAkhir17 = "";
        int nimDigit17;

        System.out.print("Masukkan NIM : ");
        inputNIM17 = nur17.nextLine();
        nimDigit17 = Integer.parseInt(inputNIM17.substring(inputNIM17.length() - 2));
        if (nimDigit17 < 10) {
            nimDigit17 += 10;
        }

        for (int i = 1; i <= nimDigit17; i++) {
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                hasilAkhir17 += "# ";
            } else if (i % 2 == 0) {
                hasilAkhir17 += i + " ";
            } else {
                hasilAkhir17 += "* ";
            }
        }
        System.out.println("Hasil : " + hasilAkhir17);
    }
}
