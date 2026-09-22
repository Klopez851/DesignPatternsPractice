package kl.practice.Behavioral.ChainOfResponsibility.Handlers;

import kl.practice.Behavioral.ChainOfResponsibility.Priority;
import kl.practice.Behavioral.ChainOfResponsibility.SupportRequest;

public class Level1Support implements Handler {
    private final Handler nextHandler = new Level2Support();

    public Level1Support(){}

    @Override
    public void handle(SupportRequest request) {
        if(request.getPriority() == Priority.LOW){
            System.out.println("Request handled at level 1");
            return;
        }
        System.out.println("skipping level 1 support");
        nextHandler.handle(request);
    }

}
