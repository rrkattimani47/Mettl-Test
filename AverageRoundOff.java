/*Given An integer array as input. Find the average of all the elements. If the final result has decimal points, then round off
to the nearest integer. After decimal, if the immediate digit is between 1-5, ignore the decimal of the number and 
return the integer. If the digit is between 6-9, round it off to next integer.
Prototype int findAverageRoundOff(int[] input1, int input2);
Example1: input[]={8,9,11,14,15}, input2=5
Solution: 8+9+11+14+15=57
57/5=11.4
Result: 11(actual result is 11.4, rounding off to the nearest integer will give us 11)

Example2: input[]={1,2,3,4,5,6,7,8,9,10), input2=10
Solution: Sum is 55
Avg is 55/10=5
Resuslt: 5(No need to round off)

Example 3: Input1[]=(6,9,12,23,34), input2=5
Solution: sum is 84
Avg is 84/5=16.8
Result: 17(actual result is 16.8, rounding off to the nearest integer will give us 17)*/


import java.io.*;
import java.util.*;

//Read only region start
class UserMaincode
{

public int findAverage(int[] input1, int input2){
//Read only region end
//Write code here...
int len=input1.length;
int i=0,sum=0,avg=0,n=0;
doubble avg1=0,sum1=0;

for(i=0;i<len;i++)
{
sum=sum+input1[i];
sum1=sum1+input1[i];
}
avg=sum/input2;
avg1=sum1/input2;
n=avg;
if(avg1-avg>0.5)
{
n=avg+1;
}
return n;
}
}
