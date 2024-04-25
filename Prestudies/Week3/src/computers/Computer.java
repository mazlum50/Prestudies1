package computers;

public class Computer {
    //------------------------- Part 1 ----------------------------
    private String manufacturer ;
    private double processorSpeed;
    private int  ram;
    private int hardDriveSize;
    private int usbPort;
    private double screenSize;
    private String computerType;
    private boolean preinstallOS;
    //------------------------- fields - Part 2 ----------------------------
    private double sellingPrice;
    private double purchasePrice;
    //------------------------- Part 1 ----------------------------
    public Computer() {
    }
    public Computer(String manufacturer , double screenSize , boolean preinstallOS){
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.preinstallOS = preinstallOS;
    }
    public Computer(String manufacturer ,
                    double processorSpeed,
                    int ram,
                    int hardDriveSize,
                    int usbPort,
                    double screenSize ,
                    String computerType ,
                    boolean preinstallOS){
        this.manufacturer = manufacturer;
        this.processorSpeed = processorSpeed;
        this.ram = ram;
        this.hardDriveSize = hardDriveSize;
        this.usbPort = usbPort;
        this.screenSize = screenSize;
        this.computerType = computerType;
        this.preinstallOS = preinstallOS;

    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public double getProcessorSpeed(){
        return this.processorSpeed;
    }
    public int getRam(){
        return this.ram;
    }
    public int getHardDriveSize(){
        return this.hardDriveSize;
    }
    public int getUsbPort(){
        return this.usbPort;
    }
    public double getScreenSize(){
        return this.screenSize;
    }
    public String getComputerType(){
        return this.computerType;
    }
    public boolean getPreinstallOS(){
        return this.preinstallOS;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setProcessorSpeed(double processorSpeed){
        this.processorSpeed = processorSpeed;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setHardDriveSize(int hardDriveSize){
        this.hardDriveSize = hardDriveSize;
    }
    public void setUsbPort(int usbPort){
        this.usbPort = usbPort;
    }
    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }
    public void setComputerType(String computerType){
        this.computerType = computerType;
    }
    public void setPreinstallOS(boolean preinstallOS){
        this.preinstallOS = preinstallOS;
    }
    public String toString(){
            return
            "manufacturer :  " + manufacturer + "\n" +
            " processorSpeed : " + processorSpeed +"\n" +
            " ram : " + ram +"\n" +
            " hardDriveSize : " + hardDriveSize +"\n" +
            " number Of USB Ports : " + usbPort +"\n" +
            " screen Size :=" + screenSize +"\n" +
            " computer Type  : " + computerType +"\n" +
            "Preinstalled OS : " + preinstallOS +"\n" +
        //------------------------- Part 2 ----------------------------
            "Purchase Price :" + purchasePrice +"\n" +
            "Selling Price  :" + sellingPrice +"\n" +
            "Profit  :" + calculateProfit() ;
    }
    /*
    Other properties :
    Graphics card memory
    Graphics card type
    Price
    Weight
    */
    //------------------------- Part 2 ----------------------------
    public void ramUpgrade(){
        this.ram = ram * 2;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public double calculateProfit(){
        return this.sellingPrice - this.purchasePrice;
    }
}
