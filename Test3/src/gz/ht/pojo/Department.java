package gz.ht.pojo;

public class Department {

    private Integer id;
    private String title;
    private String des;

   
    public Department() {}

    public Department(String title, String des) {
        this.title = title;
        this.des = des;
    }

    public Department(Integer id, String title, String des) {
        this.id = id;
        this.title = title;
        this.des = des;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
