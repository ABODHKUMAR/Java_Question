public class program57 {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        System.out.println(" Free Memory in JVM before Garbage Collections = " + rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after Garbage collcetion = "+rs.freeMemory());
    }
}
