/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark
 */
public interface ProgrammingCourse {
    public String getCourseNumber();
    public String getCourseName();
    public abstract double getCredits();
    public void setCourseName(String courseName);
    public void setCourseNumber(String courseNumber);
    public abstract void setCredits(double credits); 
}
