package com.example;

public class ExemploConceitosBasicos {

    // exemplo de tipos de variaveis e operadore
    public void exemploOperacoesVariaveis() {
        int a = 10, b = 20;
        double c = 3.5;
        boolean resultado = (a > b) && (c < 4.0);

        System.out.println("Soma: " + (a + b)); // Soma: 30
        System.out.println("Comparação: " + (a > b)); // Falso
        System.out.println("Resultado lógico: " + resultado); // Falso

    }

    // controle de fluxo (if,else,switch,loops)
    public void exemploControleFluxo() {
        // If-Else
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Switch
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia");
        }

        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // While Loop
        int contador = 5;
        while (contador > 0) {
            System.out.println("Contador: " + contador);
            contador--;
        }
    }

    // Arrays
    public void arrays() {
        int[] numeros = { 10, 20, 30, 40, 50 };
        System.out.println(numeros[0]); // 10

        // Percorrendo o array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }

    // String
    public void strings() {
        String nome = "Java";
        System.out.println("Tamanho: " + nome.length()); // 4
        System.out.println(nome.toUpperCase()); // JAVA
        System.out.println(nome.substring(1, 3)); // av
    }

    // Manipulação de exceções
    public void manipulacaoExcecoes(){
        try {
            int resultado = 10 / 0;  // Lança ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        }
        
        try {
            int[] array = new int[3];
            System.out.println(array[5]);  // Lança ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do limite do array!");
        }     
    }

}
