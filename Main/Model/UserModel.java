package Main.Model;

public class UserModel {
    private String userId;
    private String user_name;
    private int user_age;
    private String user_email;

    public UserModel(){   
    }
    public UserModel(String userId,String user_name,int user_age,String user_email){
        this.userId=userId;
        this.user_name=user_name;
        this.user_age=user_age;
        this.user_email=user_email;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public int getUser_age() {
        return user_age;
    }
    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }
    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    
}

