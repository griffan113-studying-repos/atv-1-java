import devices.Celular;

public class Aviao {
    String marca;
    String modelo;
    int anoDaFabricacao;
    int velocidadeMaxima;
    int velocidade;
    int qntDeLugares;
    int qntDeTurbinas;
    String potenciaDoMotor;
    String compania;
    boolean estaLigado;
    boolean estaVoando;
    Celular painel;
    PlanoDeVoo planoDeVoo;

    public Aviao(
            String marca,
            String modelo,
            int anoDaFabricacao,
            int velocidadeMaxima,
            int velocidade,
            int qntDeLugares,
            int qntDeTurbinas,
            String potenciaDoMotor,
            String compania,
            boolean estaLigado,
            boolean estaVoando
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDaFabricacao = anoDaFabricacao;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidade = velocidade;
        this.qntDeLugares = qntDeLugares;
        this.qntDeTurbinas = qntDeTurbinas;
        this.potenciaDoMotor = potenciaDoMotor;
        this.compania = compania;
        this.estaLigado = estaLigado;
        this.estaVoando = estaVoando;
    }

    public void setPlanoDeVoo(
            String destino,
            String origem,
            String nomeDoPiloto,
            String data,
            double tempoEstimado
    ) {
        this.planoDeVoo =
                new PlanoDeVoo(
                        destino,
                        origem,
                        nomeDoPiloto,
                        data,
                        tempoEstimado
                );
    }

    public PlanoDeVoo getPlanoDeVoo() {
        return planoDeVoo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoDaFabricacao(int anoDaFabricacao) {
        this.anoDaFabricacao = anoDaFabricacao;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setQntDeLugares(int qntDeLugares) {
        this.qntDeLugares = qntDeLugares;
    }

    public void setQntDeTurbinas(int qntDeTurbinas) {
        this.qntDeTurbinas = qntDeTurbinas;
    }

    public void setPotenciaDoMotor(String potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public void setEstaVoando(boolean estaVoando) {
        this.estaVoando = estaVoando;
    }

    public void setPainel(
            String marca,
            String modelo,
            int ano,
            String serial,
            String numero,
            int bateria,
            boolean estaLigado,
            float preco
    ) {
        this.painel = new Celular(
                marca,
                modelo,
                ano,
                serial,
                numero,
                bateria,
                estaLigado,
                preco
        );
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoDaFabricacao() {
        return anoDaFabricacao;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getQntDeLugares() {
        return qntDeLugares;
    }

    public int getQntDeTurbinas() {
        return qntDeTurbinas;
    }

    public String getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public String getCompania() {
        return compania;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public boolean isEstaVoando() {
        return estaVoando;
    }

    public Celular getPainel() {
        return painel;
    }


    public void decolar() {
        if (planoDeVoo == null) {
            System.out.println("O avião precisa de um plano de voo para decolar...");

            return;
        }

        if (estaLigado) {
            System.out.println("Decolando rumo à " + planoDeVoo.getDestino() + "\n");
            System.out.println("A viagem irá durar: " + planoDeVoo.getTempoEstimado() + "horas \n");
            estaVoando = true;
        } else {
            System.out.println("O avião precisa estar ligado para decolar");
        }
    }

    public void pousar() {
        if (estaVoando) {
            System.out.println("Pousando...");
            estaVoando = false;
        } else {
            System.out.println("O avião precisa estar voando para pousar");
        }
    }
}
