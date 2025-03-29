package exo1;

import java.util.ArrayList;
import java.util.List;

public abstract class ServiceGererContacts  implements GestionContacts {
    private static List<Contact> lesContacts = new ArrayList<>();

    public ServiceGererContacts(){
        lesContacts=new ArrayList<>();
    }
    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println(contact);
        }
    }
}
