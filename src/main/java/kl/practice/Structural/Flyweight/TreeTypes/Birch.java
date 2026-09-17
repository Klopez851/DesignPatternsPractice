package kl.practice.Structural.Flyweight.TreeTypes;

public final class Birch implements TreeType {

    private final String NAME;
    private final String TEXTURE;
    private final String MODEL;

    public Birch(){
        this.NAME = "Birchy";
        this.MODEL = "Birch";
        this.TEXTURE = "BirchTreeTexture.jpg";
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    @Override
    public String getTEXTURE() {
        return TEXTURE;
    }

    @Override
    public String getMODEL() {
        return MODEL;
    }

    public String toString(){
        return NAME +" "+ MODEL +" "+ TEXTURE;
    }

}
