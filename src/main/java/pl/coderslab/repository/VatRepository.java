package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Company;

@Repository
public interface InvoiceRepository extends JpaRepository<Company, Long> {


}
