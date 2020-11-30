package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.Company;
import pl.coderslab.entity.Vat;
import pl.coderslab.repository.CompanyRepository;
import pl.coderslab.repository.VatRepository;


public class VatConverter implements Converter<String, Vat> {

    @Autowired
    private VatRepository vr;

    @Override
    public Vat convert(String Id) {
        return vr.findById(Long.parseLong(Id)).get();
    }
}
