package OOP;

public class Man extends Personel {


    @Override
    public void EmeklilikHesapla() {

        setEmeklilikyas(65);
        setBirthdate(1987);
        System.out.println("Emekli olmak icin geçen yil" + (getEmeklilikyas() - yasHesapla()));
    }
}