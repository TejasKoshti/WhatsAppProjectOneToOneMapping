package Model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="whatsapp_account")
//@Getter         //******** to add getter from lambok dependency **********
//@Setter         //******** to add setter from lambok dependency **********
public class WhatsAppInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "whatsAppIdGenertor")
    @SequenceGenerator(name = "whatsAppIdGenertor",initialValue = 10001,allocationSize = 2000)

    @Column(name="whatsapp_id")
    private int whatsAppId;

    @Column(name="whatsapp_number")
    private long whatsappNumber;

    @Column(name="whatsapp_name")
    private String whatsappName;

    @Column(name="about")
    private String about;
    @Column(name="account_type")
    private String accountType;


    public int getWhatsAppId() {
        return whatsAppId;
    }

    public void setWhatsAppId(int whatsAppId) {
        this.whatsAppId = whatsAppId;
    }


    public String getWhatsappName() {
        return whatsappName;
    }

    public void setWhatsappName(String whatsappName) {
        this.whatsappName = whatsappName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(long whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }
}
