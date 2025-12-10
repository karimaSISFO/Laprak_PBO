import java.util.Scanner;

public class polaBintang {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n;

        System.out.println("Masukkan tinggi segitiga: ");
        n = input.nextInt();

        if ( n < 3 || n >10 ) {
            System.out.println("input tidak valid! tinggi harus antara 3 sampai 10.");
            return;
        }
//pola 1 - segitga siku-siku
        System.out.println("\npola 1 - segiti5iga siku-siku:  ");
        for (int i=1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
// pola 2 - segitiga siku-siku terbalik
        System.out.println("\npola 2 - Segitiga terbalik: ");
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //pola 3 - segitiga sama kaki
        System.out.println("\nPola 3 - segitiga sama kaki: ");
        for (int i = 1; i <= n;  i++){
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }

            //bintang kiri dan kanan
            for (int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
