import java.util.Scanner;
public class vetortabuada {
    
    public static void main(String[] args) {
        int a[];
        int i = 5;
        int n;
        int t = 0;
        a = new int[i];
        for (n=0; n<5; n++) {
            System.out.print("Digite um número: ");
            Scanner ler = new Scanner(System.in);
            a[n] = ler.nextInt();
        }
        for (n=0; n<5; n++) {
            while (t <= 10) {
                t += 1;
                System.out.println(a[n] + " x " + t + " = " + (a[n]*t));
            }
        }
    }
    
}
