package kl.practice.Structural.Flyweight.TreeTypes;

public final class Willow implements TreeType{

    private final String NAME;
    private final String TEXTURE;
    private final String MODEL;

    public Willow(){
        this.NAME = "Will";
        this.MODEL = "Willow";
        this.TEXTURE = "WillowTreeTexture.jpg";
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
