/**
 * @author willian.lemos
 *
 * @version 1.0
 */
public class Automovel {

    private int qtdRodas;
    private String marca;
    private String modelo;
    private int macha;
    private int velocidade;

    public Carro(int qtdRodas, String marca, String modelo) {
        this.qtdRodas = qtdRodas;
        this.marca = marca;
        this.modelo = modelo;
        this.macha = 0;
        this.velocidade = 0;
    }

    public int qtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String marca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String modelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int macha() {
        return macha;
    }

    public void setMacha(int macha) {
        this.macha = macha;
    }

    public int velocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * aumenta a macha em 1
     */
    public void aumentarMacha(){
        this.macha++;
    }

    /**
     * diminui a macha em 1
     */
    public void diminuirMacha(){
        if( macha > 0)
            this.macha--;
    }

    /**
     * aumenta a velocidade em 1
     */
    public void aumentarVelocidade(){
        this.velocidade++;
    }

    /**
     * diminui a velocidade em 1
     */
    public void diminuirVelocidade(){
        if(velocidade > 0)
            this.velocidade--;
    }
}