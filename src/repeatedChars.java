import java.util.*;


public class repeatedChars {


    public void findRepeatedChar() {

      List<String> supplierNames = new ArrayList<String>();
        List<String> supplierNames3 = new ArrayList<String>();

        String supplierNames2 = "";
        supplierNames.add("sup1");
        supplierNames.add("sup2kkb");
        supplierNames.add("sup3");
        supplierNames.add("sup4bkb");




        for (int x = 0; x < supplierNames.size(); x++) {

            supplierNames2 = supplierNames.get(x);


            for (int i = 0; i < supplierNames2.length() - 1; i++) {
                for (int j = i + 1; j < supplierNames2.length(); j++) {

                    if (supplierNames2.charAt(i) == supplierNames2.charAt(j)) {
                        supplierNames3.add(supplierNames2);

                    }
                }
            }}
        String list=supplierNames3.toString();

System.out.println(list.substring(1, list.length()-1).replace(',','\t').trim());


        }



    public static void main(String[] args) {

        repeatedChars rc=new repeatedChars();
        rc.findRepeatedChar();
    }
    }

