public class manager {
    String name;
    String adress;
    int age;
    manager (String name, String adress, int age){
    this.name =  name;
    this.adress = adress;
    this.age = age;
    }
     manager(String name, int age) { // creating another constructor
    }
    void showIdentity(){
        System.out.println("MANAGER: "+name+"\nADRESS: "+adress+"\nAGE"+age);
    }
}

class security extends manager{
    security(String name, String adress, int age){
        super(name,adress,age);//super keyword to access parent class constructor
    }
    void showIdentity(){
        System.out.println("SECURITY: "+name+"\nADRESS: "+adress+"\nAGE"+age);
    }
}

class OB extends manager{
    OB(String name, int age){ //accessing the  constructor with name and age parameter
        super(name, age);
    }
    void showIdentity(String name, int age){
        System.out.println("OFFICE BOY: "+name+"\nAGE"+age);
    }
}