package korol.ivan.models;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class AdminModel {
    private long id;
    private String name;
    private String pass;
    private String questions;
    private String answer;

    public AdminModel(String name, String pass, String questions, String answer) {
        this.name = name;
        this.pass = pass;
        this.questions = questions;
        this.answer = answer;
    }

    public AdminModel(long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public AdminModel(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public AdminModel(long id, String name, String pass, String questions, String answer) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.questions = questions;
        this.answer = answer;
    }

    public AdminModel() {

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

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
