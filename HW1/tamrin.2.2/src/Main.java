import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float []grade;
        grade=new float[6];
        int []ratio;
        ratio=new int[6];
        Scanner input=new Scanner(System.in);
        int i,rsum=0;
        float sum=0,average;
        for(i=0;i<6;i++){
            System.out.format("enter grade%d:",i+1);
            grade[i]=input.nextFloat();
            System.out.format("enter ratio%d:",i+1);
            ratio[i]=input.nextInt();
            sum=sum+grade[i];
            rsum=rsum+ratio[i];

        }
        average=sum/rsum;
        System.out.println(average);
        if(average>12){
            System.out.println("adam mashroot");
        }
        else{
            System.out.println(" mashroot");
        }
    }
}
