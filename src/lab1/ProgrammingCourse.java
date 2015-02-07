/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final String getCourseName() {
        return courseName;
    }

    public abstract double getCredits();
    public final void setCourseName(String courseName){
         testIfEmpty(courseName);
        this.courseName = courseName;
    };
    public final  void setCourseNumber(String courseNumber){
        testIfEmpty(courseNumber);
        this.courseNumber = courseNumber;
    };
    public final void testIfEmpty(String test){
        if(test == null || test.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    }
    public abstract void setCredits(double credits);

}
