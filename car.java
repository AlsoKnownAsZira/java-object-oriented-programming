class car{
    String manufacturer;
    String series;
    int speed;
    String colour;
    int weight;
    final String produced = "JAPAN";

        car(String manufacturer, String series, int speed,String colour, int weight){
          this.manufacturer = manufacturer;
          this.series = series;
          this.speed = speed;
          this.colour = colour;
          this.weight = weight; 
        }
    void carDetail(String buyer){
        System.out.println("HI "+buyer+" \n THE CAR YOU'RE GOING TO BUY IS: "+manufacturer+" "+series+"\nAVAILABLE COLOUR: "+colour+"\n TOP SPEED: "+speed+"KMH"+"\nCAR WEIGHT: "+weight+"KG");
    }
}