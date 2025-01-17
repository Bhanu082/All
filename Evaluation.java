public class Evaluation {
   
        public static void main(String args[]){
          char ch;
          for(int i=1; i<=3; i++){
            ch='A';
            for(int j=1; j<=i; j++){
              System.out.print(ch);
              ch++;
            }
            System.out.println();
          }
          char s;
          for(int i=1; i<=3; i++){
            s='X';
            for(int j=3 ; j>=i ; j--){
              System.out.print(s);
              s++;
            }
            System.out.println();
          }
          
        }
      }



