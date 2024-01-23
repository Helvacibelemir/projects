import java.io.*;

public class HataAyiklama {


    public static void DosyaOkuma() throws FileNotFoundException {
        try {

            Bolme(Topla(5, 8),0);
        } catch (final Exception e) {
            System.out.println("Bolme islemi yapilamadi" +e.getStackTrace());
            return;
        }

    }
    public static int Topla(int x,int y){

            int sum=x+y;

            return sum;
        }

    public static int Bolme(int x,int y){

        int result=x/y;

        return result;
    }

    public static void main(String[] args) {

        try {
            DosyaOkuma();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
