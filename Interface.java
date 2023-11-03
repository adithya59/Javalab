public class Interface {
	public static void main(String[] args) {
		Fish d = new Fish("Mimi");
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		System.out.println("CAT");
		c.getname();
		c.walk();
		c.eat();
		System.out.println("SPIDER");
		e.walk();
		e.eat();
		System.out.println("FISH");
		d.getname();
		d.walk();
		d.eat();
	}
}

abstract class Animal {
	protected int legs;
	protected Animal() {
		int legs;
	}
	abstract void eat();
	void walk() {
		System.out.println("This animals walk by "+this.legs+" legs");
	}
}

class Spider extends Animal {
	Spider() {
		this.legs = 8;
	}
	void eat() {
		System.out.println("Spider eat insect");
	}
}

interface Pet {
	public void getname();
	public String setname(String name);
	public void play();
}

class Cat extends Animal implements Pet{
	String catname;
	Cat(String name) {
		this.legs = 4;
		this.catname=setname(name);
	}
	Cat() {
	//	this.Cat("Moose");
	}
	public void getname() {
		System.out.println("This cat's name is "+this.catname);
	}
	public String setname(String name) {
		return name;
	}
	public void play() {
		
	}
	public void eat() {
		System.out.println("Cat eat Fishes");
	}
}
class Fish extends Animal implements Pet{
	String fishname;
	Fish(String name) {
		this.fishname=setname(name);
	}
	Fish() {
	//	this.Fish("Momo");
	}
	void walk() {
		System.out.println("Fish has no legs");
	}
	public void getname() {
		System.out.println("This Fish's name is "+this.fishname);
	}
	public String setname(String name) {
		return name;
	}
	public void play() {
		
	}
	public void eat() {
		System.out.println("Fishes eat Plants");
	}
}