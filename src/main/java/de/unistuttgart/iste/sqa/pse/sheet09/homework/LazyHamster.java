package de.unistuttgart.iste.sqa.pse.sheet09.homework;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.model.Hamster;
import de.hamstersimulator.objectsfirst.external.model.Territory;

/**
 * An especially lazy Hamster.
 */
public class LazyHamster extends Hamster {

    public LazyHamster(final Territory territory, final Location location,
                   final Direction direction, final int newGrainCount) {
        super(territory, location, direction, newGrainCount);
    }
    
    @Override
    public void move(){
    	final double probabilityToMove = 0.7;
    	if (Math.random() < probabilityToMove) {
    		this.move();
    	} else {
    		this.write("Too lazy");
    	}
    }
}
