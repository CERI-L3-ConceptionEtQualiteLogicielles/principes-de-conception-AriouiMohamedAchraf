package exo1;

public class Contact {
    private final String nom;
    private final String numero;
    private final String prenom;
    private final String adresse;
    private final String civilite;
    private final String email;
    private final String dateAnniv;
    private final String lieuDeTravail;
    private final String ville;

    private Contact(ContactBuilder builder) {
        this.nom = builder.nom;
        this.numero = builder.numero;
        this.prenom = builder.prenom;
        this.adresse = builder.adresse;
        this.civilite = builder.civilite;
        this.email = builder.email;
        this.dateAnniv = builder.dateAnniv;
        this.lieuDeTravail = builder.lieuDeTravail;
        this.ville = builder.ville;
    }

    public String getNom() { return nom; }
    public String getNumero() { return numero; }
    public String getPrenom() { return prenom; }
    public String getAdresse() { return adresse; }
    public String getCivilite() { return civilite; }
    public String getEmail() { return email; }
    public String getDateAnniv() { return dateAnniv; }
    public String getLieuDeTravail() { return lieuDeTravail; }
    public String getVille() { return ville; }

    public String getInfoContact(FormatContact format) {
        return format.formater(this);
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Numéro: " + numero
                + ", Adresse: " + adresse + ", Civilité: " + civilite
                + ", Email: " + email + ", Date d'anniversaire: " + dateAnniv
                + ", Lieu de travail: " + lieuDeTravail + ", Ville: " + ville;
    }

    public static class ContactBuilder {
        private final String nom;
        private final String numero;
        private String prenom = "Non spécifié";
        private String adresse = "Non spécifiée";
        private String civilite = "Non spécifiée";
        private String email = "Non spécifié";
        private String dateAnniv = "Non spécifiée";
        private String lieuDeTravail = "Non spécifié";
        private String ville = "Non spécifiée";

        public ContactBuilder(String nom, String numero) {
            if (nom == null || numero == null) {
                throw new IllegalArgumentException("Nom and Numero are required!");
            }
            this.nom = nom;
            this.numero = numero;
        }

        public ContactBuilder addPrenom(String prenom) { this.prenom = prenom; return this; }
        public ContactBuilder addAdresse(String adresse) { this.adresse = adresse; return this; }
        public ContactBuilder addCivilite(String civilite) { this.civilite = civilite; return this; }
        public ContactBuilder addEmail(String email) { this.email = email; return this; }
        public ContactBuilder addDateAnniv(String dateAnniv) { this.dateAnniv = dateAnniv; return this; }
        public ContactBuilder addLieuDeTravail(String lieuDeTravail) { this.lieuDeTravail = lieuDeTravail; return this; }
        public ContactBuilder addVille(String ville) { this.ville = ville; return this; }

        public Contact build() {
            return new Contact(this);
        }
    }
}
