import java.util.Scanner;
public class parimpar {
    
    public static void main(String[] args) {
        int a[];
        int i = 20;
        int n;
        a = new int[i];
        for (n=0; n<i; n++) {
            System.out.print("Envie o número: ");
            Scanner ler = new Scanner(System.in);
            a[n] = ler.nextInt();
        }
        int b[];
        b = new int[i];
        for (n=0; n<i; n++) {
            if (a[n] % 2 == 0) {
                b[n] = a[n];
            }
        }
        for (n=0; n<i; n++) {
            if (a[n] % 2 != 0) {
                b[n] = a[n];
            }
        }
    }
    
}
