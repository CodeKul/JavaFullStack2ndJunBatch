package polymorphism.methodoverriding;

public class RBI {
    float getRateOfInterest(){
        return 7;
    }
}
class SBI extends RBI{
    float getRateOfInterest() {
        return 8;
    }
}
class ICICI extends RBI{
    float getRateOfInterest(){
        return 9;
    }
}
class HDFC extends RBI{
    float getRateOfInterest(){
        return 9.9f;
    }
}
class RBIImpl{
    public static void main(String[] args) {
        RBI rbi; //reference variable
        rbi = new ICICI();
        System.out.println(rbi.getRateOfInterest());
        rbi = new HDFC();
        System.out.println(rbi.getRateOfInterest());

    }
}