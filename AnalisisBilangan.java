import java.util.Scanner;

public class AnalisisBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        System.out.println("\n========== ANALISIS BILANGAN ==========");
        System.out.println("Bilangan: " + bilangan);

        // Cek positif, negatif, atau nol
        String status;
        if (bilangan > 0) {
            status = "Positif";
        } else if (bilangan < 0) {
            status = "Negatif";
        } else {
            status = "Nol";
        }

        // Cek genap atau ganjil
        if (bilangan % 2 == 0) {
            status += ", Genap";
        } else {
            status += ", Ganjil";
        }

        System.out.println("Status: " + status);

        // Cek kelipatan 5
        if (bilangan % 5 == 0) {
            System.out.println("Kelipatan 5: Ya");
        } else {
            System.out.println("Kelipatan 5: Bukan");
        }

        // Cek bilangan prima (hanya jika 2–100)
        if (bilangan >= 2 && bilangan <= 100) {
            boolean prima = true;
            for (int i = 2; i <= Math.sqrt(bilangan); i++) {
                if (bilangan % i == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.println("Bilangan Prima: Ya");
            } else {
                System.out.println("Bilangan Prima: Bukan");
            }
        } else {
            System.out.println("Bilangan Prima: (tidak dicek, di luar range 2–100)");
        }

        System.out.println("=======================================");
        input.close();
    }
}
