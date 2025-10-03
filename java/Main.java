public class Main {
   public static void main(String[] args) {
    int[] a = new int[] {1,2,3,5,7,9,4,1,0,-228,-10};
    int c = 0;
    for(int i = 0; i < a.length; i++){
       for (int j = 0; j < a.length-1; j++) {
           if (a[j]> a[j+1]) {
            c = a[j];
            a[j] = a[j+1];
            a[j+1] = c;
               
               
           }
           
       } 
    
    }
    for(int i = 0; i<a.length;i++){
        System.out.println(a[i]);
    }
    for(int i = 0; i<args.length;i++){
        System.out.print(args[i]+ "\t");
    }
   }


}
