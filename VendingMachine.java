import    java.util.Scanner;


   public class VendingMachine {

	        int  balance;
	        int  price = 20;
	        int  total;
	        
	        void  showPrompt() {
	          System.out.println(" Welcom!!! ");
	       }  
	         void  insertMoney(int  amount) {
	            balance = balance +amount;           
	       }
	        void  showBalance()  {
	           System.out.println( "µ±Ç°Óà¶î£º"+balance );
	       }
	       void  getFood()  {
	                if( balance >= price )  {
	               System.out.println(" Here  you  are!! ");
	               balance = balance - price;
	               total = total + price;
	           }
	       }
	     public static void main(String[]  args) {
	              
	               VendingMachine  vm  =  new  VendingMachine();
	               Scanner  in  =  new  Scanner(System.in);
	               vm.showPrompt();
	               vm.showBalance();
	               vm.insertMoney( in.nextInt() );
	               vm.getFood();
	               vm.showBalance();      
	     }   
	}

