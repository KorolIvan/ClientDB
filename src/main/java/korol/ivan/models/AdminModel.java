package korol.ivan.models;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class AdminModel {
    private long id;
    private String name;
    private String pass;

    public AdminModel(long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public AdminModel(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public AdminModel() {
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
