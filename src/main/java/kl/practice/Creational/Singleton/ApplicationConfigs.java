package kl.practice.Creational.Singleton;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApplicationConfigs {
    //static makes an attribute have one existence shared by the class, not per object
    //private makes it so that only an instance of this class can access this shared variable
    private static ApplicationConfigs instance;

    private String databaseUrl = "a_db_url";
    private String apiKey = "An_api_key";
    private String environment = "linux";
    private boolean debugMode = false;

    private ApplicationConfigs(){}

    //synchronized makes it so that only one thread accesses this method at a time, guaranting a single instance,
    //another way of making this method thread-save is by using eager initialization
    public static synchronized ApplicationConfigs getInstance(){
        if(instance == null){
            instance = new ApplicationConfigs();
        }
        return instance;
    }

    public String toString(){
        return "database url: "+databaseUrl+" apiKey: "+apiKey+" environment: "+environment+" debug mode: "+debugMode;
    }
}
