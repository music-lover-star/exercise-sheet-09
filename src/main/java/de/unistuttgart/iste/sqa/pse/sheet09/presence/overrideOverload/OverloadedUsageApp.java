package de.unistuttgart.iste.sqa.pse.sheet09.presence.overrideOverload;

/**
 * A class to test overloading.
 */
public class OverloadedUsageApp {

	public static void main(final String[] args) {
		// Create an entity libraryOfAlexandria and stuttgartOperaHouse of type Library
		// and Opera
		// Let them reference a new library and opera respectively

		// Call this class' static print building info and pass libraryOfAlexandria and
		// stuttgartOperaHouse

		// Create entities building1 and building2 of type Building
		// let them reference libraryOfAlexandria and stuttgartOperaHouse
		
        	// Call this class' static print building info and pass each of the building
		// entities
	}

	private static void printBuildingInfo(final Building building) {
		System.out.format("My type is Building\n");
		System.out.format("My name is %s\n", building.getBuildingName());
	}

	private static void printBuildingInfo(final Library aLibrary) {
		System.out.format("My type is Library\n");
		System.out.format("My name is %s\n", aLibrary.getBuildingName());
	}

	private static void printBuildingInfo(final Opera aOpera) {
		System.out.format("My type is Opera\n");
		System.out.format("My name is %s\n", aOpera.getBuildingName());
	}
}
