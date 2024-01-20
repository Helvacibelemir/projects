package OOP;

abstract class Personel {

    private String personelName;
    private String personelsurName;
    private int birthdate;
    private int emeklilikyas;


    public int getEmeklilikyas() {
        return emeklilikyas;
    }

    public void setEmeklilikyas(int emeklilikyas) {
        this.emeklilikyas = emeklilikyas;
    }


    public String getPersonelName() {
        return personelName;
    }

    public void setPersonelName(String personelName) {
        this.personelName = personelName;
    }

    public String getPersonelsurName() {
        return personelsurName;
    }

    public void setPersonelsurName(String personelsurName) {
        this.personelsurName = personelsurName;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public int yasHesapla(){

        int yas=2024-birthdate;

        return yas;
    }

    public abstract void EmeklilikHesapla();


}
