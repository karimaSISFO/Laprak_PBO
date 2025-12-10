import java.util.Scanner;

public class kalkulator {
    private static double bill;
    private static boolean error;

       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do{
            System.out.println("=== KALKULATOR SEDERHANA ===");
            System.out.print("masukkan bilangan pertama: ");
            bill = input.nextDouble();

            System.out.println("masukkan operator (+, -, *, /, %): ");
            char operator = input.next().charAt(0);
            System.out.println("masukkan bilangan kedua: ");
            double bill2 = input.nextDouble();

            double hasil;
            boolean error = false;

            switch (operator) {
                case '+':
                    hasil = bill + bill2;
                    break;
                case '-':
                    hasil = bill - bill2;
                    break;
                case '*':
                    hasil = bill * bill2;
                    break;
                case '/':
                    if (bill2 == 0) {
                        System.out.println(" Error : pembagian dengan nol tidak diperbolehkan.");
                        error = true;
                        hasil = 0;  
                    } else {
                        hasil = bill / bill2;
                    }
                    break;
                case '%':
                    if (bill2 == 0) {
                        System.out.println(" error: pembagian dengan nol tidak diperbolehkan.");
                        error = true;
                        hasil = 0;
                    } else {
                        hasil = bill % bill2;
                    }
                    break;
                default:
                    System.out.println(" operator tidak valid");
                    error = true;
                    hasil = 0; 
                    break;
            }
            if (!error) {
                System.out.printf("Hasil: %.1f %c %.1f = %.2f\n", bill, operator, bill2, hasil);


                     }
                     System.out.println("\nHitung lagi? (y/n):  ");
                     ulang = input.next().charAt(0);
                     System.out.println();
                    

                    

                
            }while (ulang == 'y' || ulang  == 'Y');
            System.out.println("Terimakasih!  ");
            input.close();
        }
    }

