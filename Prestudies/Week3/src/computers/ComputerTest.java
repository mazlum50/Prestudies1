package computers;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer(
                "HP" ,
                2.4 ,
                16,
                1000,
                3,
                15,
                "Laptop",
                true );
        System.out.println(computer.toString());
        //------------------------- Part 2 ----------------------------
        computer.ramUpgrade();
        computer.setSellingPrice(1199.99);
        computer.setPurchasePrice(900);
        System.out.println(computer.toString());
        //------------------------- Part 3 ----------------------------
        Computer computer1 = new Computer("Asus",
                1.8,
                4,
                256,
                3,
                15.6,
                "Laptop",
                true);
        computer1.setSellingPrice(749.99);
        computer1.setPurchasePrice(500.0);
        Computer computer2 = new Computer("HP",
                2.2,
                8,
                512,
                3,
                13.0,
                "Laptop",
                false);
        computer2.setPurchasePrice(600.0);
        computer2.setSellingPrice(899.99);

        Computer computer3 = new Computer("Apple",
                3.2,
                32,
                1024,
                4,
                15,
                "Laptop",
                true);
        computer3.setPurchasePrice(1200.0);
        computer3.setSellingPrice(1999.99);

        Computer computer4 = new Computer("Lenovo",
                2.2,
                16,
                512,
                3,
                15.0,
                "Laptop",
                true);
        computer4.setPurchasePrice(800.0);
        computer4.setSellingPrice(1099.99);

        Computer computer5 = new Computer("Acer",
                2.8,
                16,
                512,
                3,
                15.6,
                "Desktop",
                false);
        computer5.setPurchasePrice(650);
        computer5.setSellingPrice(899.99);
        ComputerShop computerShop = new ComputerShop();
        computerShop.addComputer(computer1);
        computerShop.addComputer(computer2);
        computerShop.addComputer(computer3);
        computerShop.addComputer(computer4);
        computerShop.addComputer(computer5);
        double re = computerShop.calculateProfitw();
        System.out.println("   " + re);


    }


}
