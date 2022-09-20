public class Demoarray{
	
static void min(int a[]){

	int min=a[0];


	for(int i=1;i<a.length;i++)
 
		if(min>a[i])
  
			min=a[i];

System.out.println(" Here is the minimum no. - " + min);

}

public static void main(String args[]){


	int a[]={31,3,4,5,8,1};

	min(a);

}
}
