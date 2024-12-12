/*
   * Author:Sathvi Reddy
   * Date:12/2
   * Collaborator(s):Catherine Chiu
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ENTER MESSAGE: ");
		String x=sc.nextLine();
		
		boolean v;
		boolean c1;
		boolean c2;
		int space=0;
		String wrd;
		String l1;
		String l2;
		
		while(true){
			
			space=x.indexOf(" ");
			
			if(space==-1){
				
				l1=(x.substring(0,1));
				l2=(x.substring(1,2));
				if(l1.equals("a")||l1.equals("e")||l1.equals("i")||l1.equals("o")||l1.equals("u")){
					wrd=(x.substring(0)+"-way");
				}
			
				else{
					if(l2.equals("a")||l2.equals("e")||l2.equals("i")||l2.equals("o")||l2.equals("u")){
						wrd=(x.substring(1)+"-"+l1+"ay");
					}
					else{
						wrd=(x.substring(2)+"-"+l1+l2+"ay");
					}
				}
				if(wrd.contains("!")||wrd.contains(".")||wrd.contains("?")){
					int cha=wrd.indexOf("!");
					if(cha<0){
						cha=wrd.indexOf("?");
					}
					if(cha<0){
						cha=wrd.indexOf(".");
					}
					wrd=(wrd.substring(0,cha)+wrd.substring(cha+1)+wrd.substring(cha,cha+1));
				}				
				System.out.println(wrd);
				break;
			}
			
			wrd=(x.substring(0,space));
			
			l1=(x.substring(0,1));
			l2=(x.substring(1,2));
			
			if(l1.equals("a")||l1.equals("e")||l1.equals("i")||l1.equals("o")||l1.equals("u")){
				wrd=(x.substring(0,space)+"-way");
			}
			
			else{
				if(l2.equals("a")||l2.equals("e")||l2.equals("i")||l2.equals("o")||l2.equals("u")){
					wrd=(x.substring(1,space)+"-"+l1+"ay");
				}
				else{
					if(wrd.length()>2){
						wrd=(x.substring(2,space)+"-"+l1+l2+"ay");
					}
					else{
						wrd=(l1+l2+"-ay");
					}
				}
			}	
			

			System.out.print(wrd+" ");
			x=x.substring(space+1);
		}
		
	}
}
