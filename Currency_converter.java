public class Currency_converter{

	public static double converter( double dlvalue , double indianrupees ){
	   return indianrupees / dlvalue;
	}

	public static void main(String [] args){
       	   double dlvalue = 86.67;
           double indianrupees = 10;
           double doller = converter( dlvalue, indianrupees );
        System.out.println(doller); 
	}
}