
package com.apparel.apparel.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "apparels")
public class Apparel {

    @Id
    private String id;

    private String type;
    private String condition;
    private String category;
    private String description;

    private Contact contact;  // Embedded contact details
    private Address address;  // Embedded address details
}

@Data
class Contact {
    private String name;          // Name of the person submitting the apparel
    private String phoneNumber;   // Phone number for contact
    private String email;         // Email address for contact
}

@Data
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
