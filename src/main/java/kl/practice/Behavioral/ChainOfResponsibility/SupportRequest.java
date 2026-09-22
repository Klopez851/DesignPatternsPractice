package kl.practice.Behavioral.ChainOfResponsibility;

import lombok.Getter;

@Getter
public class SupportRequest {
    private final String requestDescription;
    private final Priority priority;
    private final TechnicalLevel technicalLevel;

    public SupportRequest(String requestDescription, Priority priority, TechnicalLevel technicalLevel){
        this.requestDescription = requestDescription;
        this.priority = priority;
        this.technicalLevel = technicalLevel;
    }
}
