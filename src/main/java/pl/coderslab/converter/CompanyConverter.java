package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.Company;
import pl.coderslab.repository.CompanyRepository;


public class CompanyConverter implements Converter<String, Company> {

    @Autowired
    private CompanyRepository cr;

    @Override
    public Company convert(String Id) {
        return cr.findById(Long.parseLong(Id)).get();
    }
}
