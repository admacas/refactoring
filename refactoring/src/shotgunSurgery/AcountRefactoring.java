/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunSurgery;

/**
 *
 * @author Alex Macas
 */
public class AcountRefactoring {
        private String type;
       private String accountNumber;
       private int amount;
      
      
      
       public AcountRefactoring(String type,String accountNumber,int amount)
       {
              this.amount=amount;
              this.type=type;
              this.accountNumber=accountNumber;
       }
      
       private boolean isAccountUnderflow()
       {
              if(amount <= 500)
              {
                     return true;
              }
              return false;
             
       }
      
      
       public void debit(int debit) throws Exception
       {
              if(isAccountUnderflow())
              {
                     throw new Exception("Mininum balance shuold be over 500");
              }
             
              amount = amount-debit;
              System.out.println("Now amount is" + amount);
             
       }
      
       public void transfer(AcountRefactoring from,AcountRefactoring to,int cerditAmount) throws Exception
       {
              if(isAccountUnderflow())
              {
                     throw new Exception("Mininum balance shuold be over 500");
              }
             
              to.amount = amount+cerditAmount;
             
       }
      
       public void sendWarningMessage()
       {
              if(isAccountUnderflow())
              {
                     System.out.println("amount should be over 500");
              }
       }
}
