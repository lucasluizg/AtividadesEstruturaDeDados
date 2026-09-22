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
        StringBuilder sb = new StringBuilder();
        int pos = acharPosicao('P');
        pilha.push(pos);

        while (!pilha.isEmpty()) {
            int linha = calcularLinha(pilha.peek());
            int coluna = calcularColuna(pilha.peek());

            if (mapa[linha][coluna] == 'T') {
                System.out.println("O caminho foi encontrado");
                return true;
            } else if (mapa[linha][coluna] != '+') {
                // Linha e coluna respectivamente como l e c.
                StringBuilder lc = new StringBuilder();

                if (linha - 1 < 0 && coluna + 1 > labirinto.colunaFinal) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else if (linha - 1 < 0 && coluna - 1 < 0) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else if (linha + 1 > labirinto.linhaFinal && coluna - 1 < 0) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else if (linha + 1 > labirinto.linhaFinal && coluna + 1 > labirinto.colunaFinal) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else if (linha - 1 < 0) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else if (linha + 1 > labirinto.linhaFinal) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else if (coluna - 1 < 0) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else if (coluna + 1 > labirinto.colunaFinal) {
                    acharPosicaoVaga(labirinto);
                    break;
                } else {
                    acharPosicaoVaga(labirinto);
                    break;
                }
            }
        }
        return false;
    }

    public static void acharPosicaoVaga(Labirinto labirinto) {
        int linha = calcularLinha(pilha.peek());
        int coluna = calcularColuna(pilha.peek());

        StringBuilder lc = new StringBuilder();

        if (linha - 1 < 0 && coluna + 1 > labirinto.colunaFinal) {
            if (mapa[linha + 1][coluna] == ' ') {
                mapa[linha + 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha + 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna - 1] == ' ') {
                mapa[linha][coluna - 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna - 1))));
                lc.setLength(0);
            }
        } else if (linha - 1 < 0 && coluna - 1 < 0) {
            if (mapa[linha + 1][coluna] == ' ') {
                mapa[linha + 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha + 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna + 1] == ' ') {
                mapa[linha][coluna + 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna + 1))));
                lc.setLength(0);
            }
        } else if (linha + 1 > labirinto.linhaFinal && coluna - 1 < 0) {
            if (mapa[linha - 1][coluna] == ' ') {
                mapa[linha - 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha - 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna + 1] == ' ') {
                mapa[linha][coluna + 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna + 1))));
                lc.setLength(0);
            }
        } else if (linha + 1 > labirinto.linhaFinal && coluna + 1 > labirinto.colunaFinal) {
            if (mapa[linha - 1][coluna] == ' ') {
                mapa[linha - 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha - 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna - 1] == ' ') {
                mapa[linha][coluna - 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna - 1))));
                lc.setLength(0);
            }
        } else if (linha - 1 < 0) {
            if (mapa[linha][coluna - 1] == ' ') {
                mapa[linha][coluna - 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna - 1))));
                lc.setLength(0);
            }
            if (mapa[linha + 1][coluna] == ' ') {
                mapa[linha + 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha + 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna + 1] == ' ') {
                mapa[linha][coluna + 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna + 1))));
                lc.setLength(0);
            }
        } else if (linha + 1 > labirinto.linhaFinal) {
            if (mapa[linha - 1][coluna] == ' ') {
                mapa[linha - 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha - 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna - 1] == ' ') {
                mapa[linha][coluna - 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna - 1))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna + 1] == ' ') {
                mapa[linha][coluna + 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna + 1))));
                lc.setLength(0);
            }
        } else if (coluna - 1 < 0) {
            if (mapa[linha - 1][coluna] == ' ') {
                mapa[linha - 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha - 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha + 1][coluna] == ' ') {
                mapa[linha + 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha + 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna + 1] == ' ') {
                mapa[linha][coluna + 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna + 1))));
                lc.setLength(0);
            }
        } else if (coluna + 1 > labirinto.colunaFinal) {
            if (mapa[linha][coluna - 1] == ' ') {
                mapa[linha][coluna - 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna - 1))));
                lc.setLength(0);
            }
            if (mapa[linha - 1][coluna - 1] == ' ') {
                mapa[linha - 1][coluna - 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha - 1).append(coluna - 1))));
                lc.setLength(0);
            }
            if (mapa[linha + 1][coluna] == ' ') {
                mapa[linha + 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha + 1).append(coluna))));
                lc.setLength(0);
            }
        } else {
            if (mapa[linha - 1][coluna] == ' ') {
                mapa[linha - 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha - 1).append(coluna))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna - 1] == ' ') {
                mapa[linha][coluna - 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna - 1))));
                lc.setLength(0);
            }
            if (mapa[linha][coluna + 1] == ' ') {
                mapa[linha][coluna + 1] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha).append(coluna + 1))));
                lc.setLength(0);
            }
            if (mapa[linha + 1][coluna] == ' ') {
                mapa[linha + 1][coluna] = '+';
                pilha.push(Integer.parseInt(String.valueOf(lc.append(linha + 1).append(coluna))));
                lc.setLength(0);
            }
        }
    }

    public static int calcularLinha(int pos) {
        return pos / 10;
    }

    public static int calcularColuna(int pos) {
        return pos % 10;
    }


    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();

        Scanner sc = new Scanner(System.in);

        retrocesso(labirinto);
        labirinto.imprimir();

        System.out.println("Quer continuar rodando? S/N: ");
        String rodar = sc.nextLine();

        while (rodar.equalsIgnoreCase("s")) {
            acharPosicaoVaga(labirinto);
            labirinto.imprimir();
            pilha.imprimir();
            System.out.println("Quer continuar rodando? S/N: ");
            rodar = sc.nextLine();
        }


    }
}