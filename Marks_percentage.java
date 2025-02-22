public class Marks_percentage{
	
	public static int perc(int hindi, int English, int math , int physics){
	  int total=hindi+English+math+physics;
	  return total/5;
	}
	
	public static void main(String [] args){
      int hindi = 65;
	  int English = 75;
	  int math = 50;
	  int physics = 90;
        System.out.println("precentage of this Student "+ perc(hindi,English,math,physics) +" % ");
	}
}
