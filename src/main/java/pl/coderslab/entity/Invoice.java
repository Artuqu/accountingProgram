package pl.coderslab.entity;



import org.hibernate.annotations.Proxy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

@Proxy(lazy = false)
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    private String invoiceNumber;


    private String date;

    private double amountNetto;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Vat vat;

    private double amountBrutto;

    public Invoice() {
    }

    public long getId() {
        return id;
    }

    public Invoice setId(long id) {
        this.id = id;
        return this;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Invoice setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Invoice setDate(String date) {
        this.date = date;
        return this;
    }

    public Vat getVat() {
        return vat;
    }

    public Invoice setVat(Vat vat) {
        this.vat = vat;
        return this;
    }




    public double getAmountNetto() {
        return amountNetto;
    }

    public Invoice setAmountNetto(double amountNetto) {
        this.amountNetto = amountNetto;
        return this;
    }

    public double getAmountBrutto() {
        return amountBrutto;
    }

    public Invoice setAmountBrutto(double amountBrutto) {
        this.amountBrutto = amountBrutto;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Invoice setCompany(Company company) {
        this.company = company;
        return this;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", company=" + company +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", date='" + date + '\'' +
                ", amountNetto=" + amountNetto +
                ", vat=" + vat +
                ", amountBrutto=" + amountBrutto +
                '}';
    }


}
