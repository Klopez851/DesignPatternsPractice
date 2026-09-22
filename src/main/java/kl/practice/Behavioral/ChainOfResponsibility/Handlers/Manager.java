package kl.practice.Behavioral.ChainOfResponsibility.Handlers;

import kl.practice.Behavioral.ChainOfResponsibility.Priority;
import kl.practice.Behavioral.ChainOfResponsibility.SupportRequest;

public class Manager implements Handler{
    private final Handler nextHandler = new Director();

    public Manager(){}

    @Override
    public void handle(SupportRequest request) {
        if(request.getPriority() == Priority.HIGH){
            System.out.println("Request handled at manager level");
            return;
        }
        System.out.println("Skipping manager level");
        nextHandler.handle(request);
    }
}
