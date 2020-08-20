/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author Enubs
 */
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CurrentStudent stu1 = new CurrentStudent();
        double[] grades = {90, 87, 88, 93};
        System.out.println(stu1.averageGrade(grades));
        
    }
    
}
