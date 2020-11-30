package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Invoice;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {


}
