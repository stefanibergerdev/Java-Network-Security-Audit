import java.util.*;
public class AuditSystem {
    public static String analisarRiscoPorta(int porta) {
        if(porta == 21 || porta == 22 || porta == 23) {
            return "ALTO (Serviço Crítico).";
        } else if (porta == 80 || porta == 443) {
            return "MÉDIO (Tráfego Web)";
        } else {
            return "BAIXO (Serviço Geral)";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantidade de portas que deseja auditar: ");
        int qtdPortas = sc.nextInt();

        while (qtdPortas <= 0) {
            if (qtdPortas <= 0) {
                System.out.println("Digite uma quantidade válida: ");
                qtdPortas = sc.nextInt();
            }
        }
        int [] portas = new int[qtdPortas];

        for (int i = 0; i < portas.length; i++) {
            System.out.println("Digite o número da porta #" + (i+1) + ": ");
            portas[i] = sc.nextInt();
        }

        System.out.println("Relatório: ");
        for (int i = 0; i < portas.length; i++) {
            String analisePorta = analisarRiscoPorta(portas[i]);

            System.out.println("O risco da porta " + portas[i] + " é: " + analisePorta);
        }

        sc.close();
    }
}
