import    java.util.Scanner;

public  class  Main {

      public  static  void  main(String[]  args)   {
                                   
                   Scanner  in  =  new  Scanner(System.in);           // 输入  It's  great  to  see  you  here.
                   String  s  =  in.next();
                             
                       do{
                        System.out.print( s.length()+" " ); 
                        s  =   in.next();  
                           }while( s.indexOf('.')<0 );

             System.out.print( (s.length()-1) );
        
        }

 
}