/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpacalculator;

/**
 *
 * @author Ansary
 */
public class Person {
    
    public int Sub1;
    public int Sub2;
    public int Sub3;
    public int Sub4;
    public int Sub5;
    
    public String Name1;
    
    public int eeeLab;
    public int dldLab;
    public int dsLab;
    public int sdLab;
    
    public int Math(){
        return Sub1;
    }
    
    public int DLD(){
        return Sub2;
    }
    
    public int EEE(){
        return Sub3;
    }
    
    
    public int HUM(){
        return Sub4;
    }
    
    public int DS(){
        return Sub5;
    }
    
    public double cgpa(){
        double n = calculate(Sub1)*3 + calculate(Sub2)*3 + calculate(Sub3)*3 + calculate(Sub4)*3 + calculate(Sub5)*3;
        
        double o = calculate(eeeLab)*1.5 + calculate(dldLab)*1.5 + calculate(dsLab)*1.5;
        
        double p = calculate(sdLab)*.75;
        
        double m = (n+o+p)/20.25;
        
        return m;
    }
    
    
    private double calculate(double n){
		if(n>=80){
			return 4.00;
		}
		else if(n>=75){
			return 3.75;
		}
		else if(n>=70){
			return 3.50;
		}
		else if(n>=65){
			return 3.25;
		}
		else if(n>=60){
			return 3.00;
		}
		else if(n>=55){
			return 2.75;
		}
		else if(n>=50){
			return 2.50;
		}
		else if(n>=45){
			return 2.25;
		}
		else if(n>=40){
			return 2.00;
		}
		else
			return 0;
	}
	
    
}
