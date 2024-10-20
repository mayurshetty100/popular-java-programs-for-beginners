import java.util.Scanner;
class conversion{
    // conversion from decimal to binary
    
        public static void decimalToBinary(int n){
            StringBuilder binary=new StringBuilder();
            while(n!=0){
                binary.insert(0,n & 1);
                n=n>>1;
            }
            System.out.println("The result of converting decimal to binary is "+binary);
        }
        // to convert from binary to decimal
        public static void binaryToDecimal(byte m){
            int decimal=0;
            int i=0;
            int n=1;
            while(m!=0){
                for(int j=0;j<i;j++){
                    n*=2;
                }
                decimal+=n*(m&1);
                m>>=1; //rightshift the byte by one place
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
              System.out.println("Enter 1 to convert from decimal to binary and enter two to convert from binary to decimal");
              int c=sc.nextInt();
              if(c==1){
                System.out.println("Enter the decimal value: ");
                int n=sc.nextInt();
                decimalToBinary(n);
              }else if(c==2){
                byte b=sc.nextByte();
                binaryToDecimal(b);
        }
      }
   }

    

