package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Invoice;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

//    @Query("SELECT amountNetto FROM Invoice WHERE Invoice.id = :id")
//    List <Invoice> findAllAmountNetto(double amountNetto);



}
