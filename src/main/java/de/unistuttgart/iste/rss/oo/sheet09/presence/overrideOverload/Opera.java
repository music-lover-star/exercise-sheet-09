package de.unistuttgart.iste.rss.oo.sheet09.presence.overrideOverload;

public class Opera extends Building {

    private static final String OPERA_LITERAL_NLS = "Opera";

    public Opera(final String name) {
        super(name);
    }

    @Override
    protected String getBuildingType() {
        return OPERA_LITERAL_NLS;
    }

}
