package Main.Service;
import Main.Model.*;
import java.util.*;

public class UserService {
    public static List<UserModel> users=new ArrayList<>();
    static BusService bs=new BusService();

    public static void create_default_users(){
        users.add(new UserModel("U1","ts",19,"ts@gmail.com"));  
        users.add(new UserModel("U2","harry",40,"harry@gmail.com"));  
        users.add(new UserModel("U3","krithiga",62,"krithiga@gmail.com"));
        users.add(new UserModel("U4","sadhana",30,"sadhana@gmail.com"));  
    }
    
    public static void get_bus_by_route(String route){
        int flag=0;
        for(BusModel bus:bs.buses){
            if(bus.getSource().equalsIgnoreCase(route) || bus.getDestination().equalsIgnoreCase(route)){
                bus.getdetails();
                flag=1;
            }
        }
        if (flag==0)System.out.println("Bus with that route not found");
    }

    public static boolean validate_pass(UserModel user,String pass_type){
        if(user.getUser_age()<=25 && pass_type.equalsIgnoreCase("student")){
            return true;
        }
        if(user.getUser_age()>=60 && pass_type.equalsIgnoreCase("senior")){
            return true;
        }
        if(user.getUser_age()>25 &&user.getUser_age()<60&&pass_type=="Monthly"){
            return true;
        }
        return false;
    }


}
