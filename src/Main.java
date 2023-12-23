public class Main {

    public static void main(String[] args) {

        hRPerson hr=new hRPerson();
        hr.name="belemir";
        hr.surname="helvaci";
        hr.department="IT";

        hRPerson hr2=new hRPerson();
        hr2.name="ercan";
        hr2.surname="helvaci";
        hr2.department="account";

      hr.personReturn();
      hr2.personReturn();

      int i=1;
      String s="45";
      System.out.println(i+s);

}}