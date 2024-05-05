// You are using Java


public class Sumofoddindex{
    public static void main(String args[]){
        int a[]={1,2,3,4,7,4,7,8};
        
        int sum=0,maxsum=0;
        for(int i=1;i<a.length;i+=2){
            sum+=i;
        }
        System.out.println(sum);
        
    }
}