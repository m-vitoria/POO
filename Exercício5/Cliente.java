package Exercício5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");

    private String name;
    private String email;
    private Date birthDate;

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Date getBirthDate(){
        return birthDate;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;

    }












}

