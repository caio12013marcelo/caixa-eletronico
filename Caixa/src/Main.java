import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();

        Notas nota100 = new Notas(100,40);
        Notas nota50 = new Notas(50,40);
        Notas notas20 = new Notas(20,30);
        Notas notas10 = new Notas(10,30);
        Notas notas5 = new Notas(5,15);
        Notas notas2= new Notas(2,15);
        Notas[] moedas ={nota100,nota50,notas20,notas10,notas5,notas2};
        CaixaEletronico caixa = new CaixaEletronico(moedas);
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
     escolherOpcao(input, u1,caixa);
    }
    public static void escolherOpcao(Scanner input, Usuario u1,CaixaEletronico caixa){
        int opc = input.nextInt();
            switch (opc){
                case 01:
                    System.out.println("seu saldo é "+ u1.saldo);
                    break;
                case 02:
                    System.out.println("nada");
                    break;
                case 03:
                    System.out.println("Informe o valor do déposito: ");
                    int depos= input.nextInt();
                    caixa.depositar(depos);
                    break;
            }
    }
}
