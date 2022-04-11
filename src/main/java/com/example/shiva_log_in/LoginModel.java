package com.example.shiva_log_in;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "userDetails")
// Class
public class LoginModel {

    // Attributes
    @Id
    private int id;
    private String userName;
    private String password;
}
