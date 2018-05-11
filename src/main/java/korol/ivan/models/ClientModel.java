package korol.ivan.models;

/**
 * @author Ivan Korol on 5/11/2018
 */
public class ClientModel {
    private long id;

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    private long adminId;
    private String fullName;
    private String contact;

    public ClientModel(String fullName, String contact) {
        this.fullName = fullName;
        this.contact = contact;
    }

    public ClientModel(long id, String fullName, String contact) {
        this.id = id;
        this.fullName = fullName;
        this.contact = contact;
    }

    public ClientModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
