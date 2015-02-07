/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Mark
 */
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse introToProgramming = new IntroToProgrammingCourse("Intro To Programming","101505");
        //The following do not follow the Likov substitution principle because 
        //they cannot access the setPrerequisites method if declared as Programming Course
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java","101515");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro To Java","101585");
        introToProgramming.setCredits(3.0);
        System.out.println(introToProgramming.getCourseName()+" "+
                introToProgramming.getCourseNumber()+" "+introToProgramming.getCredits());
        
        advJava.setCredits(3.5);
       advJava.setPrerequisites("Intro To Java");
        System.out.println(advJava.getCourseName()+" "+
                advJava.getCourseNumber()+" "+advJava.getCredits()+" "+advJava.getPrerequisites());
        introJava.setCredits(3.5);
       introJava.setPrerequisites("Intro To Programming");
        System.out.println(introJava.getCourseName()+" "+
                introJava.getCourseNumber()+" "+introJava.getCredits()+" "+introJava.getPrerequisites());
        
    }
}
/*
Interfaces are a bit safer to use especially on bigger projects since they clearly 
define what is inherited. In this instance an abstract class may be more useful
since there is a lot of repeated code and the project is small. But as it evolves 
an interface ma be the better choice.
*/