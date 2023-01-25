 class shape {
    int showCorner(){
        return 0;
    }

    
}
class triangle extends shape {
  
    int showCorner(){ 
        super.showCorner(); // super keyword to access and change show corner return value;
        return 3;
    }
    int showParentCorner(){
      return  super.showCorner(); // super keyword to access show corner return value
    }
}

