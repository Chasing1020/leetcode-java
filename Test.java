public class Test {
//    public static int a = 0;
    public static void main(String[] args) {
        int a = 1;
        a = (++a) + (++a) + (a++);
        System.out.println(a);
//        for (int j = 0; j < 100; j++) {
//            new Thread(() ->
//            {
//                for (int i = 0; i < 10000; i++) {
//                    a++;
//                }
//            }).start();
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
    }
}