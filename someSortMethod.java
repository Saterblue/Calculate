  //the InserSort method
   public static void insertSort(int[] arr) {
	int sign;
	for(int i=1;i<arr.length;i++) {
		//Set temp to mark the current element 
		int temp=arr[i];
		sign=i;
		//if temp is less than the prevois elements,temp's sit give the elements,until temp find the sit 
		while(sign>0&&arr[sign-1]>temp) {
		arr[sign]=arr[sign-1];
			sign--;
		}
		//temp find the sit,and sitdown
		arr[sign]=temp;
	}
   }
