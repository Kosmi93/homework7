import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return agePublic == book.agePublic && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, agePublic);
    }
}
