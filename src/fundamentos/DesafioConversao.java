import java.util.Locale;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt-BR", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o antepenultimo salario: " );
        String salario3 = scanner.next().replace(",",".");

        System.out.println("\nDigite o penultimo salario: " );
        String salario2 = scanner.next().replace(",",".");

        System.out.println("\nDigite o ultimo salario: " );
        String salario1 = scanner.next().replace(",",".");

        System.out.println("\nAntepenultimo Salario: " + salario3 + "\nPenultimo Salario: " + salario2 + "\nUltimo Salario: " + salario1 );

        double salario01 = Double.parseDouble(salario1);
        double salario02 = Double.parseDouble(salario2);
        double salario03 = Double.parseDouble(salario3);

        double somaSalario = salario01 + salario02 + salario03;

        System.out.println("A soma dos ultimos 3 salario é : " + somaSalario);
        System.out.println("A média Salarial é : " + somaSalario /3);

        scanner.close();
    }
}
