abstract class Client {
    protected String id;

    public Client(String id) {
        this.id = id;
    }

    public abstract double getPrixTelephoneHautDeGamme();
    public abstract double getPrixTelephoneMoyenDeGamme();
    public abstract double getPrixLaptop();
}
