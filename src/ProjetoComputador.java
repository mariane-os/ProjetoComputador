import java.util.Scanner;
import model.Computador;

public class ProjetoComputador {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.modelo = "Computador";
        computador1.cor = "branco";
        computador1.preco = 3000.0;
        computador1.numeroSerie = 1234567;
        computador1.imprimir();
        //calcular valor
        computador1.calcularValor();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Computador";
        computador2.cor = "preto";
        computador2.preco = 3500.0;
        computador2.numeroSerie = 1092837;
        computador2.imprimir();
        //calcular valor
        computador2.calcularValor();
        //valor alterado
        computador2.imprimir();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome preço do computador IBM");
        double novo = Double.parseDouble(leitor.nextLine());

        //teste
        if(computador2.alterarValor(novo)){
            System.out.println("Valor alterado com sucesso!");
        }else{
            System.out.println("Valor deve ser POSITIVO!");
        }
        computador2.imprimir();
    }
}