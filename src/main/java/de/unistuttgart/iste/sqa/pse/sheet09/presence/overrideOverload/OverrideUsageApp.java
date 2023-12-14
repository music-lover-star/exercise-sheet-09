package de.unistuttgart.iste.sqa.pse.sheet09.presence.overrideOverload;

/**
 * A class to test overriding.
 */
public class OverrideUsageApp {

	public static void main(final String[] args) {
		// Create an object stuttgartOperaHouse of type Opera
		// Create an object libraryOfAlexandria of type Library
		Library libraryOfAlexandria = new Library("libraryOfAlexandria");
		Opera stuttgartOperaHouse = new Opera("stuttgartOperaHouse");

		// Call print building info on both of these entities
		libraryOfAlexandria.printBuildingInfo();
		stuttgartOperaHouse.printBuildingInfo();

		// Create entities building1 and building2 of type Building
		// let them reference libraryOfAlexandria and stuttgartOperaHouse
		Building building1 = libraryOfAlexandria;
		Building building2 = stuttgartOperaHouse;

		// Call print building info on both of these entities
		building1.printBuildingInfo();
		building2.printBuildingInfo();
	}
}
