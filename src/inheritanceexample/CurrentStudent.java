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
public class CurrentStudent implements ComputeGrade{

    @Override
    public double averageGrade(double[] grades) {
        // averageGrade = (a + b)/2
        double temp = 0;
        for(int i = 0; i < grades.length; i++){
            temp = temp + grades[i];
        }
        double aveGrade = temp / grades.length;
        return aveGrade;
    }
    
}
