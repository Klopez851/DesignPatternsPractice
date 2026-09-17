package kl.practice.Structural.Flyweight.TreeTypes;

public final class Oak implements TreeType{

    private final String NAME;
    private final String TEXTURE;
    private final String MODEL;

    public Oak(){
        this.NAME = "Oaky";
        this.MODEL = "Oak";
        this.TEXTURE = "OakTreeTexture.jpg";
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
        return NAME +", "+ MODEL +", "+ TEXTURE;
    }

}
