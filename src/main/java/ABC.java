public class ABC {

       public static void main(String[] args) {

              int a[]={2,6,7,4,3,9};

              int ans[]=passByReference(a);

             

              checkArrayIsSameorNot(a,ans);

       }

 

       private static void checkArrayIsSameorNot(int[] a ,int[] ans) {

             

              System.out.println(" Array is same at index: - ");

              for(int i=0;i<a.length;i++){

                     //System.out.print("valu of a " +a[i]);

                     if(a[i]==ans[i]){

                           System.out.print(i);

                     }

              }

             

       }

 

       private static int[] passByReference(int[] abc) {

              for(int i=0;i<abc.length;i++)

                     abc[i]=i;

              return abc;

       }

}