package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;
import pl.coderslab.entity.Company;
import pl.coderslab.entity.Invoice;
import pl.coderslab.entity.Vat;
import pl.coderslab.repository.CompanyRepository;
import pl.coderslab.repository.InvoiceRepository;
import pl.coderslab.repository.VatRepository;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Transactional
@Controller
//@SessionScope
@RequestMapping("invoice")
public class InvoiceController {

    private final CompanyRepository cr;
    private final VatRepository vr;
    private final InvoiceRepository ir;

    @Autowired
    public InvoiceController(VatRepository vr, InvoiceRepository ir, CompanyRepository cr){
        this.ir=ir;
        this.vr=vr;
        this.cr=cr;
    }

    @GetMapping("/all/{id}")
    public String showInvoices(Model m, @PathVariable long id) {
        cr.getOne(id);
        List<Invoice> invoices = ir.findAll();
        m.addAttribute("invoices", invoices);
        return "invoices/allInvoices";
    }

    //add
    @GetMapping("/add/{id}")
    public String addInvoice(Model m, @PathVariable long id) {
        m.addAttribute("invoice", new Invoice());
        cr.getOne(id);
        return "invoices/addInvoice";
    }

//    @GetMapping("/add/{id}")
//    public String addInvoice(Model m, @PathVariable long id) {
//        cr.getOne(id);
//        m.addAttribute("company", cr.getOne(id));
//        m.addAttribute("invoice", new Invoice());
//
//        return "invoices/addInvoice";
//    }

    @Transactional
    @PostMapping("/add/{id}")
    public String addInvoicePost(@ModelAttribute("invoice") @Valid Invoice invoice, BindingResult result, Model m,  @PathVariable long id) {
        if (result.hasErrors()) {
            return "invoices/addInvoice";
        }
        invoice.getCompany();
        this.ir.save(invoice);
        m.addAttribute("invoice", invoice);

        return "redirect:../all/{id}";
    }



    @ModelAttribute("companies")
    public List<Company> companies(){
        return cr.findAll();
    }

    @ModelAttribute("vates")
    public List<Vat> vates(){return vr.findAll();}

    //delete
    @Transactional
    @GetMapping("delete/{id}")
    public String deleteInvoice(@PathVariable long id) {
        this.ir.deleteById(id);
        return "invoices/deleted";
    }

    //edit

    //edit
    @GetMapping("edit/{id}")
    public String editCompany(@PathVariable long id, Model m) {
        m.addAttribute("invoice", ir.getOne(id));
        return "invoices/editInvoices";
    }


    @PostMapping("edit")
    public String editInvoice(@ModelAttribute("invoice") @Valid Invoice invoice, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "invoices/editInvoices";
        }
        Invoice one = ir.getOne(invoice.getId())
                .setAmountBrutto(invoice.getAmountBrutto())
                .setInvoiceNumber(invoice.getInvoiceNumber())
                .setAmountNetto(invoice.getAmountNetto())
                .setDate(invoice.getDate())
                .setVat(invoice.getVat())
                .setCompany(invoice.getCompany());


        this.ir.save(one);
        m.addAttribute("invoice", one);
        return "redirect:all";
    }

}
