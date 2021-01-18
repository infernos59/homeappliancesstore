public class homeappliancesstore {

    static int i;
    static String onomaetairias;
    static String dieunthnisietairias;

    public static void main(String[] args) {

        try {
            onomaetairias = args[0];
            dieunthnisietairias = args[1];
            i = Integer.parseInt(args[2]);

        } catch (Exception e) {
            System.out.println("lathos");
            return;
        }

        System.out.println(onomaetairias + " " + dieunthnisietairias + " " + i);
    }
}