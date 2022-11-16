package factory;

public class FactoryCreator {

    public static AbstractFactory createFactory(FactoryType factoryType){

        return switch (factoryType){
            case LoanFactory -> new LoanFactory();
        };

    }
}
