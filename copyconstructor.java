 class Rectangle {
    float length;
    float width;

     Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

     Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
    }

     float area() {
        return length * width;
    }

     float perimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    public static void main(String[] args) {
     
        Rectangle a = new Rectangle(10, 5);
       
        Rectangle b = new Rectangle(a);

        a.display();
        b.display();

        System.out.println("Area of rect1: " + a.area());
        System.out.println("Perimeter of rect1: " + b.perimeter());

        System.out.println("Area of rect2: " + b.area());
        System.out.println("Perimeter of rect2: " + b.perimeter());
    }
}
