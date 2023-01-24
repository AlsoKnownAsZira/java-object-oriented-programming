public class carMain {
    
    public static void main(String[] args) {
       
       car car01 = new car("TOYOTA","AE 86",300,"GRAPHITE WHITE",400);
       car01.greet();
       car01.carDetail();
        car carIndent01 = new car("LAMBORGHINI","HURACAN");
        carIndent01.greet();
        carIndent01.carIndentDetail();
        carSold carSold01 = new carSold();
        carSold01.greet();
        carSold01.manufacturer = "NISSAN";
        carSold01.series ="GT-R";
        carSold01.colour = "BRAVE RED";
        carSold01.price = 250;
        carSold01.buyer = "Zira";
        carSold01.carSoldDetail();
    }
}
