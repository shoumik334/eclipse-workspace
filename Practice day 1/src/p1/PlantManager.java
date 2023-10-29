package p1;

class Plant {
	   String name;

	   public Plant(String name) {
	       this.name = name;
	   }
	}

	public class PlantManager {
	   public static void main(String[] args) {
	       Plant[] plants = new Plant[10]; // Create an array of Plant objects (you can change the size as needed)

	       // Test the methods
	       add(plants, new Plant("Rose"));
	       add(plants, new Plant("Lily"));
	       add(plants, new Plant("Tulip"));

	       display(plants);

	       remove(plants, "Lily");

	       display(plants);

	       Plant result = search(plants, "Tulip");
	       if (result != null) {
	           System.out.println("Found: " + result.name);
	       } else {
	           System.out.println("Plant not found.");
	       }
	   }

	   static void add(Plant[] plants, Plant p) {
	       for (int i = 0; i < plants.length; i++) {
	           if (plants[i] == null) {
	               plants[i] = p;
	               break;
	           }
	       }
	   }

	   static void remove(Plant[] plants, String n) {
	       for (int i = 0; i < plants.length; i++) {
	           if (plants[i] != null && plants[i].name.equals(n)) {
	               plants[i] = null;
	               break;
	           }
	       }
	   }

	   static Plant search(Plant[] plants, String m) {
	       for (Plant p : plants) {
	           if (p != null && p.name.equals(m)) {
	               return p;
	           }
	       }
	       return null; // Plant not found
	   }

	   static void display(Plant[] plants) {
	       for (Plant p : plants) {
	           if (p != null) {
	               System.out.println("Plant: " + p.name);
	           }
	       }
	   }
	}


