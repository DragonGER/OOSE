package Aufgabe_3;

public class Person implements Comparable {

	private String Name;
	private String Vorname;
	private int Postleitzahl;
	private String Strasse;
	private int Hausnummer; //wir gehen davon aus das wir keine Hausnummern mit Buchstaben wie 14a betrachten
	
	public Person(String Name, String Vorname, int Postleitzahl, String Strasse, int Hausnummer) {
		this.Name = Name;
		this.Vorname = Vorname;
		this.Postleitzahl = Postleitzahl;
		this.Strasse = Strasse;
		this.Hausnummer = Hausnummer;
	}
	
	public void ToString() {
		System.out.println(String.format("%s %s Wohnhaft in %s,%d %d", this.Vorname, this.Name, this.Strasse, this.Hausnummer, this.Postleitzahl));
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Person) {
			//trival case, both objects referencing same object
			if(((Person)o) == this) {
				System.out.println("Woooah special case both objects are the same");
				return 0;
			}
			//start compare the attributes
			//first check for equality
			if(this.Name.compareTo(((Person)o).Name) == 0 && 
					this.Vorname.compareTo(((Person)o).Vorname) == 0 &&
					this.Postleitzahl == ((Person)o).Postleitzahl &&
					this.Strasse.compareTo(((Person)o).Strasse) == 0 && 
					this.Hausnummer == ((Person)o).Hausnummer) { 
				return 0;
			}
			
			//now check if any element is greater than the one of passed objects elements
			int result = this.Name.compareTo(((Person)o).Name);
			if(result != 0) {
				if(result > 0)
					return 1;
				else
					return -1;
			}
			
			result = this.Vorname.compareTo(((Person)o).Vorname);
			if(result != 0) {
				if(result > 0)
					return 1;
				else
					return -1;
			}
			result = this.Postleitzahl - ((Person)o).Postleitzahl;
			if(result != 0) {
				if(result > 0)
					return 1;
				else
					return -1;
			}
			result = this.Strasse.compareTo(((Person)o).Strasse);
			if(result != 0) {
				if(result > 0)
					return 1;
				else
					return -1;
			}
			result = this.Hausnummer - ((Person)o).Hausnummer;
			if(result != 0) {
				if(result > 0)
					return 1;
				else
					return -1;
			}
		}
		//if object cannot be mapped to a person
		return -1;
	}
}
