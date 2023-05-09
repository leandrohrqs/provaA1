import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
// ENTRADA
        System.out.println("Digite o seu nome:");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Digite seu peso em KG:");
        Double kgFuncionario = scanner.nextDouble();

        System.out.println("Digite a quantidade em litros inteiros de água ingerida");
        int qtdAguaIngerida = scanner.nextInt();
    scanner.close();

// PROCESSAMENTO   
    Double qtdAguaIdeal = calcAguaIdeal(kgFuncionario);
    Double faltaIngerir = faltaIngerir(qtdAguaIdeal, qtdAguaIngerida);

// SAÍDA   
    System.out.printf("%nNome: %s", nomeFuncionario);
    System.out.printf("%nPeso: %.0fKg", kgFuncionario);
    System.out.printf("%nQuantidade de água ingerida: %d litros", qtdAguaIngerida);
    System.out.printf("%nQuantidade ideal de água a ingerir: %.0f litros", Math.ceil(qtdAguaIdeal));

    if (faltaIngerir <= 0) {
        System.out.println(); // Quebra linha
        System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
    }
    else {
        System.out.printf("%nContinue focado em se hidratar por hoje, ainda falta %.0f litro(s)! Você consegue!", Math.ceil(faltaIngerir));
    }

}

    










public static Double calcAguaIdeal(Double kgFuncionario) {
        
        Double qtdAguaIdeal = (kgFuncionario * 35) / 1000;
        return qtdAguaIdeal;
    }

    public static Double faltaIngerir(Double qtdAguaIdeal, int qtdAguaIngerida) {
        Double faltaIngerir = qtdAguaIdeal - qtdAguaIngerida;
        return faltaIngerir;
    }

}


