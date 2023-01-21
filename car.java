class car{
    String manufacturer;
    String series;
    int speed;
    String colour;
    int weight;
    final String produced = "JAPAN";

    void carDetail(String buyer){
        System.out.println("HI "+buyer+" \n THE CAR YOU'RE GOING TO BUY IS: \n "+manufacturer+" "+series+"\nAVAILABLE COLOUR: "+colour+"\n TOP SPEED "+speed+"KMH"+"\nCAR WEIGHT: "+weight+"KG");
    }
}