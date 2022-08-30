public class PlanoDeVoo {
    String destino;
    String origem;
    String nomeDoPiloto;
    String data;
    double tempoEstimado;

    public PlanoDeVoo(String destino, String origem, String nomeDoPiloto, String data, double tempoEstimado) {
        this.destino = destino;
        this.origem = origem;
        this.nomeDoPiloto = nomeDoPiloto;
        this.data = data;
        this.tempoEstimado = tempoEstimado;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setNomeDoPiloto(String nomeDoPiloto) {
        this.nomeDoPiloto = nomeDoPiloto;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigem() {
        return origem;
    }

    public String getNomeDoPiloto() {
        return nomeDoPiloto;
    }

    public String getData() {
        return data;
    }

    public void setTempoEstimado(double tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public double getTempoEstimado() {
        return tempoEstimado;
    }
}
