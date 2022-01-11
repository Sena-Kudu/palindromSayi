import java.util.Scanner;  

public class MyClass {
    
        public static Boolean isPalindrom(int ilk_deger){
        
        int deger = 0;
        int palindrom = ilk_deger;
        int kalan = 0;
        
        while(ilk_deger != 0 ){
      
                  kalan = ilk_deger%10;
                  deger = deger*10+kalan;
                  ilk_deger = ilk_deger/10;
              }
              if(palindrom == deger){
                 return true;
              }
              return false;
        }
    
    public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
      int palindrom = scanner.nextInt();
      
      int ilk_sayi = palindrom;
      int deger = 0;
      int kalan = 0;
      int ilk_deger = 0;
    for(int i=0; ; i++){

        ilk_deger = palindrom + i;
        if(isPalindrom(ilk_deger)){
            System.out.print(ilk_deger);
            break;
            
        }
        ilk_deger = palindrom - i;
        if(isPalindrom(ilk_deger)){
            System.out.print(ilk_deger);
            break;
            
        }
            
    
        
    }     
      
      
    }
}