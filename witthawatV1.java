public class witthawatV1{

    public static void main (String[] args) {   

    String intputA = "a5b7c3";                   
       String answerA ="";
             for(int i = 0 ; i < intputA.length() ;i++){
                   char a = intputA.charAt(i);
                 if(Character.isDigit(a)){
                    answerA += a;
                 }
             }

             String intputB = "abc573";                   
             String answerB ="";
                   for(int i = 0 ; i < intputB.length() ;i++){
                         char b = intputB.charAt(i);
                       if(Character.isDigit(b)){
                          answerB += b;
                       }
                   }
                  int j = Integer.parseInt(answerA);
                  int k = Integer.parseInt(answerB);
         System.out.println("output : " +j);      
         System.out.println("output : " +k); 
         System.out.println("output : "+(j+k)); 
            }
         }    