import java.util.Scanner;
 public class GradeSystem{
  public static void main(String[] args){
  
  Scanner sc =new Scanner(System.in);
  double physics=sc.nextDouble();
  double chemistry=sc.nextDouble();
  double maths=sc.nextDouble();
  
  double precentage=(physics+chemistry+maths)/300*100;
  if(precentage>=80){
	  System.out.println("Marks : " + precentage);
	  System.out.println("Grades : A" );
	  System.out.println("Remarks : Level 4, above ageny-normalized standards" );
  }
  else if(precentage>=70 && precentage<=79){
	  System.out.println("Marks : " + precentage);
	  System.out.println("Grades : B" );
	  System.out.println("Remarks : Level 3, at ageny-normalized standards" );
  }
  else if(precentage>=60 && precentage<=69){
	  System.out.println("Marks : " + precentage);
	  System.out.println("Grades : C" );
	  System.out.println("Remarks : Level 2,below,but apporaching ageny-normalized standards" );
  }
  else if(precentage>=50 && precentage<=59){
	  System.out.println("Marks : " + precentage);
	  System.out.println("Grades : D" );
	  System.out.println("Remarks : Level 2, well below ageny-normalized standards" );
  }
  else if(precentage>=40 && precentage<=49){
	  System.out.println("Marks : " + precentage);
	  System.out.println("Grades : E" );
	  System.out.println("Remarks : Level 1, too below ageny-normalized standards" );
  }
  else{
	  System.out.println("Marks : " + precentage);
	  System.out.println("Grades : R" );
	  System.out.println("Remarks : Remedial standards" );
  }
 }
 }