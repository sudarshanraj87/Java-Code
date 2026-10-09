public class While_Loop {

    public static void main(String[] args) {
            //reverseOne();
            //table();
            sumOfNumber();
        
        
    }
    static void reverse(){
        int num =10;
        while (num>=1){
            System.out.println("hello");
            num--;
        }

    }
     
    
    static void reverseOne(){
        int num = 50;
        while(num >= 0){
            System.out.println(num);
            num--;
        }
     }
     

     static void table(){
        int num = 30;
        while(num >= 3){
            System.out.println(num);
            num-=3;
        }
     }

     static void sumOfNumber(){
      int i=1;
      int sum=0;
      while(i<=10){
         sum =sum+i;
         i++;

      }
      System.out.println(sum);
     }
}
