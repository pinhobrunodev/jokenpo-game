package tui;

import java.util.Random;
import java.util.Scanner;

import services.JoKenPoService;

public class JoKenPoTUI {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            String names[] = { "Pedra", "Papel", "Tesoura" };
            String pc = names[new Random().nextInt(names.length)];

            System.out.println("_______JOKENPO_______");
            System.out.println("1-Pedra");
            System.out.println("2-Papel");
            System.out.println("3-Tesoura");
            System.out.println("4-Sair");
            n = sc.nextInt();
            System.out.println("Escolha do jogador: " + JoKenPoService.escolhaJogador(n));
            System.out.println("Escolha do computador: " + pc);
            JoKenPoService.result(n, pc);

        } while (n != 4);

        sc.close();

    }
}
