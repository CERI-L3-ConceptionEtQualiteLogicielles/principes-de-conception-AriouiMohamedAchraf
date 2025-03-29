package exo1;

public class FormatXML implements FormatContact {
    @Override
    public String formater(Contact contact) {
        return "<contact>\n"
                + "  <nom>" + contact.getNom() + "</nom>\n"
                + "  <prenom>" + contact.getPrenom() + "</prenom>\n"
                + "  <numero>" + contact.getNumero() + "</numero>\n"
                + "  <adresse>" + contact.getAdresse() + "</adresse>\n"
                + "  <civilite>" + contact.getCivilite() + "</civilite>\n"
                + "  <email>" + contact.getEmail() + "</email>\n"
                + "  <dateAnniv>" + contact.getDateAnniv() + "</dateAnniv>\n"
                + "  <lieuDeTravail>" + contact.getLieuDeTravail() + "</lieuDeTravail>\n"
                + "  <ville>" + contact.getVille() + "</ville>\n"
                + "</contact>";
    }
}
