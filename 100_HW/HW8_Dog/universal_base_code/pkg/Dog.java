package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	int age;
	String name;
	String breed;
	
	public Dog() {
		name=new String("Clifford");
		age=3;
		breed=new String("big red dog");
	}
	
	public Dog(String n){
		name=n;
		breed=("dog dog");
		age=1;
	}
	public Dog(String b, String n){
		breed=b;
		name=n;
		age=1;
	}
	public Dog(int a, String n){
		age=a;
		name=n;
		breed=("dog dog");
	}
	
	public void setAge(int a){
		age=a;
	}
	public void setName(String n){
		name=n;
	}
	public void setBreed(String b){
		breed=b;
	}
	public String getBreed(){
		return breed;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public boolean isSleeping(){
		int x=(int)(Math.random()*2);
		if(x==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void bark(){
		System.out.println(name+" barks!");
	}

}
