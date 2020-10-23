import java.util.Scanner;
public class faixa {
    
    public static void main(String[] args) {
        int i = 1;
        int idade;
        int um = 0;
        int dois = 0;
        int tres = 0;
        int quatro = 0;
        int cinco = 0;
        for (i = 1; i <= 15; i += 1){
            System.out.println("Digite a idade: ");
            Scanner ler = new Scanner(System.in);
            idade = ler.nextInt();
            if (idade <= 15){
                um += 1;
            }
            else if (idade >= 16 && idade <= 30){
            dois += 1;
            }
            else if (idade >= 31 && idade <= 45){
                tres += 1;
            }
            else if (idade >= 46 && idade <= 60){
                quatro += 1;
            }
            else if (idade >= 61){
                cinco += 1;
            }
        }
        System.out.println("1, " + um + "pessoas. " + "2, " + dois + "pessoas. " + "3, " + tres + "pessoas. " + "4, " + quatro + "pessoas. " + "5, " + cinco + "pessoas.");
        System.out.println("Porcentagem: 1, " + (um*100)/15 + "% 2, " + (dois*100)/15 + "% 3, " + (tres*100)/15 + "% 4, " + (quatro*100)/15 + "% 5, " + (cinco*100)/15 + "%.");
    }
    
}
