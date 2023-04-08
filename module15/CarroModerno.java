package module15;

public abstract class CarroModerno {

    private final int qtdPorta;
    private final int qtdAssento;
    private final boolean arcondicionado;

    protected CarroModerno(int qtdPorta, int qtdAssento, boolean arcondicionado) {
        this.qtdPorta = qtdPorta;
        this.qtdAssento = qtdAssento;
        this.arcondicionado = arcondicionado;
    }

    @Override
    public String toString() {
        return "CarroModerno{" +
                "qtdPorta=" + qtdPorta +
                ", qtdAssento=" + qtdAssento +
                ", arcondicionado=" + arcondicionado +
                '}';
    }
}
