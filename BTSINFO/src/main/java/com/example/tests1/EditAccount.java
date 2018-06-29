package com.example.tests1;

import org.springframework.data.repository.CrudRepository;

//**********@author Siddhartha.B**************//
//*************28-June-2018***************//

public interface EditAccount extends CrudRepository<Account, String> {

	Account findOne(String acnt_id);

	void delete(Account deleted);

}
