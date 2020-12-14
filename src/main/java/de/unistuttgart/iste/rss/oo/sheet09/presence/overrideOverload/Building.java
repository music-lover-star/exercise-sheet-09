package de.unistuttgart.iste.rss.oo.sheet09.presence.overrideOverload;

public abstract class Building {

    private final String name;
    
    public Building(final String name) {
        this.name = name;
    }
    
    public void printBuildingInfo() {
        System.out.format("My type is %s\n", getBuildingType());
        System.out.format("My name is %s\n", name);
    }

    protected abstract String getBuildingType();

    public String getBuildingName() {
        return name;
    }

}

