package Main.Service;

import Main.Model.*;
import java.util.*;

public class BusService {
    static List<BusModel> buses =new ArrayList<>();
    public static float get_price_by_routes(String route){
        for(BusModel bus:buses){
            if (bus.getSource().equalsIgnoreCase(route) || bus.getDestination().equalsIgnoreCase(route)){
                return bus.getBus_pass_price();
            }
        }
        return 0;
    }
    public static void create_default_busses(){
        buses.add(new BusModel("B1","Saveetha","Airport",100,49));
        buses.add(new BusModel("B2","Saveetha","Tambaram",120,66));
        buses.add(new BusModel("B3","Saveetha","Airport",110,49));


    }
}
