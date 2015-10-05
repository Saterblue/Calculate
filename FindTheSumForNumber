/*Find a number of consecutive integers and require the shortest,such as 4:4=1-2+3+4,it's the shortest of the consecutive.
*/
class Test {
public static void main(String[] args) {
        int num;
        findNumber(num);
    /*Method to find the optimal solution of the idea is: 1-N integer X and is greater than the number,
    and use brute force to calculate the minimum integer X
    If X-Number is an even number, then the X is the smallest integer (1+2+3+..+M+, +N, +N, and 1+2+3+... -M+...
    Because M is an integer, so 2M is an even number.
    */
    static void findNumber(int num){
         //This method is only used for more than 2 of the integer
        for(int i=2;;i++){
               //Set the number of variables for the integer and the difference with the number of inputs to us
                int temp=intSum(i)-num;
               //ntegers are equal to the value of the input, so the integer can be directly output
                if(temp==0){
                 System.out.println("整数1到"+i+"的和");
                          break;
                }
               else
                       /*TEMP>0It is the number of integers and more than we have to be judged
                       (because the number of negative even divided by 2 is 0, so it must be added.
                       */
                if(temp>0&&temp%2==0){
                      System.out.println("整数1到"+i+"的和,其中"+temp/2+"的符号为负");
                      break;
               }
         }
     }
  //the method of 1-N sum 
  static int intSum(int n){
      int sum=0;
      for(int i=1;i<=n;i++){
           sum+=i;
      }
    return sum;
  }
