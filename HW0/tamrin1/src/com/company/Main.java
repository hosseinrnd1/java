package com.company;

public class Main {

    public static void main(String[] args) {

	int num[]={1,2,3,4,5,6,7,7,9,8};
	int k=7;
    boolean found=false;
    for(int x : num){
    	if(x==k){
    		found=true;
    		break;
		}
	}
    if(found){

		System.out.println("found");

	}
    else {
		System.out.println("not found");
	}
    }

}
