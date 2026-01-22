import java.util.Scanner;

public class Lect1{
	
	public static void main(String[] args){
		int i=0;
		System.out.println("val :"+ i);
		i++;
		System.out.println("vala : " +i++);
		System.out.println("valb : "+i);
		++i;
		System.out.println("valc : " + i++);
        System.out.println("vald : " + i);
		int z=i- i++ - --i +i -  ++i + i++;
		System.out.println(z);
		System.out.println("val :" +i);
		
		for(int j=0;j<10;j++){
			System.out.println("j : "+j);
		}
		
		int k=10;
		while(k>0){
			System.out.println("k :"+k);
			k--;
		}
		int l=10;
		do{
			System.out.println("l :"+l);
			l--;
		}
		while(l>0);
		
		Scanner sc=new Scanner(System.in);
		int x=Sc.next.Int();
			
		
	}
}
