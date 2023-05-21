package adapter.metrou;

public class Main {
    public static void main(String[] args) {
        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        ValidatorSubteran validatorSubteran = new Adapter(validatorMetrou);
        validatorSubteran.valideazaCalatorie();
        validatorSubteran.valideazaAbonament();
    }
}
