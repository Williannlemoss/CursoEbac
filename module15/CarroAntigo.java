package module15;

public abstract class CarroAntigo {

    private final int qtdPorta;
    private final int qtdAssento;

    protected CarroAntigo(int qtdPorta, int qtdAssento) {
        this.qtdPorta = qtdPorta;
        this.qtdAssento = qtdAssento;
    }

    @Override
    public String toString() {
        return "CarroAntigo{" +
                "qtdPorta=" + qtdPorta +
                ", qtdAssento=" + qtdAssento +
                '}';
    }
}
