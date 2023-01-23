import java.util.Scanner;
class car{
    Scanner sc= new Scanner (System.in);
    String manufacturer;
    String series;
    int speed;
    String colour;
    int weight;

        car(String manufacturer, String series, int speed,String colour, int weight){
          this.manufacturer = manufacturer;
          this.series = series;
          this.speed = speed;
          this.colour = colour;
          this.weight = weight; 
        }
        car(String manufacturer, String series){
            this.manufacturer = manufacturer;
            this.series = series;
        }
    void carDetail(){
        System.out.print("ENTER YOUR NAME: ");
        String buyer = sc.nextLine();
        System.out.println("HI "+buyer+" \n THE CAR YOU'RE GOING TO BUY IS: "+manufacturer+" "+series+"\nAVAILABLE COLOUR: "+colour+"\n TOP SPEED: "+speed+"KMH"+"\nCAR WEIGHT: "+weight+"KG");
    }
    void carIndentDetail(){
        System.out.print("ENTER YOUR NAME: ");
        String buyer = sc.nextLine();
        System.out.println("HI "+buyer+ " WE CURRENTLY SEARCHING ON THE MARKET FOR "+manufacturer+" "+series+" WE WILL CONTACT YOU AS SOON AS WE GOT OUR HANDS ON ONE OF THEM");
    }
    
}