import java.util.Scanner;

public class ControleVoo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] matriz = {
            {".", ".", ".", ".", "A"},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {"O", ".", ".", ".", "."}
        };
        int[] turbulenciaLinha = {0, 1, 2, 3, 4, 4};
        int[] turbulenciaColuna = {0, 3, 2, 1, 1, 4};
        String movimento;
        int posL = 4, posC = 0;
        int energia = 20, custoEnergia = 0, integridade = 100;
        int i, j;

        // Descrição dos simbolos no mapa
        System.out.println(". -> Posicao vazia");
        System.out.println("O -> Posicao do Aviao");
        System.out.println("A -> Aeroporto");

        while (energia > 0 && integridade > 0) {

            // Mapa onde o avião percorre
            System.out.println("\n-----Mapa do Voo-----");
            for (i = 0; i < matriz.length; i++) {
                System.out.print("    | ");
                for (j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.print("|");
                System.out.println();
            }

            // Quanto de integridade e energia o avião tem no momento
            System.out.println("\n-----Status do Aviao-----");
            System.out.println("Integridade: " + integridade + "%");
            System.out.println("Energia: " + energia + "%\n");
            int nL = posL, nC = posC;
            do {
                System.out.print("Digite alguma tecla para se movimentar: ");
                movimento = ler.nextLine().toUpperCase();

                switch (movimento) {
                    // Movimentação simples
                    case "W":
                        nL--;
                        custoEnergia = 2;
                        break;
                    case "A":
                        nC--;
                        custoEnergia = 2;
                        break;
                    case "S":
                        nL++;
                        custoEnergia = 2;
                        break;
                    case "D":
                        nC++;
                        custoEnergia = 2;
                        break;
                    // Movimentação em diagonal
                    case "WD":
                        nL--;
                        nC++;
                        custoEnergia = 4;
                        break;
                    case "WA":
                        nL--;
                        nC--;
                        custoEnergia = 4;
                        break;
                    case "AS":
                        nL++;
                        nC--;
                        custoEnergia = 4;
                        break;
                    case "SD":
                        nL++;
                        nC++;
                        custoEnergia = 4;
                        break;
                    default:
                        System.out.println("Tecla invalida. Digite novamente.");
                }
            } while ((!"W".equals(movimento)) && (!"A".equals(movimento)) && (!"S".equals(movimento)) && (!"D".equals(movimento)) && (!"WD".equals(movimento)) && (!"WA".equals(movimento)) && (!"AS".equals(movimento)) && (!"SD".equals(movimento)));

            if (nL >= 0 && nL < matriz.length && nC >= 0 && nC < matriz.length) {
                matriz[posL][posC] = ".";
                posL = nL;
                posC = nC;
                matriz[posL][posC] = "O";
                energia -= custoEnergia;
                for (i = 0; i < turbulenciaLinha.length; i++) {
                    // Se coluna for 0 e linha for 0, ocorre turbulencia e assim por diante
                    if (posL == turbulenciaLinha[i] && posC == turbulenciaColuna[i]) {
                        System.out.println("O aviao esta passando por uma turbulencia! Perdeu 25% de integridade!");
                        integridade -= 25;
                    }
                }
            } else {
                System.out.println("Aqui fica a borda!!!! Movimente-se para outra direcao.");
            }

            if (energia <= 15) {
                System.out.println("MayDay! O combustivel esta acabando!");
            }

            // Atualiza Energia para evitar exibir valores negativos no relatório final
            energia = Math.max(0, energia);

            // Atualiza Integridade para evitar exibir valores negativos no relatório final
            integridade = Math.max(0, integridade);

            // Condições de derrota e vitória
            if (energia == 0) {
                System.out.println("POUSO DE EMERGENCIA! O combustivel acabou!\n");
                break;
            } else if (integridade == 0) {
                System.out.println("O aviao sofreu danos criticos e se desintegrou em voo!\n");
                break;
            } else if (posL == 0 && posC == 4) {
                break;
            }
        }

        System.out.println("-----Status final do Aviao-----");
        System.out.println("-----Mapa do Voo-----");
        for (i = 0; i < matriz.length; i++) {
            System.out.print("    | ");
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.println("Integridade: " + integridade + "%");
        System.out.println("Energia: " + energia + "%");
        if (posL == 0 && posC == 4) {
            System.out.println("O aviao pousou no Aeroporto com sucesso!");
        } else {
            System.out.println("O aviao nao conseguiu chegar ao aeroporto...");
        }
    }
}
