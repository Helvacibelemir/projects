package OOP;

import OOP.Personel;

public class Woman extends Personel {



    @Override
    public void EmeklilikHesapla() {
        setEmeklilikyas(60);
        setBirthdate(1989);
        System.out.println("Emekli olmak icin geçen yil" +(getEmeklilikyas()-yasHesapla()));
    }
}
