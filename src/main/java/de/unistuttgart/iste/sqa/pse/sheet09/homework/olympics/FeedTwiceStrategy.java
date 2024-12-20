package de.unistuttgart.iste.sqa.pse.sheet09.homework.olympics;

/**
 * TODO write documentation here.
 *
 * @author your name
 */
public final class FeedTwiceStrategy implements FeedingStrategy {
	 private int feedCount = 0;

	@Override
	public boolean isFeedingRequired() {
        if (hamster.isAtFeedZone() && feedCount < 2) {
            feedCount++;
            return true;
        }
        if (!hamster.isAtFeedZone()) {
            feedCount = 0;
        }
        return false;
    }
}


