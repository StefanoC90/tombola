class Sacco {

    private static int es;
    private static boolean a[] = new boolean[91];


    public Sacco() {
        int i;
        for (i = 1; i < 91; i++)
            a[i] = false;
    }

    public static int getEs() {
        return es;
    }

    public static void setEs(int es) {
        Sacco.es = es;
    }

    public static boolean[] getA() {
        return a;
    }

    public static void setA(boolean[] a) {
        Sacco.a = a;
    }

    public static void estrazione() {
        while (true) {
            es = (int) (Math.random() * 90 + 1);
            if (a[es] == false)
                break;
        }
        a[es] = true;
    }
}
    