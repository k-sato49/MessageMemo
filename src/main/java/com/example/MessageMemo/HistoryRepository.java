package com.example.MessageMemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
@Repository

public interface HistoryRepository extends CrudRepository<History, String> {
	//@Query(value="select count(M_ID) from T_MESSAGE",nativeQuery=true)
   // public int countt_message();
}


//ここでは、エンティティのクラスとエンティティIDのクラス、EmployeeEntity と String を指定します。
 