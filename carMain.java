import java.util.Scanner;
public class carMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER YOUR NAME: ");
        String buyer01 = sc.nextLine();
       car car01 = new car();
       car01.manufacturer = "TOYOTA";
       car01.series = "AE 86";
       car01.speed = 300;
       car01.colour = "GRAPHITE WHITE";
       car01.weight = 400;
       
        }
}
