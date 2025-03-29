package exo1;

public class FormatTexte implements FormatContact {
    @Override
    public String formater(Contact contact) {
        return "Nom: " + contact.getNom() + ", Prénom: " + contact.getPrenom() + ", Numéro: " + contact.getNumero()
                + ", Adresse: " + contact.getAdresse() + ", Civilité: " + contact.getCivilite()
                + ", Email: " + contact.getEmail() + ", Date d'anniversaire: " + contact.getDateAnniv()
                + ", Lieu de travail: " + contact.getLieuDeTravail() + ", Ville: " + contact.getVille();
    }
}
