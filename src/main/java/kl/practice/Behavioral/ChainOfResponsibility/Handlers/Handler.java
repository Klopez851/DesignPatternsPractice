package kl.practice.Behavioral.ChainOfResponsibility.Handlers;

import kl.practice.Behavioral.ChainOfResponsibility.SupportRequest;

public interface Handler {
    void handle(SupportRequest request);
}
