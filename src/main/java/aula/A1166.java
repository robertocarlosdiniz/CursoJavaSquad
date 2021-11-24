package aula;

public class A1166 {
    /*
    Este programa será utilizado nas nossas aulas
            03  CC-ID                 PIC X(03).
            03  CC-SP1                PIC X(01).
            03  CC-TIPO-ENV           PIC X(01).
            03  CC-SP2                PIC X(01).
            03  CC-CD-RRAST           PIC 9(09). Código de remessa
            03  CC-SP3                PIC X(01).
            03  CC-DT-LIBERACAO       PIC X(08).
    */
    public static void main(String[] args) {
        //explicarVariaveis();
        //System.out.println("Estou de volta aqui");
        //validarCartaoControle(args);
        imprimirNome("Lucas", "Adriano");
        // TODO Rodar a query
        // TODO Analisar os dados
        // TODO Impressão em arquivo
    }

    private static void imprimirNome(String nome, String outroNome) {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Meu nome é: " + outroNome);
    }

    private static void validarCartaoControle(String[] cartaoControle) {
        System.out.println(cartaoControle[0]);
        System.out.println(cartaoControle[1]);
        System.out.println(cartaoControle[2]);
        System.out.println(cartaoControle[3]);
    }

    private static void explicarVariaveis() {
        // byte -> short -> int -> long
        long meuInt = 0;
        meuInt = 2147483648L;
        int meuByte = 130;
        // float -> double
        float meuFloat = 1.0F;
        double meuDouble = -10.5;
        double meuDoublePositivo = 10.5;
        // Alfanumerico -> char = 'A' -> String = "Sua frase aqui"
        char meuChar = 'A';
        String meuString = "O q vc quiser!! \"";
        // booleano
        boolean meuBolleanTrue = true;
        boolean meuBolleanFalse = false;
        boolean meuBolleanTeste = 1 == 2;
        int[] meuArrayInt = new int[5];
        meuArrayInt[0] = 10;
        meuArrayInt[3] = 30;
        meuArrayInt[4] = 450;
        //System.out.println(meuArrayInt[0]);
        //System.out.println(meuArrayInt[3]);
        //System.out.println(meuArrayInt[4]);
        System.out.println("Eu terminei de explicar as variáveis");
    }
}

