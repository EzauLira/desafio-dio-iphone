package org.auladio.projetoiphone.controller;


import org.auladio.projetoiphone.config.TempoResposta;
import org.auladio.projetoiphone.dao.IphoneDao;
import org.auladio.projetoiphone.exception.NumeroInvalidoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IphoneDao iphone = new IphoneDao();
        Scanner input = new Scanner(System.in);

        int menu;
        int escolha = 0;

        System.out.println("Iphone ligado? ");

        iphone.statusIphone();

        System.out.println("Ligando iphone");

        TempoResposta.tempo();
        System.out.println(".");
        TempoResposta.tempo();
        System.out.println(".");
        TempoResposta.tempo();
        System.out.println(".");
        TempoResposta.tempo();

        System.out.println("Iphone ligado? ");
        iphone.ligarIphone();

        while (true) {

            System.out.println("""
                    Escola um aplicativo: \

                    (1) - Reprodutor de Musica\

                    (2) - Navegador\

                    (3) - chamada\

                    (0) - Sair do programa""");
            menu = input.nextInt();
            switch (menu) {
                case 1:

                    do {
                        try {
                            System.out.println("""
                                    Escola opção: \

                                    (1) - Tocar musica\

                                    (2) - Pausar musica\

                                    (3) - Selecionar musica\

                                    (4) - Sair""");
                            escolha = input.nextInt();

                            if (escolha == 1) {
                                iphone.tocarMusica();

                            } else if (escolha == 2) {
                                iphone.pausarMusica();

                            } else if (escolha == 3) {
                                iphone.selecionarMusica();

                            } else if (escolha == 4) {
                                iphone.saindo();

                            }

                            NumeroInvalidoException.numeroInvalido(escolha);
                        } catch (NumeroInvalidoException e) {
                            System.out.println(e.getMessage());
                        }

                    } while (escolha != 4);

                    break;
                case 2:

                    do {
                        try {
                            System.out.println("""
                                    Escola opção: \

                                    (1) - Exibir página\

                                    (2) - Atualizar página\

                                    (3) - Adicionar página\

                                    (4) - Sair""");
                            escolha = input.nextInt();

                            if (escolha == 1) {
                                iphone.exibirpagina();

                            } else if (escolha == 2) {
                                iphone.atualizarPagina();

                            } else if (escolha == 3) {
                                iphone.adicionarNovaPagina();

                            } else if (escolha == 4) {
                                iphone.saindo();

                            }

                            NumeroInvalidoException.numeroInvalido(escolha);
                        } catch (NumeroInvalidoException e) {
                            System.out.println(e.getMessage());
                        }

                    } while (escolha != 4);
                    break;
                case 3:
                    do {
                        try {
                            System.out.println("""
                                    Escola opção: \

                                    (1) - Ligar\

                                    (2) - Atender\

                                    (3) - Iniciar correio de voz\

                                    (4) - Sair""");
                            escolha = input.nextInt();

                            if (escolha == 1) {
                                iphone.ligar();

                            } else if (escolha == 2) {
                                iphone.atender();

                            } else if (escolha == 3) {
                                iphone.iniciarCorreioDeVoz();

                            } else if (escolha == 4) {
                                iphone.saindo();

                            }

                            NumeroInvalidoException.numeroInvalido(escolha);
                        } catch (NumeroInvalidoException e) {
                            System.out.println(e.getMessage());
                        }

                    } while (escolha != 4);
                    break;
                case 0:
                    iphone.ateMais();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
