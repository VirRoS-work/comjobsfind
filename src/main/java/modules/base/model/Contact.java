package modules.base.model;

import javax.persistence.*;

@Entity
@Table(name = "CONTACTS")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String value;

    @OneToOne
    @JoinColumn(name = "contacttype_id")
    private ContactType type;

    public Contact() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public ContactType getType() {
        return type;
    }
    public void setType(ContactType type) {
        this.type = type;
    }
}
