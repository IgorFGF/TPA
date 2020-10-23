import java.util.Scanner;
public class idadealturapeso {
    
    public static void main(String[] args) {
        int i = 1;
        int idade;
        double altura;
        double peso;
        int idademaior = 0;
        int idademenor = 0;
        double pesomaior = 0;
        double pesomenor = 0;
        int pesomenosquarenta = 0;
        int idadedezvinte = 0;
        int idadedezvintecontador = 0;
        int cinquenta = 0;
        for (i = 1; i <= 25; i += 1){
            System.out.println("Digite a idade: ");
            Scanner leri = new Scanner(System.in);
            idade = leri.nextInt();
            System.out.println("Digite a altura:");
            Scanner lera = new Scanner(System.in);
            altura = lera.nextDouble();
            System.out.println("Digite o peso: ");
            Scanner lerp = new Scanner(System.in);
            peso = lerp.nextDouble();
            if (idade > 50){
                cinquenta += 1;
            }
            if (idade >= 10 && idade <= 20){
                idadedezvinte += altura;
                idadedezvintecontador += 1;
            }
            if (peso < 40){
                pesomenosquarenta += 1;
            }
            if (idade > idademaior){
                idademaior = idade;
                pesomaior = peso;
            }
            if (idademenor == 0){
                idademenor = idade;
            }
            if (idade < idademenor){
                idademenor = idade;
                pesomenor = peso;
            }
        }
        System.out.println(cinquenta + "pessoas acima de cinquenta anos. " + idadedezvinte / idadedezvintecontador + "média da altura de pessoas entre dez e vinte anos. " + (pesomenosquarenta*100)/25 + "porcentagem de pessoas com peso inferior a 40 quilos. " + pesomaior + " é o peso do mais velho. " + pesomenor + " é a idade do mais novo.");
    }
    
}
