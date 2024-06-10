import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int d=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str="";
                for(int k=i;k<=j;k++){
                    str=str+s.charAt(k);
                }
                if(d==0){
                    System.out.print(str);
                    d++;
                }
                else{
                    System.out.print(","+str);
                }
            }
        }
    }
}