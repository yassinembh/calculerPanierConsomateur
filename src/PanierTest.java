import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PanierTest {

    @Test
    public void testCalculerTotalPourClientParticulier() {
        ClientParticulier particulier = new ClientParticulier("1", "Dupont", "Jean");
        Panier panier = new Panier(2, 1, 3);

        double total = panier.calculerTotal(particulier);

        double expected = (2 * 1500.0) + (1 * 800.0) + (3 * 1200.0);
        assertEquals(expected, total, 0.001);
    }

    @Test
    public void testCalculerTotalPourClientProfessionnelChiffreAffairesSuperieur() {
        ClientProfessionnel pro = new ClientProfessionnel("2", "Société A", "FR123456", "123456789", 15_000_000);
        Panier panier = new Panier(1, 2, 1);

        double total = panier.calculerTotal(pro);

        double expected = (1 * 1000.0) + (2 * 550.0) + (1 * 900.0);
        assertEquals(expected, total, 0.001);
    }

    @Test
    public void testCalculerTotalPourClientProfessionnelChiffreAffairesInferieur() {
        ClientProfessionnel pro = new ClientProfessionnel("3", "Société B", "", "987654321", 5_000_000);
        Panier panier = new Panier(3, 0, 2);

        double total = panier.calculerTotal(pro);

        double expected = (3 * 1150.0) + (0 * 600.0) + (2 * 1000.0);
        assertEquals(expected, total, 0.001);
    }

    @Test
    public void testPrixIndividuelParticulier() {
        ClientParticulier particulier = new ClientParticulier("4", "Martin", "Julie");

        assertEquals(1500.0, particulier.getPrixTelephoneHautDeGamme(), 0.001);
        assertEquals(800.0, particulier.getPrixTelephoneMoyenDeGamme(), 0.001);
        assertEquals(1200.0, particulier.getPrixLaptop(), 0.001);
    }

    @Test
    public void testPrixIndividuelProfessionnelSuperieur() {
        ClientProfessionnel pro = new ClientProfessionnel("5", "Entreprise C", null, "111222333", 12_000_000);

        assertEquals(1000.0, pro.getPrixTelephoneHautDeGamme(), 0.001);
        assertEquals(550.0, pro.getPrixTelephoneMoyenDeGamme(), 0.001);
        assertEquals(900.0, pro.getPrixLaptop(), 0.001);
    }

    @Test
    public void testPrixIndividuelProfessionnelInferieur() {
        ClientProfessionnel pro = new ClientProfessionnel("6", "Startup D", "FR987654", "444555666", 2_000_000);

        assertEquals(1150.0, pro.getPrixTelephoneHautDeGamme(), 0.001);
        assertEquals(600.0, pro.getPrixTelephoneMoyenDeGamme(), 0.001);
        assertEquals(1000.0, pro.getPrixLaptop(), 0.001);
    }
}
