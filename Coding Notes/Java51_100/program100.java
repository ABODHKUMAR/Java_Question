class Bank{
    int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 0;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class Axis extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}

public class program100 {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i= new ICICI();
        Axis a= new Axis();

        System.out.println(s.getRateOfInterest());
        System.out.println(i.getRateOfInterest());
        System.out.println(a.getRateOfInterest());
    }
}
