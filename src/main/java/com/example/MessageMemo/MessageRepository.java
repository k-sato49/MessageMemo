package com.example.MessageMemo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
@Repository
//ここでは、エンティティのクラスとエンティティIDのクラス、EmployeeEntity と String を指定します。
public interface MessageRepository extends CrudRepository<Message, String> {
	@Query(value="select count(M_ID) from T_MESSAGE",nativeQuery=true)
    public int countt_message();
}