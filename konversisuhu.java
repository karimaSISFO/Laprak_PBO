import java.util.Scanner;

public class konversisuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double suhu;
        char ulang = 0;

        do {
            System.out.println("===== KONVERSI SUHU =====");
            System.out.println("1. Celsius \n2. Farenheit \n3. kelvin \n4. keluar");
            System.out.print("Pilih suhu asal (1-4): ");
            pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan suhu dalam Celsius: ");
                    suhu = input.nextDouble();
                    System.out.println("\nHasil Konversi:");
                    System.out.printf("%.2f°C = %.2f°F\n", suhu, (suhu * 9 / 5) + 32);
                    System.out.printf("%.2f°C = %.2f K\n", suhu, suhu + 273.15);
                    break;

                case 2:
                    System.out.print("\nMasukkan suhu dalam Fahrenheit: ");
                    suhu = input.nextDouble();
                    System.out.println("\nHasil Konversi:");
                    System.out.printf("%.2f°F = %.2f°C\n", suhu, (suhu - 32) * 5 / 9);
                    System.out.printf("%.2f°F = %.2f K\n", suhu, ((suhu - 32) * 5 / 9) + 273.15);
                    break;

                case 3:
                    System.out.print("\nMasukkan suhu dalam Kelvin: ");
                    suhu = input.nextDouble();
                    System.out.println("\nHasil Konversi:");
                    System.out.printf("%.2f K = %.2f°C\n", suhu, suhu - 273.15);
                    System.out.printf("%.2f K = %.2f°F\n", suhu, ((suhu - 273.15) * 9 / 5) + 32);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            System.out.print("\nKonversi lagi? (y/n): ");
            ulang = input.next().charAt(0);
            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih telah menggunakan program konversi suhu!");
        input.close();
    }
}
