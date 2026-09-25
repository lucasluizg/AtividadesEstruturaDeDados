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
    static Pilha<Posicao> pilha = new Pilha<Posicao>(100);

    public void imprimir() {


        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }

    public static Posicao acharPosicao(char c) {
        Posicao posicao = new Posicao(0, 0);
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == c) {
                    posicao.linha = i;
                    posicao.coluna = j;
                    break;
                }
            }
        }
        return posicao;
    }

    public static boolean retrocesso(Labirinto labirinto) {

        while (!pilha.isEmpty()) {
            int linha = pilha.peek().linha;
            int coluna = pilha.peek().coluna;

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
                    break;
                } else if (linha + 1 > labirinto.linhaFinal && coluna + 1 > labirinto.colunaFinal) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarEsquerda(mapa);
                    break;
                } else if (linha - 1 < 0) {
                    mapa[linha][coluna] = '+';
                    verificarBaixo(mapa);
                    verificarEsquerda(mapa);
                    verificarDireita(mapa);
                    break;
                } else if (linha + 1 > labirinto.linhaFinal) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarEsquerda(mapa);
                    verificarDireita(mapa);
                    break;
                } else if (coluna - 1 < 0) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarBaixo(mapa);
                    verificarDireita(mapa);
                    break;
                } else if (coluna + 1 > labirinto.colunaFinal) {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarEsquerda(mapa);
                    verificarBaixo(mapa);
                    break;
                } else {
                    mapa[linha][coluna] = '+';
                    verificarCima(mapa);
                    verificarBaixo(mapa);
                    verificarEsquerda(mapa);
                    verificarDireita(mapa);
                    break;
                }
            }
        }
        return false;
    }

    static int contador = 0;

    public static void verificarCima(char[][] mapa) {
        int linha = pilha.peek().linha;
        int coluna = pilha.peek().coluna;

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para cima? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha - 1][coluna] != ' ') {
                System.out.println("Grade não está vazia!");
            } else if (contador > 0) {
                System.out.println("Já foi escolhido um movimento!");
                contador = 0;
            } else {
                while (mapa[linha - 1][coluna] == ' ') {
                    Posicao pos = new Posicao(linha - 1, coluna);
                    pilha.push(pos);
                    mapa[linha - 1][coluna] = '+';
                    linha -= 1;
                }
            }
        }
        contador++;
    }

    public static void verificarBaixo(char[][] mapa) {
        int linha = pilha.peek().linha;
        int coluna = pilha.peek().coluna;

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para baixo? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha + 1][coluna] != ' ') {
                System.out.println("Grade não está vazia!");
            } else {
                while (mapa[linha + 1][coluna] == ' ') {
                    Posicao pos = new Posicao(linha + 1, coluna);
                    pilha.push(pos);
                    mapa[linha + 1][coluna] = '+';
                    linha += 1;
                }
            }
        }
        contador++;
    }

    public static void verificarEsquerda(char[][] mapa) {
        int linha = pilha.peek().linha;
        int coluna = pilha.peek().coluna;

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para a esquerda? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha][coluna - 1] != ' ') {
                System.out.println("Grade não está vazia!");
            } else {
                while (mapa[linha][coluna - 1] == ' ') {
                    Posicao pos = new Posicao(linha, coluna - 1);
                    pilha.push(pos);
                    mapa[linha][coluna - 1] = '+';
                    coluna -= 1;
                }
            }
        }
        contador++;
    }

    public static void verificarDireita(char[][] mapa) {
        int linha = pilha.peek().linha;
        int coluna = pilha.peek().coluna;

        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer se mover para a direita? S/N: ");
        String escolha = sc.nextLine();

        if (escolha.equalsIgnoreCase("S")) {
            if (mapa[linha][coluna + 1] != ' ') {
                System.out.println("Grade não está vazia!");
            } else {
                while (mapa[linha][coluna + 1] == ' ') {
                    Posicao pos = new Posicao(linha, coluna + 1);
                    pilha.push(pos);
                    mapa[linha][coluna + 1] = '+';
                    coluna += 1;
                }
            }
        }
        contador++;
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

        Posicao pos = acharPosicao('P');
        pilha.push(pos);

        System.out.println("Quer continuar rodando? S/N: ");
        String rodar = sc.nextLine();

        while (rodar.equalsIgnoreCase("s")) {
            retrocesso(labirinto);
            labirinto.imprimir();
            System.out.println("Posição atual: " + " Linha: " + pilha.peek().linha + " Coluna: " + pilha.peek().coluna);
            System.out.println("Quer continuar rodando? S/N: ");
            rodar = sc.nextLine();
        }


    }
}