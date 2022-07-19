import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol;
        int n = 0;
        System.out.print("Satır Sayısını Giriniz: ");
        n = input.nextInt();
        System.out.print("Sembol Seçiniz: ");
        symbol = input.next();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(symbol);
            }
            System.out.println(" ");
        }
        int q;
        int tempN = (n - 1);
        int n2 = n;
        for (int i = 1; i <= (n - 1); i++) {
            for (q = 0; tempN < n; tempN++) {
                System.out.print(" ");
                q++;
            }
            for (int y = 1; y <= (((n2 - 1) * 2) - 1); y++) {
                System.out.print(symbol);
            }
            n2--;
            tempN -= q + 1;
            System.out.println("");
        }
    }
}






