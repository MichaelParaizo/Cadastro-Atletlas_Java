package CursoDevSuperior;

import java.util.Locale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Locale.setDefault(Locale.US);

        Scanner sc = new java.util.Scanner(System.in);

        System.out.printf("Qual a quantidade de atletas? ");
        double numeroAtletas = sc.nextDouble();

        double altura;
        char sexo;
        double peso;
        double somaPeso = 0;
        double somaAltura = 0;
        int somaF = 0;
        double somaM = 0;
        double atletaMaisAlto = 0;
        String nomeAtletaMaisAlto = null;
        int contagemAtletas = 0;


        for (int i = 1; i <= numeroAtletas; i++) {

            System.out.println("Digite os dados do atleta numero " + i);
            System.out.printf("Nome: ");
            String nomeAtleta = sc.next();
            String nome2Atleta = sc.next();

            do {
                System.out.printf("Digite o sexo: ");
                sexo = sc.next().charAt(0);

                if (sexo != 'F' && sexo != 'M') {

                    System.out.println("Valor invalido! Favor digitar F ou M: " + sexo);

                }

            } while (sexo != 'F' && sexo != 'M');

            do {
                System.out.print("Altura: ");
                altura = sc.nextDouble();
                if (altura <= 0) {

                    System.out.println("Valor invalido! Favor digitar um valor positivo: " + altura);
                }
            } while (altura <= 0);

            do {
                System.out.printf("Peso: ");
                peso = sc.nextDouble();
                if (peso < 0) {

                    System.out.println("Valor invalido! Favor digitar um valor positivo: " + peso);
                } else if (peso == 0) {

                    System.out.println("Valor invalido! " + peso);
                }

            } while (peso <= 0);

            somaPeso = somaPeso + peso;

            // -----------------------------------------

            if (atletaMaisAlto < altura) {

                nomeAtletaMaisAlto = (nomeAtleta + " " + nome2Atleta);

            }

            atletaMaisAlto = altura;

            if (sexo == 'M') {

                somaM = somaM + 1;

            }

            if (sexo == 'F') {

                somaAltura = somaAltura + altura;
                contagemAtletas ++;
            }

        }

        double percentualHomens = (somaM / numeroAtletas) * 100;

        System.out.println("-----------------------------");
        System.out.println("        RELATÓRIO");
        System.out.println("-----------------------------");

        double pesoMedioAtletas = somaPeso / numeroAtletas;
        double alturaMediaAtletasF = somaAltura / contagemAtletas;
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedioAtletas);
        System.out.println("Atleta mais alto: " + nomeAtletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n", percentualHomens);
        if (somaAltura == 0) {
            System.out.println("Não há mulheres cadastradas");
        } else
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaAtletasF);

        sc.close();
    }
    }



