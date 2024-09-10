class car{
   String brandName = "Honda!!!!";
    public void button()
    {
        final int capacity = 100;
        int wheeldrive= 2;
        class engine
        {
            public void start()
            {
              System.out.println(brandName+" car with cap of "+capacity+ " cc "+wheeldrive+" wheel drive");
            }
        }
        engine e = new engine();
        e.start();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        car  thecar = new car();
        thecar.button();
    }
}