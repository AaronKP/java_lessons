public enum Continents {
    AFRICA(2_000_000_000),
    ANTARCTICA(1_000_000),
    ASIA(2_000_000_000),
    EUROPE(1_000_000_000),
    NORTH_AMERICA(1_000_000_000),
    AUSTRALIA(1_000_000_000),
    SOUTH_AMERICA(2_000_000_000);

    private int population;

    Continents(int population){
        this.population=population;
    }

    public int getPopulation(){
        return population;
    }
}