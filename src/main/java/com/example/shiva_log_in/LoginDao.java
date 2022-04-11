package com.example.shiva_log_in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface LoginDao extends MongoRepository<UserdetailsPOJO,String> {

    Optional<UserdetailsPOJO> findByUserName(String username);

}
