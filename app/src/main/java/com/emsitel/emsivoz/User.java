package com.emsitel.emsivoz;

/**
 * Created by Emsitel on 22/03/2016.
 */
public class User {
    String name,uipass,credit;
    int celular,id;

    public User(String name, String credit, int id,int celular, String uipass){
        this.name    = name;
        this.celular = celular;
        this.credit  = credit;
        this.id      = id;
        this.uipass  = uipass;
    }

    public User(String name,int id){
        this.id          =  id;
        this.name        =  name;
        this.celular     =  0;
        this.credit      =  "0";
        this.uipass      =  "";
    }


}
