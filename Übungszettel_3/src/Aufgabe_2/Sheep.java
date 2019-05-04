package Aufgabe_2;

public class Sheep {
	public String name;
	public Fur fur;
	
	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}
	
	public void shear() {
		fur.length = 0;
	}
	
	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}
	
	public Sheep clone() {
		return this;
	}
	
	public Sheep deepCopy() {
		Sheep clone = new Sheep(this.name, new Fur(this.fur.length));
		return clone;
	}
	
	public boolean equals(Object o) {
		
		if(o instanceof Sheep)
			if(((Sheep) o).name == this.name && ((Sheep) o).fur.length == this.fur.length) return true;
		return false;
	}
}