class ClientParticulier extends Client {
    private String nom;
    private String prenom;

    public ClientParticulier(String id, String nom, String prenom) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public double getPrixTelephoneHautDeGamme() {
        return 1500.0;
    }

    @Override
    public double getPrixTelephoneMoyenDeGamme() {
        return 800.0;
    }

    @Override
    public double getPrixLaptop() {
        return 1200.0;
    }
}
