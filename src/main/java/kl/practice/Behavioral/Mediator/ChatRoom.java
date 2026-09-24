package kl.practice.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> registeredUsers = new ArrayList<User>();

    public ChatRoom(){}

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public void sendMessage(User sender, String message){
        for(User user : registeredUsers){
            if(user.isStatus()) {
                user.recieveMessage(sender, message);
            }
        }
    }
    public void sendPrivateMethod(User sender, String reciever, String message){
        for(User user : registeredUsers){
            if(user.getName().equals(reciever)){
                if(user.isStatus()) {
                    user.recieveMessage(sender, message);
                }else{
                    System.out.println(user.getName()+ " is offline");
                }
            }
        }
    }

}
