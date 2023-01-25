import javax.sound.sampled.SourceDataLine;

public class employerMain {
    public static void main(String[] args) {
    manager manager01 = new manager("ZIRA","MALANG",25);
    manager01.showIdentity();
    security security01 = new security("MAMAN", "KEDIRI", 30);
    security01.showIdentity();
    OB OB01 =new OB("MIMIN", 30);
    OB01.showIdentity("MIMIN",30);
}}
