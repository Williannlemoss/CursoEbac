package module11;

public class Pessoa implements Comparable<Pessoa> {
    public String nome;
    public String sexo;

    public Pessoa(String pessoa) {
        String[] valores = pessoa.split("-");

        this.nome = valores[0];
        this.sexo = valores[1];
    }


    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return "nome= " + nome;
    }
}
