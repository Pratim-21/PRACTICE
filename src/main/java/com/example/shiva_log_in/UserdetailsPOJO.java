package com.example.shiva_log_in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userDetails")
public class UserdetailsPOJO {
    @Id
    String username;
    String password;

    public void setUsername(String username)
    {
        this.username=username;

    }
    public String getUsername()
    {
        return username;
    }
    public void setPassword(String password)
    {
        this.password=password;

    }
    public String getPassword()
    {
        return password;
    }
}
