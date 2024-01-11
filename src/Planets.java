public enum Planets {

    Merkur, Venus, Dunya, Mars, Jupiter, Saturn, Uranus, Neptun;

    public static class SunSystem {

        public static void bilgiler() {
            Planets plnts = Dunya;

            switch (plnts) {
                case Merkur:
                    System.out.println("sira: " + 1 + "uzaklık:" + 5 + "yarıcap: " + 4.12 + "Donme süresi: " + 10);
                    break;
                case Venus:
                    System.out.println("sira: " + 2 + "uzaklık:" + 6 + "yarıcap: " + 5.18 + "Donme süresi: " + 12);
                    break;
                case Dunya:
                    System.out.println("Dunyanın sirasi: " + 3 + "uzaklık:" + 7 + "yarıcap: " + 6.20 + "Donme süresi: " + 14);
                    break;
                case Mars:
                    System.out.println("sira: " + 4 + "uzaklık:" + 8 + "yarıcap: " + 8.10 + "Donme süresi: " + 16);
                    break;
                case Jupiter:
                    System.out.println("sira: " + 5 + "uzaklık:" + 9 + "yarıcap: " + 10.20 + "Donme süresi: " + 18);
                    break;
                case Saturn:
                    System.out.println("sira: " + 6 + "uzaklık:" + 10 + "yarıcap: " + 12.20 + "Donme süresi: " + 20);
                    break;
                case Uranus:
                    System.out.println("sira: " + 7 + "uzaklık:" + 11 + "yarıcap: " + 14.20 + "Donme süresi: " + 22);
                    break;
                case Neptun:
                    System.out.println("sira: " + 8 + "uzaklık:" + 12 + "yarıcap: " + 16.20 + "Donme süresi: " + 24);
                    break;
            }
        }


        public static void main(String[] args) {


            bilgiler();

        }

    }
}

