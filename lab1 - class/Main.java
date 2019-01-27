public class Main {
    public static void main(String[] args) {

        Book mybook1 = new Book();
        Book mybook2 = new Book("Java Programming");
        Book mybook3 = new Book("C Programming", 100);
        Book mybook4 = new Book("OOP", 1000, "Somkid");

        mybook1.setTitle("OOP");
        mybook1.setNumberOfPage(1000);

        mybook2.setTitle("Networ");
        mybook2.setNumberOfPage(600);

        mybook1.setAuthorName("Somkid");
        mybook2.setAuthorName("Somsuk");
        mybook3.setAuthorName("Somchai");

        System.out.println("Title is " + mybook1.getTitle() +
                " Number of page is " + mybook1.getNumberOfPage() +
                " Author name is " + mybook1.getAuthorName());

        System.out.println("Title is " + mybook2.getTitle() +
                " Number of page is " + mybook2.getNumberOfPage() +
                " Author name is " + mybook1.getAuthorName());

        System.out.println("Title is " + mybook3.getTitle() +
                " Number of page is " + mybook3.getNumberOfPage() +
                " Author name is " + mybook1.getAuthorName());

        System.out.println(mybook1.isSameBook(mybook3));
    }
}
