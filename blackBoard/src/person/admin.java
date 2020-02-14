/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.*;
import java.io.*;

/**
 *
 * @author Jose Silva
 */
public class admin implements Serializable {

    private String firstName;
    private String lastName;
    private String userName;
    private int ID;
    private int password;

    public admin() { //Admin contructor to initialize object.
        firstName = "admin";
        lastName = "admin";
        userName = "admin";
        ID = 1;
        password = 1234;
    }

    public void addStudents() { // Method to add students only for Admin
        users students = new users();
        boolean flag = true;
        String flag2 = "y";
        int i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert Student's first name: ");
        students.setFirstName(this.firstName = input.next());
        System.out.print("Please insert Student's last name: ");
        students.setLastName(this.lastName = input.next());
        System.out.print("Please insert Student password: ");
        students.setPassword(this.password = input.nextInt());
        i=this.ID+1;
        i++;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
