package modules.base.model;

import javax.persistence.*;

@Entity
@Table(name = "CONTACTTYPES")
public class ContactType {

    @Id
    @Column(name = "contacttype_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

//    @OneToOne(mappedBy = "type")
//    private Contact contact;

    public ContactType() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    public Contact getContact() {
//        return contact;
//    }
//    public void setContact(Contact contact) {
//        this.contact = contact;
//    }
}
