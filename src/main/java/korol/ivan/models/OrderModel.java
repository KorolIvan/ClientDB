package korol.ivan.models;

import java.util.Date;

/**
 * @author Ivan Korol on 5/11/2018
 */
public class OrderModel {
    private long orderId;
    private long customerId;
    private String productName;
    private String textile;
    private boolean price;
    private boolean avance;
    private boolean restSumm;
    private Date dedline;
    private String description;

    public OrderModel(long orderId, long customerId, String productName, String textile, boolean price, boolean avance, boolean restSumm, Date dedline, String description) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productName = productName;
        this.textile = textile;
        this.price = price;
        this.avance = avance;
        this.restSumm = restSumm;
        this.dedline = dedline;
        this.description = description;
    }

    public OrderModel(long orderId, String productName, String textile, boolean price, boolean avance, boolean restSumm, Date dedline, String description) {
        this.orderId = orderId;
        this.productName = productName;
        this.textile = textile;
        this.price = price;
        this.avance = avance;
        this.restSumm = restSumm;
        this.dedline = dedline;
        this.description = description;
    }

    public OrderModel(String productName, String textile, boolean price, boolean avance, boolean restSumm, Date dedline, String description) {
        this.productName = productName;
        this.textile = textile;
        this.price = price;
        this.avance = avance;
        this.restSumm = restSumm;
        this.dedline = dedline;
        this.description = description;
    }

    public OrderModel() {
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTextile() {
        return textile;
    }

    public void setTextile(String textile) {
        this.textile = textile;
    }

    public boolean isPrice() {
        return price;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }

    public boolean isAvance() {
        return avance;
    }

    public void setAvance(boolean avance) {
        this.avance = avance;
    }

    public boolean isRestSumm() {
        return restSumm;
    }

    public void setRestSumm(boolean restSumm) {
        this.restSumm = restSumm;
    }

    public Date getDedline() {
        return dedline;
    }

    public void setDedline(Date dedline) {
        this.dedline = dedline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
