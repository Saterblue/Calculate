public class FollowNumberInSqual {
//Just a test
		public static void main(String[] args) {
			int[][] arr=getN(6);
			show(arr);
		}
		//for show the test
		public static void show(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+"\t ");
				}
				System.out.println();
			}
		}
		//A menthod getInput Squal length
		public static int[][] getN(int n) {
			int a=0;
			int i=1;
			int b=n-1;
			int[][] arr=new int[n][n];
			foo(arr,a,b,i,n);
			return arr;
		}
		public static void foo(int[][] arr,int a,int b,int i,int n) {
			/**
			@param the square like below
			 [0][0] [0][1].... ..[0][N]
			 [1][0] [1][1]. .. . [1][N]
			 ....  ......        ......
			 .... .....[N-1][N-1]......
			 [N][0]    ......    [N][N]
			When acrros one circle first index form 0 to 1,latest index form N to N-1
			assume everycircle:the fisrt index is a,latest index is b,Every circle a crease 1,and b discrease 1;
			the i mean n*n, the finally num of the list
			*/
			if(i>n*n){
				return;
			}
			//padding numbers into coordintate +X
			for(int x=a;x<=b;x++,i++) {
				arr[a][x]=i;
			}
			//padding numbers into coordintate +Y
			for(int x=a+1;x<=b;x++,i++) {
				arr[x][b]=i;
			}
			//padding numbers into coordintate -X
			for(int x=b-1;x>=a;x--,i++) {
				arr[b][x]=i;
			}
			//padding numbers into coordintate -Y
			for(int x=b-1;x>=a+1;x--,i++) {
				arr[x][a]=i;
			}
			a++;
			b--;
			foo(arr,a,b,i,n);
		}
}
