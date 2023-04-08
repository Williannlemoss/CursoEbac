package module15;

public class FactoryB extends Factory{
    @Override
    public CarroModerno criarCarroModerno() {
        return new CarroBModerno(4,4,false);
    }

    @Override
    public CarroAntigo criarCarroAntigo() {
        return new CarroBAntigo(2,4);
    }
}
