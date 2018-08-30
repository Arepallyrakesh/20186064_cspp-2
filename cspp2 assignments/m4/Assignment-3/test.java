import java.util.Scanner;
class BinaryToDecimal {
    public static void main(String args[]){
       Scanner input = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       String binaryString =input.nextLine();
       System.out.println("Output: "+Integer.parseInt(binaryString,2));
    }
}
/*public static int integerfrmbinary(String str){
    double j=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)== '1'){
         j=j+ Math.pow(2,str.length()-1-i);
     }

    }
    return (int) j;
}*/