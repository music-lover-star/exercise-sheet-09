package de.unistuttgart.iste.sqa.pse.sheet09.presence.overrideOverload;

/**
 * A class to test overloading.
 */
public class OverloadedUsageApp {

	public static void main(final String[] args) {
		// Create an object libraryOfAlexandria of type Library and an object stuttgartOperaHouse of type Opera
		Library libraryOfAlexandria = new Library("libraryOfAlexandria");
		Opera stuttgartOperaHouse = new Opera("stuttgartOperaHouse");

		// Call this class' static print building info and pass libraryOfAlexandria and
		// stuttgartOperaHouse
		printBuildingInfo(libraryOfAlexandria);
		printBuildingInfo(stuttgartOperaHouse);

		// Create entities building1 and building2 of type Building
		// let them reference libraryOfAlexandria and stuttgartOperaHouse
		Building building1 = libraryOfAlexandria;
		Building building2 = stuttgartOperaHouse;

		// Call this class' static print building info and pass each of the building
		// entities
		printBuildingInfo(building1);
		printBuildingInfo(building2);
	}

	private static void printBuildingInfo(final Building building) {
		System.out.format("Printing Information for a BUILDING:\n");
		building.printBuildingInfo();
	}

	private static void printBuildingInfo(final Library aLibrary) {
		System.out.format("Printing Information for a LIBRARY:\n");	
		aLibrary.printBuildingInfo();
	}

	private static void printBuildingInfo(final Opera aOpera) {
		System.out.format("Printing Information for an OPERA:\n");	
		aOpera.printBuildingInfo();
	}
}
