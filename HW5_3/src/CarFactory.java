public class CarFactory {
    public static Car getCar(int c)
    {
        switch (c)
        {
            case 1:
                return new Bmw ();
            case 2:
                return new Benz ();
            default:
                return null;
        }
    }


}
