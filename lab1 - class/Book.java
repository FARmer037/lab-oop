public class Book {
    private String title;
    private int numberOfPage;
    private String authorName;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, int numberOfPage) {
        this.title = title;
        this.numberOfPage = numberOfPage;
    }

    public Book(String title, int numberOfPage, String authorName) {
        this.title = title;
        this.numberOfPage = numberOfPage;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
