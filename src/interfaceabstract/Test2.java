package interfaceabstract;

class Animal{  
	String color="green";
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{
	String color="green";
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class Test2{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();  
}}  