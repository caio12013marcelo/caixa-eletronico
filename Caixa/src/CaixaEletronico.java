public class CaixaEletronico {
    Nota[] notas;

    public CaixaEletronico(Nota[] nota) {
        this.notas = nota;
    }

    public void depositar(int deposito) {
        int resto = deposito;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i].valor == 100) {
                notas[i].quantNotas +=  resto / 100;
                resto = resto % 100;
            }
            if (notas[i].valor == 50) {
                notas[i].quantNotas +=  resto / 50;
                resto = resto % 50;
            }
            if (notas[i].valor == 20) {
                notas[i].quantNotas +=  resto / 20;
                resto = resto % 20;
            }
            if (notas[i].valor == 10) {
                notas[i].quantNotas +=  resto / 10;
                resto = resto % 10;
            }
            if (notas[i].valor == 5) {
                notas[i].quantNotas +=  resto / 5;
                resto = resto % 5;
            }
            if (notas[i].valor == 2) {
                notas[i].quantNotas +=  resto / 2;
                resto = resto % 2;
            }
        }
    }
}
