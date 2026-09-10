public class CaixaEletronico {
    Notas[] nota;

    public CaixaEletronico(Notas[] nota) {
        this.nota = nota;
    }
    public void depositar(int deposito){
        int resto= deposito;
        for (int i = 0; i < nota.length; i++) {
            if (nota[i].valor==100){
                nota[i] .quantNotas += deposito/100;
                deposito= resto-deposito*100;
            }
        }
    }
}
