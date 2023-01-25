
class carSold extends car  {
    int price;
    String buyer;
    void carSoldDetail(){
        System.out.println(manufacturer+" "+series+" "+colour+" WAS BOUGHT BY "+buyer+" "+" FOR: $"+price+" Million");
    }
    void greet(){
        System.out.println("WELCOME BACK CUSTOMER!");
    }
    
}
