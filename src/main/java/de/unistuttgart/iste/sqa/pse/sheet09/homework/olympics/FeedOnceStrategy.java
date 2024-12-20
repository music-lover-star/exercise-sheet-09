package de.unistuttgart.iste.sqa.pse.sheet09.homework.olympics;

/**
 * TODO write documentation here.
 *
 * @author your name
 */
public final class FeedOnceStrategy implements FeedingStrategy {
	private  boolean hasFed = false;
	@Override
	public boolean shouldFeed(RunnerHamster hamster) {
		if (hamster.isAtFeedZone()) && !hasFed) {
			hasFed = true;
			return true;
		}
		if (!hamster.isAtFeedZone()) {
			hasFed = false;
		}
		return false;
	}
	@Override
	public boolean isFeedingRequired() {
		// put code for task (d) here
		return false;
	}
}
