/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

import java.util.*;
import person.*;

/**
 *
 * @author josej
 */
public class classes {

    private String className;
    private int classCode;
    ArrayList<users> studentList = new ArrayList<>();

    public classes(String className, int classCode) {
        this.className = className;
        this.classCode = classCode;
        
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    public ArrayList<users> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<users> studentList) {
        this.studentList = studentList;
    }

}
