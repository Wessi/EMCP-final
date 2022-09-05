package net.mofed.reportracking.app.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import net.mofed.reportracking.app.model.Transaction;

@Repository

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	 //pagination
	
		@Query("from Transaction as c where c.user.id =:userid")
		
		//Pageable->current page-page
		//Contact per page -5
		public Page<Transaction> findTransByUser(@Param("userid")int userid,Pageable perpage);

}
