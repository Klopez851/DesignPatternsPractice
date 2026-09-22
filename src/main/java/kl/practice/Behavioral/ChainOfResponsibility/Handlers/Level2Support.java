package kl.practice.Behavioral.ChainOfResponsibility.Handlers;

import kl.practice.Behavioral.ChainOfResponsibility.Priority;
import kl.practice.Behavioral.ChainOfResponsibility.SupportRequest;

public class Level2Support implements Handler {
    private final Handler nextHandler = new Manager();

    public Level2Support(){}

    @Override
    public void handle(SupportRequest request) {
        if(request.getPriority() == Priority.MEDIUM){
            System.out.println("Request handled at level 2");
            return;
        }
        System.out.println("skipping level 2 support");
        nextHandler.handle(request);
    }
}
