package org.example;

import java.util.Scanner;

public class Labirinto {


       /*private char[][] mapa = {
               {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'},
               {'P',' ',' ','*',' ',' ',' ','*',' ',' ',' ',' ',' ',' ','*'},
               {'*','*',' ','*',' ','*',' ','*',' ','*','*','*','*',' ','*'},
               {'*',' ',' ',' ',' ','*',' ',' ',' ','*',' ',' ','*',' ','*'},
                {'*',' ','*','*','*','*','*','*',' ','*',' ','*','*',' ','*'},
               {'*',' ','*',' ',' ',' ',' ','*',' ','*',' ',' ',' ',' ','*'},
               {'*',' ','*',' ','*','*',' ','*',' ','*','*','*','*',' ','*'},
                {'*',' ',' ',' ','*',' ',' ',' ',' ',' ',' ',' ','*','*','*'},
               {'*','*','*','*','*',' ','*','*','*','*','*',' ',' ',' ','T'},
               {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}
        };

       // Posição inicial (linha, coluna)
       private int linhaInicial = 1;
        private int colunaInicial = 0;

       // Posição final (linha, coluna)
        private int linhaFinal = 8;
       private int colunaFinal = 14;*/

    private static char[][] mapa = {
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*'},
            {'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', ' ', ' ', '*', '*', '*', '*', '*', '*', ' ', ' ', '*', ' ', '*', '*', '*', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', '*', ' ', ' ', '*', '*', '*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', ' ', '*', ' ', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', ' ', ' ', ' ', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', ' ', '*', '*', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'T'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'}
    };


    private int linhaInicial = 4;
    private int colunaInicial = 0;
    private int linhaFinal = 21;
    private int colunaFinal = 49;
    static Pilha<Integer> pilha = new Pilha<Integer>(100);

    public void imprimir() {


        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }

    public static int acharPosicao(char c) {
        StringBuilder posicao = new StringBuilder();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == c) {
                    posicao.append(i).append(j);
                }
            }
        }

        return Integer.parseInt(posicao.toString());
    }

    public static boolean retrocesso(Labirinto labirinto) {

        while (!pilha.isEmpty()) {
            int linha = calcularLinha(pilha.peek());
            int coluna = calcularColuna(pilha.peek());

            if (mapa[linha][coluna] == 'T') {
                System.out.println("O caminho foi encontrado");
                return true;
            } else if (mapa[linha][coluna] != '+') {
                if (linha - 1 < 0 && coluna + 1 > labirinto.colunaFinal) {
                    mapa[linha][coluna] = '+';
                    verificarEsquerda(mapa);
                    verificarBaixo(mapa);
                    contador = 0;
                    break;
                } else if (linha - 1 < 0 && coluna - 1 < 0) {
                    mapa[linha][coluna] = '+';
                    verificarDireita(mapa);
                    verificarBaixo(mapa);
                    contador = 0;
                    break;
                } else if (linha + 1 > labirinto.linhaFinal && coluna - 1 < 0) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarDireita(mapa);
                    contador = 0;
                    break;
                } else if (linha + 1 > labirinto.linhaFinal && coluna + 1 > labirinto.colunaFinal) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarEsquerda(mapa);
                    contador = 0;
                    break;
                } else if (linha - 1 < 0) {
                    mapa[linha][coluna] = '+';
                    verificarBaixo(mapa);
                    verificarEsquerda(mapa);
                    verificarDireita(mapa);
                    contador = 0;
                    break;
                } else if (linha + 1 > labirinto.linhaFinal) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarEsquerda(mapa);
                    verificarDireita(mapa);
                    contador = 0;
                    break;
                } else if (coluna - 1 < 0) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarBaixo(mapa);
                    verificarDireita(mapa);
                    contador = 0;
                    break;
                } else if (coluna + 1 > labirinto.colunaFinal) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarEsquerda(mapa);
                    verificarBaixo(mapa);
                    contador = 0;
                    break;
                } else {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarBaixo(mapa);
                    verificarEsquerda(mapa);
                    verificarDireita(mapa);
                    contador = 0;
                    break;
                }
            }
        }
        return false;
    }

    //Conta quantas vezes foi utilizada a opção de mover
    static int contador = 0;

    public static void verificarCima(char[][] mapa) {
        int linha = calcularLinha(pilha.peek());
        int coluna = calcularColuna(pilha.peek());

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para cima? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha - 1][coluna] != ' ') {
                System.out.println("Grade não está vazia!");
            } else if (contador > 0) {
                System.out.println("Já foi escolhida uma opção!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(linha - 1).append(coluna);
                pilha.push(Integer.parseInt((sb.toString())));
                contador++;
            }
        }
    }

    public static void verificarBaixo(char[][] mapa) {
        int linha = calcularLinha(pilha.peek());
        int coluna = calcularColuna(pilha.peek());

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para baixo? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha + 1][coluna] != ' ') {
                System.out.println("Grade não está vazia!");
            } else if (contador > 0) {
                System.out.println("Já foi escolhida uma opção!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(linha + 1).append(coluna);
                pilha.push(Integer.parseInt(sb.toString()));
                contador++;
            }
        }

    }

    public static void verificarEsquerda(char[][] mapa) {
        int linha = calcularLinha(pilha.peek());
        int coluna = calcularColuna(pilha.peek());

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para a esquerda? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha][coluna - 1] != ' ') {
                System.out.println("Grade não está vazia!");
            } else if (contador > 0) {
                System.out.println("Já foi escolhida uma opção!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(linha).append(coluna - 1);
                pilha.push(Integer.parseInt(sb.toString()));
            }
        }

    }

    public static void verificarDireita(char[][] mapa) {
        int linha = calcularLinha(pilha.peek());
        int coluna = calcularColuna(pilha.peek());

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para a direita? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha][coluna + 1] != ' ') {
                System.out.println("Grade não está vazia!");
            } else if (contador > 0) {
                System.out.println("Já foi escolhida uma opção!");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(linha).append(coluna + 1);
                pilha.push(Integer.parseInt(sb.toString()));
                contador++;
            }
        }

    }

    public static int calcularLinha(int pos) {
        String texto = Integer.toString(pos);

        return Integer.parseInt(texto.substring(0, 1));
    }

    public static int calcularColuna(int pos) {
        String texto = Integer.toString(pos);

        return Integer.parseInt(texto.substring(1));
    }


    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();

        Scanner sc = new Scanner(System.in);

        retrocesso(labirinto);
        labirinto.imprimir();

        int pos = acharPosicao('P');
        pilha.push(pos);

        System.out.println("Quer continuar rodando? S/N: ");
        String rodar = sc.nextLine();

        while (rodar.equalsIgnoreCase("s")) {
            retrocesso(labirinto);
            labirinto.imprimir();
            System.out.println("Posição atual: " + pilha.peek());
            System.out.println("Quer continuar rodando? S/N: ");
            rodar = sc.nextLine();
        }


    }
}