
public class shapeMain {
    
    public static void main(String[] args) {
        shape shape01 = new shape();
        System.out.println(shape01.showCorner());
        

        triangle triangle01 = new triangle();
        System.out.println(triangle01.showCorner());
        System.out.println(triangle01.showParentCorner());
    }
}
