package aula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
    public class ExerciciosAula2 {

        static String minhaString = "Minha variavel na classe";
        /*
        Este programa será utilizado nas nossas aulas
                03  CC-ID                 PIC X(03). **b
                03  CC-TIPO-ENV           PIC X(01).
                03  CC-CD-RRAST           PIC 9(09). Código de remessa
                03  CC-DT-LIBERACAO       PIC X(08).
        */
        public static void main(String[] args) throws Exception {

            args = validarCartaoControle(args);
            imprimirCartaoControle(args);
            // TODO Rodar a query
            // TODO Analisar os dados
            // TODO Impressão em arquivo
        }

        private static void explicandoEscopo() {

            if(true){
                String minhaString = "Minha nova mensagem String";
                System.out.println(minhaString);
            }

            System.out.println(minhaString);
        }

        private static void imprimirCartaoControle(String[] cartaoControle) {

            int i = 0;
            // While -> Enquanto
            while(i < 4) {
                System.out.println(cartaoControle[i]);
                i = i + 1;
            }

            System.out.println("Sai do while");
            System.out.println("Este é o valor de i: " + i);
            System.out.println("");
            // For -> Para
            for(int index = 0; index < 4; index = index + 1) {
                System.out.println(cartaoControle[index]);
            }

            System.out.println("Sai do for");
            System.out.println("");
            // Foreach -> Para cada um
            for(String itemCartaoControle : cartaoControle){
                System.out.println(itemCartaoControle);
            }

            System.out.println("Sai do foreach");
            System.out.println("");
        }

        private static String pegueMeuValor(String[] args) {
            return args[0];
        }

        private static void imprimirNome(String nome, String outroNome) {
            System.out.println("Meu nome é: " + nome);
            System.out.println("Meu nome é: " + outroNome);
        }

        private static String[] validarCartaoControle(String[] cartaoControle) throws Exception {

            if (cartaoControle.length != 4) {
                throw new Exception("CARTÃO CONTROLE DEVE TER 4 PARAMETROS");
            }

            if (!cartaoControle[0].equals("** ")) {
                throw new Exception("CANCELADO POR ERRO NO CARTAO CONTROLE");
            }

            if (!cartaoControle[1].equalsIgnoreCase("E") && !cartaoControle[1].equalsIgnoreCase("R")) {
                throw new Exception(">>> TIPO DE GERACAO INVALIDO");
            }

            if (cartaoControle[2].isBlank() && cartaoControle[3].trim().isEmpty()) {
                throw new Exception(">>> CD REMESSA OU DATA OBRIGATORIO");
            }

            if (cartaoControle[2].isBlank()) {
                cartaoControle[2] = "0";
            } else {
                Integer.parseInt(cartaoControle[2]);
            }

            if (cartaoControle[3].trim().isEmpty()) {
                cartaoControle[3] = "01012021";
            }

            try {
                LocalDate.parse(cartaoControle[3], DateTimeFormatter.ofPattern("ddMMyyyy"));
            } catch (DateTimeParseException e) {
                throw new Exception("Data invalida");
            }

        // Cartão Controle "** " E 15 01012021"

        // Exercicio 01
        // Receba o parametro 3 cartaoControle[2]
        // e verifique se é menor ou igual a 100
        // Caso seja imprima no terminal

            int valorz = Integer.parseInt(cartaoControle[2]);
            if (valorz < 101) {
                System.out.println(" Ex01: O valor do cartaoControle[2] " + valorz + " é menor ou igual a 100");
            }

        // Exercicio 02
        // Receba o parametro 3 cartaoControle[2]
        // e verifique se o valor está entre 10 e 100
        // Caso seja imprima no terminal

            if (valorz < 101) {
                if (valorz > 9) {
                    System.out.println(" Ex02: O valor cartaoControle[2] " + valorz + " está entre 10 e 100");
                }
            }

        // Exercicio 03
        // Receba o parametro 3 cartaoControle[2]
        // e verifique se o valor está entre 10 e 100
        // Caso seja imprima no terminal

            if (valorz < 101 && valorz > 9) {
                System.out.println(" Ex03: O valor cartaoControle[2] " + valorz + " está entre 10 e 100");
            }

        // Exercicio 04
        // Receba o parametro 4 cartaoControle[3]
        // Imprima "seu valor” 5 vezes no terminal

            int i = 1;
            while (i < 6) {
                System.out.println(" Ex04: cartaoControle[3] " + cartaoControle[3] + " Listei " + i);
                i = i + 1;
            }

        // Exercicio 05
        // Receba um inteiro, calcule e imprima o fatorial deste valor
        // O Fatorial de 4 (4!) é 4 * 3 * 2 * 1 = 24

            int valorDado = 4;
            int valorSalvo = valorDado;
            int valorFatorial = valorDado;
            while (valorDado > 1) {
                valorDado = valorDado - 1;
                valorFatorial = valorFatorial * valorDado;
            }
            System.out.println(" Ex05: O Fatorial de " + valorSalvo + " é " + valorFatorial);

        // Exercicio 06
        // Receba o parametro 4 cartaoControle[3]
        // Imprima "seu valor” 5 vezes no terminal

            for (int index = 1; index < 6; index = index + 1) {
                 System.out.println(" Ex06: cartaoControle[3] " + cartaoControle[3] + " Listei " + index);
            }

        // Exercicio 07
        // Receba um inteiro, calcule e imprima o fatorial deste valor. -> ok
        // O Fatorial de 4 (4!) é 4 * 3 * 2 * 1 = 24

            valorDado = valorSalvo;
            valorFatorial = valorDado;
            for (int index = valorSalvo; index > 1; index = index - 1) {
                valorDado = valorDado - 1;
                valorFatorial = valorFatorial * valorDado;
            }
            System.out.println(" Ex07: O Fatorial de " + valorSalvo + " é " + valorFatorial);

        // Exercicio 08
        // Imprima a soma dos numeros entre 1 e 100

            int valordaSoma = 0;
            for (int index = 1; index < 101; index = index + 1) {
                valordaSoma = valordaSoma + index;
            }
            System.out.println(" Ex08: O Valor da Soma dos numeros entre 1 e 100 é " + valordaSoma);

        // Exercicio 09
        // Imprima todos os múltiplos de 3, entre 1 e 100

            int valorMultiplo = 3;
            for (int index = 1; index < 10; index = index + 1) {
                if (index % valorMultiplo == 0) {
                    System.out.println(" Ex09: " + index + " é múltiplo de " + valorMultiplo);
                }
            }

        // Exercicio 10
        // Imprima os fatoriais de 1 a 10
        // O fatorial de um número n é n * (n-1) ex 3! = 3x2!
        // O fatorial de 0 é 1

            int valorInicial = 1;
            int valorFinal = 5;
            while (valorInicial <= valorFinal)
            {
                int valorProposto = valorInicial;
                valorFatorial = 1;
                for (int n = 1; n <= valorProposto; n++) {
                    valorFatorial = valorFatorial * n;
                }
                System.out.println(" Ex10: O Fatorial de " + valorProposto + " é " + valorFatorial);
                valorInicial = valorInicial + 1;
            }

        // Exercicio 11
        // Calccular A série de Fibonacci até o 100
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, etc...

            int valorPrimeiro = 0;
            int valorSegundo = 1;
            int valorTerceiro = 0;
            System.out.println(" Ex11: Fibonacci de 1 a 100");
            System.out.println(valorPrimeiro);
            System.out.println(valorSegundo);
            while ((valorPrimeiro + valorSegundo) <= 100){
                valorTerceiro = valorPrimeiro + valorSegundo;
                System.out.println(valorTerceiro);
                valorPrimeiro = valorSegundo;
                valorSegundo = valorTerceiro;
            }

        // Exercicio 12
        // Escreva um programa que, dada uma variável x com algum valor inteiro,
        // temos um novo x de acordo com a seguinte regra:
        // se x é par, x = x / 2
        // se x é impar, x = 3 * x + 1
        // imprime x
        // O programa deve parar quando x tiver o valor final de 1.
        // Por exemplo, para x = 13, a saída será:
        // 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

            System.out.println(" Ex12:");
            int valorSequencia = 13;
            int valorSaida = valorSequencia;
            while ( valorSaida != 1){
                if (valorSaida % 2 == 0) {
                    valorSaida = valorSaida / 2;
                }
                else {
                    valorSaida = (valorSaida * 3) +1;}
                System.out.println(valorSaida);
                }

        // Exercicio 13
        // Imprima a seguinte tabela, usando fors encadeados:
        // 1
        // 2 4
        // 3 6 9
        // 4 8 12 16
        // n n*2 n*3 .... n*n

            System.out.println(" Ex13:");
            int valorDimensao = 5;
            int valorBase = 1;
            for ( i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    valorBase = i * j;
                     System.out.print(valorBase + " ");
                }
                System.out.println();
            }

        // Exercicio 14
        // Refaça a série de Fibonacci usando apenas duas variáveis

            System.out.println(" 14:");
            int[] meuArrayIntz = new int[20];
            meuArrayIntz[0] = 0;
            System.out.println(meuArrayIntz[0]);
            meuArrayIntz[1] = 1;
            for (int z = 2; meuArrayIntz[z-1] <= 100; z++) {
                System.out.println(meuArrayIntz[z-1]);
                meuArrayIntz[z] = meuArrayIntz[z-1]+meuArrayIntz[z-2];
            }

        //Fim dos Exercicios...

            System.out.println("Fim dos 14 Exercicios propostos");
            return cartaoControle;
        }

        // Explicando váriáveis

        private static void explicarVariaveis() {

            long meuInt = 0;
            meuInt = 2147483648L;
            int meuByte = 130;
            // float -> double
            float meuFloat = 1.0F;
            double meuDouble = -10.5;
            double meuDoublePositivo = 1000.55;
            String meuStringDouble = Double.toString(meuDoublePositivo);
            System.out.println(meuStringDouble.replace('.', ','));
            System.out.println(meuDoublePositivo);
            System.out.println(String.format("%,.2f", meuDoublePositivo));
            double meuDoubleString = Double.valueOf("10,5");
            System.out.println(meuDoubleString);
            // booleano
            boolean meuBolleanTrue = true;
            boolean meuBolleanFalse = false;
            boolean meuBolleanTeste = 1 != 2;
            int[] meuArrayInt = new int[5];
            meuArrayInt[0] = 10;
            meuArrayInt[3] = 30;
            meuArrayInt[4] = 450;
            // Alfanumerico -> char = 'A' -> String = "Sua frase aqui"
            char meuChar = 'A';
            String meuString = "O q vc quiser!! \"";
            System.out.println("O q vc quiser!! \" Olá".toUpperCase(Locale.ROOT));
            //System.out.println(meuArrayInt[0]);
            //System.out.println(meuArrayInt[3]);
            //System.out.println(meuArrayInt[4]);
            System.out.println("Eu terminei de explicar as variáveis");
        }

    }


