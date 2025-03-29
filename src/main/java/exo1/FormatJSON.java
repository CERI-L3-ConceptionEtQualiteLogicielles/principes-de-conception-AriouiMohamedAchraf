package exo1;

public class FormatJSON implements FormatContact {
    @Override
    public String formater(Contact contact) {
        return "{\n"
                + "  \"nom\": \"" + contact.getNom() + "\",\n"
                + "  \"prenom\": \"" + contact.getPrenom() + "\",\n"
                + "  \"numero\": \"" + contact.getNumero() + "\",\n"
                + "  \"adresse\": \"" + contact.getAdresse() + "\",\n"
                + "  \"civilite\": \"" + contact.getCivilite() + "\",\n"
                + "  \"email\": \"" + contact.getEmail() + "\",\n"
                + "  \"dateAnniv\": \"" + contact.getDateAnniv() + "\",\n"
                + "  \"lieuDeTravail\": \"" + contact.getLieuDeTravail() + "\",\n"
                + "  \"ville\": \"" + contact.getVille() + "\"\n"
                + "}";
    }
}
