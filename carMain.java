import java.util.Scanner;
public class carMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER YOUR NAME: ");
        String buyer01 = sc.nextLine();
       car car01 = new car("TOYOTA","AE 86",300,"GRAPHITE WHITE",400);
       car01.carDetail(buyer01);
        }
}
