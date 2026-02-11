public class AvgOfArray{
  public static void main(String args[]){
    double nums[]={10.1,11.2,12.3,13.4,14.5,15.6,16.7};
    double result=0;
    int i;
    for(i=0;i<7;i++)
      result=result + nums[i];
    System.out.println("average is " + result/5);
  }
}
