import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Usuario u1 = new Usuario();


        Nota nota100 = new Nota(100,40);
        Nota nota50 = new Nota(50,40);
        Nota nota20 = new Nota(20,30);
        Nota nota10 = new Nota(10,30);
        Nota nota5 = new Nota(5,15);
        Nota nota2 = new Nota(2,15);
        Nota[] moedas ={nota100,nota50, nota20, nota10, nota5, nota2};
        CaixaEletronico caixa = new CaixaEletronico(moedas);
        u1.nome="Carlos";
        u1.saldo=7005;
        Scanner input = new Scanner(System.in);
        int opc=1;
        while (opc!=4) {
            System.out.println("======= CAIXA ELETRÔNICO =======\n" +
                    "1 - CONSULTAR SALDO\n" +
                    "2 - SAQUE" +
                    "\n3 - DEPÓSITO" +
                    "\n4 - SAIR" +
                    "\n===============================" +
                    "\nEscolha a opção desejada: ");
            opc = input.nextInt();
            switch (opc) {
                case 01:
                    System.out.println("seu saldo é " + u1.saldo);
                    break;
                case 02:
                    System.out.println("nada");
                    break;
                case 03:
                    System.out.println("Informe o valor do déposito: ");
                    int deposito = input.nextInt();
                    caixa.depositar(deposito);
                    break;
                case 04:
                    System.out.println("Adeus");
                    break;
                default:
                    System.out.println("erro");
                    break;
            }
        }
        System.out.println(moedas[0].quantNotas);
        input.close();
    }
}
