package kl.practice.Structural.Proxy;

public class RealImageProxy implements Image {
    private Image image = new RealImage();
    private String username;
    private boolean authorized;
    private int call = 0;

    public RealImageProxy(String username){
        validateUser(username);
    }

    @Override
    public void display(String imageToLoad) {
        if(authorized) {
            if (call == 0) {
                call++;
                image.display(imageToLoad);
            } else {
                System.out.println("image loading already in progress");
            }
        }else {
            System.out.println("User not authorized");
        }
    }

    private void validateUser(String username){
        if(username.equals("validUser")){
            authorized = true;
        }else {
            authorized = false;
        }
    }
}
