
package kl.practice.Structural.Flyweight.TreeTypes;

public final class Redwood implements TreeType{

    private final String NAME;
    private final String TEXTURE;
    private final String MODEL;

    public Redwood(){
        this.NAME = "Red";
        this.MODEL = "Redwood";
        this.TEXTURE = "RedwoodTreeTexture.jpg";
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
