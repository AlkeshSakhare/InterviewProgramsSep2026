package fajp;

public class SerialNos4Digits {
    //    public static void main(String[] args) {
//        String nos;
//        for (int i = 0; i <= 9999; i++) {
//            if (i < 10) {
//                nos = "000" + i;
//            } else if (i < 100) {
//                nos = "00" + i;
//            } else if (i < 1000) {
//                nos = "0" + i;
//            } else {
//                nos = String.valueOf(i);
//            }
//            System.out.println(nos);
//        }
//    }
    public static void main(String[] args) {
        for (int i = 0; i <= 9999; i++) {
            String nos = String.format("%04d", i);
            System.out.println(nos);
        }
    }
}
