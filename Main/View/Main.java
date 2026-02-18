package Main.View;

import Main.Service.BusService;
import Main.Service.RegisterService;
import Main.Service.UserService;
import Main.Service.BookingService;

public class Main {
        public static void main(String[] args){
        UserService.create_default_users();
        BusService.create_default_busses();
        UserService.get_bus_by_route("Tambaram");
        BookingService bs= new BookingService(new RegisterService("harry", 40));
        bs.book("monthly","Tambaram");
    }
}
