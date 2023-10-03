
package com.training.org.repository;
import org.springframework.data.repository.CrudRepository;
import com.training.org.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String> {

}
