public class Main {
    public static void main(String[] args) {
        Sign sign1 = new Sign("ABC222DE", 3);
        System.out.println(sign1.numberOfLines());
        System.out.println(sign1.getLines());
        System.out.println(sign1.getLines());

        Sign sign2 = new Sign("ABCD", 10);
        System.out.println(sign2.numberOfLines());
        System.out.println(sign2.getLines());

        Sign sign3 = new Sign("ABCDEF", 6);
        System.out.println(sign3.numberOfLines());
        System.out.println(sign3.getLines());

        Sign sign4 = new Sign("", 4);
        System.out.println(sign4.numberOfLines());
        System.out.println(sign4.getLines());

        Sign sign5 = new Sign("AB_CD_EF", 2);
        System.out.println(sign5.numberOfLines());
        System.out.println(sign5.getLines());

        Sign sign6 = new Sign("Everything on sale, please come in", 15);
        System.out.println(sign6.numberOfLines());
        System.out.println(sign6.getLines());
    }
}