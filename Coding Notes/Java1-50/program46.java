public class program46 {
    program46(){
        System.out.println(" You are in main class");
    }
    void show(){
        System.out.println("Show function of main class");
    }

    public static void main(String[] args) {
        program46 object46= new program46();
        object46.show();
        Innerprogram46 objectInnerprogram46=new Innerprogram46();
        objectInnerprogram46.show();
    }
}

class Innerprogram46 {
  
    Innerprogram46(){
        System.out.println(" You are in inner class");

    }
    void show(){
        System.out.println(" You are in show of Inner class");
    }
    
}