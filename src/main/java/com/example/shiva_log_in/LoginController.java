package com.example.shiva_log_in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/api/")
public class LoginController {



    @Autowired
    private LoginDao loginDao;


    @PostMapping(value = "/signup",consumes = "application/json",produces ="application/json" )
    public ResponseEntity confirmationAPI(@RequestBody UserdetailsPOJO user){

        UserdetailsPOJO user1;
        String password=user.getPassword();
        String username= user.getUsername();
        user1=user;
        loginDao.save(user1);
        loginDao.findByUserName(username);

        System.out.println(username+" "+password);
        HashMap<String,String> hm=new HashMap<>();
        hm.put("message","ok");
        return new ResponseEntity(hm, HttpStatus.OK);
        //return loginServiceInterface.confirmationService(user);

    }
}
