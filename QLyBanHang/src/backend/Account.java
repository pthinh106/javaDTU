/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String UserString;
    private String PassWordString;

    public Account(String User,String Pass) {
        this.UserString = User;
        this.PassWordString = Pass;
    }
    
    public void setUser(String User){
        this.UserString = User;
    }
     public void setpass(String pass){
        this.PassWordString = pass;
    }
    public String getUser(){
        return this.UserString;
    }
    public String getPass(){
        return this.PassWordString;
    }
}
