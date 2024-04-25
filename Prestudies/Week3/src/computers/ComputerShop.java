package computers;

import java.util.ArrayList;

public class ComputerShop {
    private ArrayList<Computer> computers;
    public ComputerShop() {
        this.computers = new ArrayList<>();
    }
    public void addComputer(Computer computer) {
        this.computers.add(computer);
    }

    public double calculateProfitw() {
        double total = 0;
        for (Computer computer : computers) {
            total  +=  computer.calculateProfit();
        }
        return total;
    }
}
