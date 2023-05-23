public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        System.out.println();
        System.out.println("98 / 1.87");
        System.out.println(service.bmi(98, 1.87));

        System.out.println();
        System.out.println("48 / 1.64");
        System.out.println(service.bmi(48, 1.64));

        System.out.println();
        System.out.println("100 / 1.75");
        System.out.println(service.bmi(100, 1.75));


    }
}