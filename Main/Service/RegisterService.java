package Main.Service;

import Main.Model.UserModel;

public class RegisterService {
    private UserModel current_user;

    public RegisterService(String user_name,int age){
        login(user_name,age);
    }
    public UserModel get_current_user(){
        return current_user;
    }
    public void login(String user_name,int age){
        for(UserModel user:UserService.users){
            if(user.getUser_name().equalsIgnoreCase(user_name) && user.getUser_age()==age){
                current_user=user;
                return;
            }
        }
        System.out.println("No user found with the said credentials");
    }
}
