package Main.Service;

import java.time.LocalDate;
import java.util.*;

import Main.Model.BookingModel;
import Main.Model.UserModel;

public class BookingService {
    private RegisterService rs;
    private List<BookingModel> bookings=new ArrayList<>();
    private static int n=1;
    public void increase_n(){
        n++;
    }
    public BookingService(RegisterService rs){
        this.rs=rs;
    }
    
    public String generate_pass_id(){
        String pass_id="Pass"+String.valueOf(n);
        increase_n();    
        return pass_id;
    }
    public LocalDate calculate_expiry_date(LocalDate issue_date,int months){
        return  issue_date.plusMonths(months);
    }
    public float calculate_price(int months,String route){
        float price_per_month=BusService.get_price_by_routes(route);
        return months*price_per_month;
    }

    public void book(String pass_type,String route){
        UserModel current_user=rs.get_current_user();
        boolean is_valid=UserService.validate_pass(current_user,pass_type);
        LocalDate issue_date=LocalDate.now();
        int months=12;
        if(pass_type.equalsIgnoreCase("Monthly")){
            Scanner sc=new Scanner(System.in);
            System.out.println("Monthly enter no.of.months");
            months=sc.nextInt();
        }
        BookingModel booking=new BookingModel(generate_pass_id(),issue_date, calculate_expiry_date(issue_date,months), rs.get_current_user().getUserId(), route,calculate_price(months,route));
        bookings.add(booking);
        System.out.println("Booked successfully");
        booking.get_details();
    }
}
