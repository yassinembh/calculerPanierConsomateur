class ClientProfessionnel extends Client {
    private String raisonSociale;
    private String numeroTVA;
    private String siren;
    private double chiffreAffaires;

    public ClientProfessionnel(String id, String raisonSociale, String numeroTVA, String siren, double chiffreAffaires) {
        super(id);
        this.raisonSociale = raisonSociale;
        this.numeroTVA = numeroTVA;
        this.siren = siren;
        this.chiffreAffaires = chiffreAffaires;
    }

    @Override
    public double getPrixTelephoneHautDeGamme() {
        return chiffreAffaires > 10_000_000 ? 1000.0 : 1150.0;
    }

    @Override
    public double getPrixTelephoneMoyenDeGamme() {
        return chiffreAffaires > 10_000_000 ? 550.0 : 600.0;
    }

    @Override
    public double getPrixLaptop() {
        return chiffreAffaires > 10_000_000 ? 900.0 : 1000.0;
    }
}
