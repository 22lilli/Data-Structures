
public class BinarySearch {

	public static void main(String[] args) {
		int [] list = {1,2,3,4,5,6,7,8,9,11};
		int highest = list.length;
		int lowest = 0;
		int key = 11;
		  int result = binary(highest, lowest, list, key);
		if(result==-1) {
			System.out.println("number was found");
		}
		else {
			System.out.println("number was not found");
		}
	}
	public static int binary(int highest,int lowest,int [] list,int key) {
		while(lowest<=highest) {
		int mid = (highest+lowest)/2;
			if(list[mid]>key) {
				return(binary(mid-1,lowest,list,key));
			}
			if(list[mid]<key) {
				return(binary(highest,mid+1,list,key));
			}
			if(list[mid]==key) {
				return(-1);
			}
		}
			return(1);
		
	}
}


