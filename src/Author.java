public class Author {
    private String secondsName;
    private String name;
    private String surname;

    public Author(String secondsName, String name, String surname) {
        this.secondsName = secondsName;
        this.name = name;
        this.surname = surname;
    }

    public String getSecondsName() {
        return secondsName;
    }

    public void setSecondsName(String secondsName) {
        this.secondsName = secondsName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  secondsName + ' '
                + name + ' ' + surname ;
    }
}
