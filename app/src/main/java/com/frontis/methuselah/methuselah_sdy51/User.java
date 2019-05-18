package com.frontis.methuselah.methuselah_sdy51;

/**
 * Άρχικός κώδικας by shiva on 31-01-2018.
 * Τροποποιήθηκε από την ομάδα Αυλωνίτης - Ερενίδης Χαραλαμπόπουλος για την 5η ΓΕ της ΣΔΥ51
 */

class User {
    String Displayname;


    String Email;
    long createdAt;

    public User (){};
    public User(String displayname,String email,long createdAt){
        this.Displayname=displayname;
       this.Email=email;
        this.createdAt=createdAt;
    }


    public String getDisplayname() {
        return Displayname;
    }

    public String getEmail() {
        return Email;
    }

    public long getCreatedAt() {
        return createdAt;
    }

}
