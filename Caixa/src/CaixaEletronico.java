public class CaixaEletronico {
    Nota[] notas;

    public CaixaEletronico(Nota[] nota) {
        this.notas = nota;
    }

    public void depositar(int deposito) {
        int resto = deposito;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i].valor == 100) {
                notas[i].quantNotas += deposito / 100;
                deposito = resto - deposito * 100;
            }
        }
    }
}
