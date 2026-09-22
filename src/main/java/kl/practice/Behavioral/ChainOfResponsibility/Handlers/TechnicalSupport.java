package kl.practice.Behavioral.ChainOfResponsibility.Handlers;

import kl.practice.Behavioral.ChainOfResponsibility.SupportRequest;
import kl.practice.Behavioral.ChainOfResponsibility.TechnicalLevel;

public class TechnicalSupport implements Handler{
    private final Handler nextHandler = new Level1Support();
    public TechnicalSupport(){}

    @Override
    public void handle(SupportRequest request) {
        if(request.getTechnicalLevel() == TechnicalLevel.TECHNICAL){
            System.out.println("request handled at technical level");
            return;
        }
        nextHandler.handle(request);
    }
}
