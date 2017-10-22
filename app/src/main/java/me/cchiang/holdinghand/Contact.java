package me.cchiang.holdinghand;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by christian on 10/20/17.
 */

@IgnoreExtraProperties
public class Contact {

    // Object containing the information of a contact
    public String name;
    public String phone;

    public Contact() {
    }

    public Contact(String n, String p){
        name = n;
        phone = p;
    }

}
