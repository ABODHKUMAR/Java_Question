public class program44 {
    static{
        System.out.println("Static block is executed before main method");
    }
    public static void main(String[] args) {
        System.out.println(" You are using Windows NT operating system");
    }

    static{
        String os=System.getenv("OS");
        if(os.equals("Windows T")!= true){
            System.exit(1);
        }else{
            System.out.println("Hello else");
        }
        System.out.println("end");
    }
}
