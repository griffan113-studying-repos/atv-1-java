package devices;

public class Celular {
    String marca;
    String modelo;
    int ano;
    String serial;
    String numero;
    int bateria;
    boolean estaLigado;
    float preco;

    public Celular(
            String marca,
            String modelo,
            int ano,
            String serial,
            String numero,
            int bateria,
            boolean estaLigado,
            float preco
    ) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.serial = serial;
        this.numero = numero;
        this.bateria = bateria;
        this.estaLigado = estaLigado;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getSerial() {
        return serial;
    }

    public String getNumero() {
        return numero;
    }

    public int getBateria() {
        return bateria;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public float getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void setEstaLigado(boolean esta_ligado) {
        this.estaLigado = esta_ligado;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
