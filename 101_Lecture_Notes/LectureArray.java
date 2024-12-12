/* 
Author: Sathvi Reddy
Date: 12/22

    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        int [] arr={5,8,8,2,4,4,4,9};
        
        for(int i=1; i<arr.length; i=i+2){
            System.out.print(arr[i]+" ");
        }
        
        int dupeCheck=(int)(Math.random()*20+1);
        
        
        System.out.println("DUPLICATES:");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==dupeCheck){
                System.out.println("index is "+i);
            }
        }
        
        for(int i=0; i<arr.length-1; i=i+1){
            if(arr[i]==arr[i+1]){
                System.out.println("Consecutive at "+i+" and "+(i+1));
            }
        }
        
        int min=arr[0];
        
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]<min){
                int min=arr[i];
            }
        }
        for(int i=0; i<min.length; i++){
            min[i]=0;
        }
	}
}