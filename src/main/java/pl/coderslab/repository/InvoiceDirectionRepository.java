package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Company;
import pl.coderslab.entity.InvoiceDirection;

import javax.transaction.Transactional;


@Transactional
@Repository
public interface InvoiceDirectionRepository extends JpaRepository<InvoiceDirection, Long>{


}
