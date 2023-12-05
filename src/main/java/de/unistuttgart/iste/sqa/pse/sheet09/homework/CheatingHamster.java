package de.unistuttgart.iste.sqa.pse.sheet09.homework;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.model.Territory;

/**
 * An especially eager Hamster.
 */
public class CheatingHamster extends Hamster {

	public CheatingHamster(final Territory territory, final Location location, final Direction direction,
			final int newGrainCount) {
		super(territory, location, direction, newGrainCount);
	}

	@Override
	public void move() {
		super.move();
		super.move();
	}

}
