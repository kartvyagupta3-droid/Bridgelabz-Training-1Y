import java.util.Scanner;
 public class BMI_Calculator{
  public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  double weight=sc.nextDouble();
  double heightCM=sc.nextDouble();
  double heightM=heightCM/100;
  
  double bmi=weight/(heightM*heightM);
  
  if(bmi<18.4){
  System.out.println("you are underweight");}
  else if(bmi>=18.5 && bmi<=24.9){
  System.out.println("your weight is normal");}
  else if(bmi>=25.0 && bmi<=39.9){
  System.out.println("you are overweight");}
  else{
  System.out.println("you are obese");}
   } 
  } 