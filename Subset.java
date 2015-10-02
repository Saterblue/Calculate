/*
Set              {a,b,c,d}
Subset's state    0 0 0 1      {d}                  value 1
                  0 0 1 0      {c}                  value 2
                  0 0 1 1      {c,d}                value 3
                  0 1 0 0      {b}                  value 4
                  0 1 0 1      {b,d}                .......
                  0 1 1 0      {b,c}
                  0 1 1 1      {b,c,d}
                  1 0 0 0      {a}
                  1 0 0 1      {a,d}
                  .......       .....
                  1 1 1 1      {a,b,c,d}            value 15
*/
class SetAndSubset {
	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		printSub(arr);
  }

	static void printSub(int[] arr){
	  //Subset's numbers
		int subNumbers=(1<<arr.length)-1;
		for(int i=1;i<=subNumbers;i++){
			int temp=i;
		//loop for print the sub
			for(int n=0;temp>0;n++){
		//check the index of each element's state, true or false 
				if(temp%2==1){System.out.print(arr[n]);}
				temp=temp>>1;
			}
			System.out.println();
		}
	}
}
