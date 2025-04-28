class Panier {
    private int nbTelephoneHautDeGamme;
    private int nbTelephoneMoyenDeGamme;
    private int nbLaptop;

    public Panier(int nbTelephoneHautDeGamme, int nbTelephoneMoyenDeGamme, int nbLaptop) {
        this.nbTelephoneHautDeGamme = nbTelephoneHautDeGamme;
        this.nbTelephoneMoyenDeGamme = nbTelephoneMoyenDeGamme;
        this.nbLaptop = nbLaptop;
    }

    public double calculerTotal(Client client) {
        return nbTelephoneHautDeGamme * client.getPrixTelephoneHautDeGamme()
                + nbTelephoneMoyenDeGamme * client.getPrixTelephoneMoyenDeGamme()
                + nbLaptop * client.getPrixLaptop();
    }
}
