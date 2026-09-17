package kl.practice.Structural.Flyweight.TreeTypes;

public final class Maple implements TreeType{

    private final String NAME;
    private final String TEXTURE;
    private final String MODEL;

    public Maple(){
        this.NAME = "Maplelina";
        this.MODEL = "Maple";
        this.TEXTURE = "MapleTreeTexture.jpg";
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
