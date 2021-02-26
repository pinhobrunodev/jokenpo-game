package services;

public class JoKenPoService {

    public static String escolhaJogador(int n) {

        switch (n) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";

            case 4:

                System.exit(0);
                break;

        }
        return "Jogo finalizado";

    }

    public static void result(int n, String pc) {

        String escolhaJogador = escolhaJogador(n);

        if (pc.equals(escolhaJogador(n))) {
            System.out.println("Empate");
        }

        if (pc.equals("Papel") && escolhaJogador.equals("Tesoura")) {
            System.out.println("Jogador  venceu");
        }

        if (pc.equals("Papel") && escolhaJogador.equals("Pedra")) {
            System.out.println("Computador venceu");
        }

        if (pc.equals("Tesoura") && escolhaJogador.equals("Pedra")) {
            System.out.println("Jogador  venceu");
        }

        if (pc.equals("Tesoura") && escolhaJogador.equals("Papel")) {
            System.out.println("Computador venceu");
        }

        if (pc.equals("Pedra") && escolhaJogador.equals("Papel")) {
            System.out.println("Jogador  venceu");
        }

        if (pc.equals("Pedra") && escolhaJogador.equals("Tesoura")) {
            System.out.println("Computador venceu");
        }

    }

}