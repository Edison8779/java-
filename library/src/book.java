public class book {
    String bname;
    String journal;
    String author;
    boolean isavailable;

    public book(String bname,String journal,String author) {
        this.bname = bname;
        this.journal=journal;
        this.author=author;
        this.isavailable=true;
    }

    public boolean isavailable() {
        return isavailable;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" +
                "bname='" + bname + '\'' +
                ", journal='" + journal + '\'' +
                ", author='" + author + '\'' +
                ", isavailable=" + isavailable +
                '}';
    }
}
