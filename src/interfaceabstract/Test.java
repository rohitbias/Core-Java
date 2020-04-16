package interfaceabstract;


class Bike {
final int speed;
static final int speed1;

Bike()
{
	speed=70;
}
static {
	System.out.println("I am static");
	speed1=90;
}
}
public class Test {
	
	public static void main(String args[])
	{
		Bike b= new Bike();
		System.out.println(b.speed);
		System.out.println(Bike.speed1);
	}

}
