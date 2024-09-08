import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Cliente {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1234, "João Silva", 5000.00, 1000.00);
        Conta conta2 = new Conta(5678, "Maria Santos", 3000.00, 2500.00);
        Conta conta3 = new Conta(9012, "Pedro Rodrigues", 4000.00, 1500.00);

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        Collections.sort(contas);
        System.out.println("Contas ordenadas por número:");
        imprimirContas(contas);

        contas.sort(new Comparator<Conta>() {
            public int compare(Conta conta1, Conta conta2) {
                return conta1.getTitular().compareToIgnoreCase(conta2.getTitular());
            }
        });
        System.out.println("\nContas ordenadas por nome do titular:");
        imprimirContas(contas);
    }

    private static void imprimirContas(List<Conta> contas) {
        for (Conta conta : contas) {
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Limite de Crédito: " + conta.getLimiteCredito());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("--------------------");
        }
    }
}