Link: https://tests.mettl.com/authenticateKey/9f87004e
Using Java 7

import java.io.*;
import  java.util.*;

//Read only region

class UserMainCode {
public int secondlastDigitOf(int input1){
//Read only region end

//Write code here.........
int n;
		if(input1<0)
		{
			input1=input1* -1;
		}
			
		if(input1<10){
			return -1;
		}
	
		n=input1%100;
		n=n/10;
	
		return n;
	}
	
}
