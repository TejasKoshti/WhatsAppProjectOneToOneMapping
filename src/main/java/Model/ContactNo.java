package Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "contact_No")
//@Getter             //******** to add getter from lambok dependency **********
//@Setter             //******** to add setter from lambok dependency **********

public class ContactNo {
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public boolean isFiveGEnableORNot() {
        return fiveGEnableORNot;
    }

    public void setFiveGEnableORNot(boolean fiveGEnableORNot) {
        this.fiveGEnableORNot = fiveGEnableORNot;
    }

    public WhatsAppInfo getWhatsAppAccountRef() {
        return whatsAppAccountRef;
    }

    public void setWhatsAppAccountRef(WhatsAppInfo whatsAppAccountRef) {
        this.whatsAppAccountRef = whatsAppAccountRef;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "contact_id")
    private int contactId;

    @Column(name = "contact_number")
    private long contactNumber;

    @Column(name = "contact_holder_name")
    private String contactName;

    @Column(name = "service_provider")
    private String serviceProvider;

    @Column(name = "fiveG_enabled_not")
    private boolean fiveGEnableORNot;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "whatsapp_account_ref")
    private WhatsAppInfo whatsAppAccountRef;
}
