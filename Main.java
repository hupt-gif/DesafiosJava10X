package DesafioQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NinjaAvancado[] ninjas = new NinjaAvancado[4];

        NinjaAvancado naruto = new NinjaAvancado("Naruto Uzumaki", 12, TipoHabilidade.NINJUTSU, "Rasengan");
        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", 13, TipoHabilidade.KATON, "Sharingan");
        NinjaAvancado sakura = new NinjaAvancado("Sakura Haruno", 13, TipoHabilidade.TAIJUTSU, "Cura");
        NinjaAvancado hinata = new NinjaAvancado("Hinata Hyuga", 13, TipoHabilidade.TAIJUTSU, "Byakugan");


        int escolhaNinja = 0;
        System.out.println("Escolha um ninja para analisar as habilidades: ");
        System.out.println("1-Naruto");
        System.out.println("2-Sasuke");
        System.out.println("3-Sakura");
        System.out.println("4-Hinata");
        escolhaNinja = scan.nextInt();

        switch (escolhaNinja){
            case 1: {
                naruto.mostrarInformacoes();
                naruto.executarHabilidade();
                break;
            }
            case 2: {
                sasuke.mostrarInformacoes();
                sasuke.executarHabilidade();
                break;
            }
            case 3: {
                sakura.mostrarInformacoes();
                sakura.executarHabilidade();
                break;
            }
            case 4: {
                hinata.mostrarInformacoes();
                hinata.executarHabilidade();
                break;
            }
            default: {
                System.out.println("Selecione uma opção válida");
                break;
            }
        }

        scan.close();
    }
}
