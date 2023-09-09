package org.java.desafio.dio.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Telefone> telefone = new ArrayList<>();
    private static ArrayList<Musical> musica = new ArrayList<>();

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Estamos no Sistema de telefone do Mano\n1 - Sistema de Chamada\n2 - Sistema MP3");
        int opt = leia.nextInt();

        switch (opt) {
            case 1:
                sistemaChamadas();
                break;
            case 2:
                sistemaMP3();
                break;
        }
    }

    private static void sistemaMP3() {
        if (musica.isEmpty()) {
            addMusica();
        }
        if (!musica.isEmpty()) {
            System.out.println("\n\n1 - Pausar música\n2 - Adicionar música\n3 - Escolher música para tocar\n0 - Voltar para o menu");
            int opt = leia.nextInt();
            switch (opt) {
                case 1:
                    pausar();
                    break;
                case 2:
                    addMusica();
                    break;
                case 3:
                    escolherMus();
                    break;
                case 0:
                    menu();
                    break;
            }
        }
    }

    private static void pausar() {
        System.out.println("\n\nMúsica pausada");
        sistemaMP3();
    }

    private static void escolherMus() {
        for (Musical m : musica) {
            System.out.println(m + "\nEscolha a música para tocar:");
            leia.nextLine();
            String nome = leia.nextLine();
            if (nome.equalsIgnoreCase(m.getNome())) {
                System.out.println("\n\nTocando " + m);
            } else {
                System.out.println("Essa música não está no seu sistema");
            }
        }
        sistemaMP3();
    }

    private static void addMusica() {
        System.out.println("Digite o nome da música:");
        leia.nextLine();
        String nome = leia.nextLine();
        Musical music = new Musical(nome);
        musica.add(music);
        sistemaMP3();
    }

    private static void sistemaChamadas() {

        if (telefone.isEmpty()) {
            addContato();
        }
        if (!telefone.isEmpty()) {
            System.out.println("1 - Ligar\n2 - Contatos disponíveis\n3 - Adicionar contato\n0 - Voltar para o Menu");
            int opt = leia.nextInt();
            switch (opt) {
                case 0:
                    menu();
                    break;
                case 1:
                    ligar();
                    break;
                case 2:
                    contatoDisp();
                    break;
                case 3:
                    addContato();
                    break;
            }

        }
        sistemaChamadas();
    }

    private static void addContato() {
        System.out.println("Adicione um contato: ");
        int numero = leia.nextInt();
        for (Telefone t : telefone) {
            if (numero == t.getContato()) {
                System.out.println("Esse número já está salvo");
                sistemaChamadas();
            }
        }
        Telefone contato = new Telefone(numero, 0, 0, 0);
        telefone.add(contato);
        sistemaChamadas();
    }

    private static void contatoDisp() {
        for (Telefone t : telefone) {
            System.out.println(t);
        }
        sistemaChamadas();
    }

    private static void ligar() {
        for (Telefone t : telefone) {
            System.out.println("Digite o número para ligar:");
            int ligar = leia.nextInt();
            if (ligar == t.getContato()) {
                t.setLigar(t.getLigar() + ligar);
            }
            if (ligar != t.getContato()) {
                System.out.println("Esse telefone não está salvo");
            }
        }
        sistemaChamadas();
    }
}




