public class program42 {

    program42(){
        System.out.println("You are in constructor");
    }
    void nonstaticMethod(){
        System.out.println("You are calling non static methods");
    }
    static void staticMethod(){
        System.out.println("You are calling static method");
    }
    
    public static void main(String[] args) {
        staticMethod();
        program42 object= new program42();
        object.nonstaticMethod();
    }
}
