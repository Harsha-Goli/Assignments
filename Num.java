import java.util.*;

class Num {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();


        int[]number=new int[10];
        Scanner read = new Scanner (System.in);

        for(int i=0;i<number.length;i++){
            number[i]=read.nextInt(); 
		}
        for(int i=0;i<number.length;i++){
            
                num.add(number[i]); 
                
            }
			System.out.println(num);
        }   
}