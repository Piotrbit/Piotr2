public class Main {
    public static void main(String[] args) {
        Client c1 = new Client();
        Client c2 = new Client();
Client c3 = new Client() /* */
        c1.name = "Jan";
        c2.name = new String("Jan");

        System.out.println('a' > 'b');

        System.out.println(c1.name.equals(c2.name));

        Address a1 = new Address();
        a1.street = "Ulica";
        a1.city = "Krakow";
        a1.zipCode = "12-123";
        a1.buildingNo = "10";

        Address a2 = new Address();
        a2.street = "Ulica";
        a2.city = "Krakow";
        a2.zipCode = "12-123";
        a2.buildingNo = "10";

        c1.address = a1;
        c2.address = a2;

        System.out.println(c1.address == c2.address);
        System.out.println(a1.street == a2.street);

        /*String a = "ABC";
        String b = "ABC";


        System.out.println(a == b);*/
    }
}
