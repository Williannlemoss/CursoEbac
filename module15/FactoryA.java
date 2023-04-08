package module15;

public class FactoryA extends Factory{
    @Override
    public CarroModerno criarCarroModerno() {
        return new CarroAModerno(4,6,true);
    }

    @Override
    public CarroAntigo criarCarroAntigo() {
        return new CarroAAntigo(4,4);
    }
}
