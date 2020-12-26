package contact;

import contact.Telephone;

public class ContactDetails {
    private String eMail;
    private Telephone gsm;
    private Telephone telephone;

    public ContactDetails(String eMail, String gsm, String telephone) {
        this.eMail = eMail;
        this.gsm = new Telephone(gsm, "mobile");
        this.telephone = new Telephone(telephone, "fixed");
    }

    public String geteMail() {
        return eMail;
    }

    public Telephone getGsm() {
        return gsm;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("E-mail: ").append(geteMail()).append("\n")
                .append("Tel: ").append(getTelephone()).append("\n")
                .append("GSM: ").append(getGsm());
        return sb.toString();
    }
}
