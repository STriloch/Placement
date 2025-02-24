abstract class Circle
{
    static double area,circum,r;
    static void get(int x)
    {
        r=x;
    }
    static void calc_area()
    {
        area=3.14*r*r;
        System.out.println("Area ="+area);
    }
    static void calc_circum()
    {
        circum = 2*3.14*r;
        System.out.println("Circumference ="+circum);
    }
    static public void main(String s[])
    {
        get(89);
        calc_area();
        calc_circum();
}
}