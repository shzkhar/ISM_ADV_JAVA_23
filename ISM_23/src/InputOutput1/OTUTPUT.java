package InputOutput1;

import java.io.FileOutputStream;

public class OTUTPUT {

	 public static void main(String args[]){    
         try{    
           FileOutputStream fout=new FileOutputStream("C:\\SQL\\ISM_2023\\testout.txt");    
           String s = "Shekhar Mahajan";
          for(int i=0;i<s.length();i++)
          {
        	 
        	  byte b = (byte) s.charAt(i);
        	  fout.write(b);    
             
          }
          fout.close();  
           System.out.println("success...");    
          }
         catch(Exception e){System.out.println(e);}    
    } 
}
