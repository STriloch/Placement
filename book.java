class Book {

    String title;
    float price;


    Book() 
    {
        this.title = "Java Programming";
        this.price = 100;             
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
     
        Book a = new Book();

        a.display();
    }
}
