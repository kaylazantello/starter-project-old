package w2retrieval.starterproject;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WgAndTxStmtRepository extends MongoRepository<WageAndTaxStatement, String> {
	
    public WageAndTaxStatement findByEmployeeSocialSecurityNumber(String employeeSocialSecurityNumber);
    public List<WageAndTaxStatement> findByEmployerAddressState(String employerAddressState);
    public List<WageAndTaxStatement> findByEmployerIdNo(String employerIdNo);
    public long count();    
}


