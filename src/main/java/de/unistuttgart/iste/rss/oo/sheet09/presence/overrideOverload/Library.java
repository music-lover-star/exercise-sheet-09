package de.unistuttgart.iste.rss.oo.sheet09.presence.overrideOverload;

public class Library extends Building {

    private static final String LIBRARY_LITERAL_NLS = "Library";

    public Library(final String name) {
        super(name);
    }

    @Override
    protected String getBuildingType() {
        return LIBRARY_LITERAL_NLS;
    }

}
