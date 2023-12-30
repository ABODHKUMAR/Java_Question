public class program37 {
    public static void main(String[] args) {
        String s1="This is index of example";
        int index1=s1.indexOf("is");
        int indx2=s1.indexOf("index");
        System.out.println(index1+" "+indx2);

        int index3=s1.indexOf("is",4);
        System.out.println(index3);
        int index4=s1.indexOf("s");
        System.out.println(index4);
    }
}
