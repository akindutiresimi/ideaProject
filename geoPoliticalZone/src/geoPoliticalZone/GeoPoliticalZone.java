package geoPoliticalZone;

public enum GeoPoliticalZone {
    LAGOS("SOUTH WEST"),
    EKITI("SOUTH WEST"),
    OSUN("SOUTH WEST"),
    ONDO("SOUTH WEST"),
    OGUN("SOUTH WEST"),
    OYO("SOUTH WEST"),

    BENUE("NORTH CENTRAL"),
    FCT("NORTH CENTRAL"),
    KOGI("NORTH CENTRAL"),
    NASARAWA("NORTH CENTRAL"),
    PLATEAU("NORTH CENTRAL"),
    KWARA("NORTH CENTRAL"),
    NIGER("NORTH CENTRAL"),

    ADAMAWA("NORTH EAST"),
    BAUCHI("NORTH EAST"),
    BORNO("NORTH EAST"),
    GOMBE("NORTH EAST"),
    TARABA("NORTH EAST"),
    YOBE("NORTH EAST"),

    KADUNA("NORTH WEST"),
    KATSINA("NORTH WEST"),
    KANO("NORTH WEST"),
    KEBBI("NORTH WEST"),
    SOKOTO("NORTH WEST"),
    JIGAWA("NORTH WEST"),
    ZAMFARA("NORTH WEST"),

    ABIA("SOUTH EAST"),
    ANAMBRA("SOUTH EAST"),
    EBONYI("SOUTH EAST"),
    ENUGU("SOUTH EAST"),
    IMO("SOUTH EAST"),

    AKWA_IBOM("SOUTH SOUTH"),
    BAYELSA("SOUTH SOUTH"),
    CROSS_RIVER("SOUTH SOUTH"),
    DELTA("SOUTH SOUTH"),
    EDO("SOUTH SOUTH"),
    RIVERS("SOUTH SOUTH");

    private final String zone;

    GeoPoliticalZone(String zone) {
//        if(getZone() != zone) {
//            throw new IllegalArgumentException("not a state in the geopoliticalzone");
//        }
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }
}
