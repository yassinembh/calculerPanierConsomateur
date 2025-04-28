import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Êtes-vous un client particulier ou professionnel ? (p/pro)");
        String typeClient = scanner.nextLine();

        Client client;

        if (typeClient.equalsIgnoreCase("p")) {
            System.out.println("Entrez votre ID client :");
            String id = scanner.nextLine();
            System.out.println("Entrez votre nom :");
            String nom = scanner.nextLine();
            System.out.println("Entrez votre prénom :");
            String prenom = scanner.nextLine();

            client = new ClientParticulier(id, nom, prenom);
        } else if (typeClient.equalsIgnoreCase("pro")) {
            System.out.println("Entrez votre ID client :");
            String id = scanner.nextLine();
            System.out.println("Entrez votre raison sociale :");
            String raisonSociale = scanner.nextLine();
            System.out.println("Entrez votre numéro de TVA (optionnel, sinon laissez vide) :");
            String numeroTVA = scanner.nextLine();
            System.out.println("Entrez votre SIREN :");
            String siren = scanner.nextLine();
            System.out.println("Entrez votre chiffre d'affaires annuel :");
            double chiffreAffaires = scanner.nextDouble();
            scanner.nextLine();

            client = new ClientProfessionnel(id, raisonSociale, numeroTVA, siren, chiffreAffaires);
        } else {
            System.out.println("Type de client invalide !");
            scanner.close();
            return;
        }

        System.out.println("Combien de téléphones haut de gamme ?");
        int nbHautDeGamme = scanner.nextInt();

        System.out.println("Combien de téléphones moyen de gamme ?");
        int nbMoyenDeGamme = scanner.nextInt();

        System.out.println("Combien de laptops ?");
        int nbLaptops = scanner.nextInt();

        Panier panier = new Panier(nbHautDeGamme, nbMoyenDeGamme, nbLaptops);

        double total = panier.calculerTotal(client);

        System.out.printf("Le total du panier est de : %.2f euros%n", total);

        scanner.close();
    }
}
