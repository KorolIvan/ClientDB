package korol.ivan.model;

/**
 * @author by Ivan Korol on 6/20/2017.
 */
public class Client {

    private int id;
    private String fio;
    private String contact;
    private String product;
    private String textile;
    private int price;
    private int avance;
    private int rest;
    private String dedline;

    public Client(String fio, String contact, String product, String textile, int price, int avance, int rest, String dedline) {
        this.fio = fio;
        this.contact = contact;
        this.product = product;
        this.textile = textile;
        this.price = price;
        this.avance = avance;
        this.rest = rest;
        this.dedline = dedline;
    }

    public Client(int id, String fio, String contact, String product, String textile, int price, int avance, int rest, String dedline) {

        this.id = id;
        this.fio = fio;
        this.contact = contact;
        this.product = product;
        this.textile = textile;
        this.price = price;
        this.avance = avance;
        this.rest = rest;
        this.dedline = dedline;
    }

    public Client() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTextile() {
        return textile;
    }

    public void setTextile(String textile) {
        this.textile = textile;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public String getDedline() {
        return dedline;
    }

    public void setDedline(String dedline) {
        this.dedline = dedline;
    }


}
