package module17;

public abstract class Carro {

    private String nome;

    public Carro(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
