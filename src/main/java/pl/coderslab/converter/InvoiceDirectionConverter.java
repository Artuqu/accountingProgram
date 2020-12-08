package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.Company;
import pl.coderslab.entity.InvoiceDirection;
import pl.coderslab.repository.CompanyRepository;
import pl.coderslab.repository.InvoiceDirectionRepository;


public class InvoiceDirectionConverter implements Converter<String, InvoiceDirection> {

    @Autowired
    private InvoiceDirectionRepository idr;

    @Override
    public InvoiceDirection convert(String Id) {
        return idr.findById(Long.parseLong(Id)).get();
    }
}
