package kl.practice.Behavioral.Mediator;

import lombok.Getter;

@Getter
public class User {
    private String name;
    private ChatRoom chatroom;
    private boolean status = true;

    public User(String name, ChatRoom chatroom){
        this.name = name;
        this.chatroom=chatroom;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public void sendMessage(String message){
        chatroom.sendMessage(this, message);
    }
    public void sendPrivateMethod(String receiver, String message){
        chatroom.sendPrivateMethod(this, receiver,message);
    }

    public void recieveMessage(User sender, String message){
        System.out.println("displaying "+sender.getName()+": "+message+" on "+this.name+"'s phone");
    }
}
