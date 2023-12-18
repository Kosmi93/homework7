public class Book {
    private String title;
    private Author author;
    private int agePublic;

    public Book(String title, Author author, int agePublic) {
        this.title = title;
        this.author = author;
        this.agePublic = agePublic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getAgePublic() {
        return agePublic;
    }

    public void setAgePublic(int agePublic) {
        this.agePublic = agePublic;
    }

    @Override
    public String toString() {
        return  title + ' ' +
                " " + author +
                " " + agePublic +" год";
    }
}
