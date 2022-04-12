import    java.util.Scanner;

public  class  Main { 
    public  static  void  main(  String[]  args  ) {
                                Scanner in = new Scanner(  System.in  );

		Fraction a = new Fraction(  in.nextInt(),  in.nextInt()  );

		Fraction b = new Fraction(  in.nextInt(),  in.nextInt()  );

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();       
    }
}
class  Fraction {
          int   numerator;
          int   denominator;
          Fraction( int x,  int y ) {
          numerator = x;
          denominator = y;
     }
          double  toDouble() {
          
          return   (double)numerator/denominator;
     }
          Fraction  plus(Fraction  r) {
          Fraction  sum  =  new  Fraction(0,0);
          sum.numerator  =  numerator*r.denominator+denominator*r.numerator;
          sum.denominator  =  denominator*r.denominator;
          return  sum;
    }
          Fraction  multiply(Fraction r) {
          Fraction  product  =  new  Fraction(0,0);
          product.numerator  =  numerator*r.numerator;
          product.denominator  =  denominator*r.denominator;  
          return  product; 
    }   
          void  print() {
         if( numerator == denominator ) {
              System.out.println("1");
       }else{
              int   min;
              min = numerator;
         if( numerator > denominator ) {
              min = denominator;
     }      
            for(int i =1; i <= min; i++) {
                    if( numerator % i == 0 && denominator % i == 0 ) {
                           numerator = numerator / i;
                           denominator = denominator / i; 
                    
   }                 
      
          }
            System.out.println( numerator+"/"+denominator );
         }
          
    }
    
}