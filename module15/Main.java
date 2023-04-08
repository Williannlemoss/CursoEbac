package module15;

import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();

        log.info(factoryA.criarCarroModerno().toString());
        log.info(factoryA.criarCarroAntigo().toString());
        log.info(factoryB.criarCarroModerno().toString());
        log.info(factoryB.criarCarroAntigo().toString());
    }
}
