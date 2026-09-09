import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        CaixaEletronico caixa = new CaixaEletronico();
        Notas nota100 = new Notas();
        nota100.valor=100,nota20.valor
        nota100.quantNotas=40;

        caixa.nota={nota100};

        u1.nome="Carlos";
        u1.saldo=7005;
        Scanner input = new Scanner(System.in);
        System.out.println("======= CAIXA ELETRÔNICO =======\n" +
                "1 - CONSULTAR SALDO\n" +
                "2 - SAQUE" +
                "\n3 - DEPÓSITO" +
                "\n4 - SAIR" +
                "\n===============================" +
                "\nEscolha a opção desejada: ");
     escolherOpcao(input, u1);
    }
    public static void escolherOpcao(Scanner input, Usuario u1){
        int opc = input.nextInt();
            switch (opc){
                case 01:
                    System.out.println("seu saldo é "+ u1.saldo);
                    break;
            }
    }
}
