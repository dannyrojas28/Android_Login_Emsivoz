package com.emsitel.emsivoz;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Emsitel on 22/03/2016.
 */
public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME,0);
    }

    public void storeUserData(User user){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("name", user.credit);
        spEditor.putString("name", user.uipass);
        spEditor.putInt("name", user.id);
        spEditor.putInt("name", user.celular);
        spEditor.commit();
    }

    public User getLoggedInUser(){
        String name     = userLocalDatabase.getString("name", "");
        String uipass   = userLocalDatabase.getString("uipass","");
        String credit   = userLocalDatabase.getString("credit","");
        int     id      = userLocalDatabase.getInt("id", 0);
        int celular     = userLocalDatabase.getInt("celular", 0);

        User storedUser = new User(name ,credit, id ,celular ,uipass);
        return  storedUser;
    }

    public  void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }

    public void clearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
    }



}
