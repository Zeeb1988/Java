import    java.util.Scanner;

public  class  Main {

      public  static  void  main(String[]  args)   {
                                   
                   Scanner  in  =  new  Scanner(System.in);
                   String  s  =  in.next();
                             
                       do{
                        System.out.print( s.length()+" " ); 
                        s  =   in.next();  
                           }while( s.indexOf('.')<0 );

             System.out.print( (s.length()-1) );
        
        }

 
}