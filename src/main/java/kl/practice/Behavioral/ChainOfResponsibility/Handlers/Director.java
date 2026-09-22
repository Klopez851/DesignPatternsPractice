package kl.practice.Behavioral.ChainOfResponsibility.Handlers;

import kl.practice.Behavioral.ChainOfResponsibility.Priority;
import kl.practice.Behavioral.ChainOfResponsibility.SupportRequest;

public class Director implements Handler{

    public Director(){}

    @Override
    public void handle(SupportRequest request) {
        if (request.getPriority() == Priority.CRITICAL){
            System.out.println("Request handled at director level");
            return;
        }
        System.out.println("skipping director level");
        System.out.println("request could not be handled");
    }
}
