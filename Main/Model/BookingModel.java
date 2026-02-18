package Main.Model;

import java.time.LocalDate;

public class BookingModel {
    private String pass_id;
    private LocalDate issue_date;
    private LocalDate expiry_date;
    private String pass_type="Monthly";
    private String pass_status="New";
    private String user_id;
    private String route;
    private float total_price;

    public BookingModel(String pass_id,LocalDate issue_date,LocalDate expiry_date,String userid,String route ,float price){
        this.pass_id=pass_id;
        this.issue_date=issue_date;
        this.expiry_date=expiry_date;
        this.user_id=userid;
        this.route=route;
        this.total_price=price;
    }

    public String getPass_id() {
        return pass_id;
    }
    public void setPass_id(String pass_id) {
        this.pass_id = pass_id;
    }
    public LocalDate getIssue_date() {
        return issue_date;
    }
    public void setIssue_date(LocalDate issue_date) {
        this.issue_date = issue_date;
    }
    public LocalDate getExpiry_date() {
        return expiry_date;
    }
    public void setExpiry_date(LocalDate expiry_date) {
        this.expiry_date = expiry_date;
    }
    public String getPass_type() {
        return pass_type;
    }
    public void setPass_type(String pass_type) {
        this.pass_type = pass_type;
    }
    public String getPass_status() {
        return pass_status;
    }
    public void setPass_status(String pass_status) {
        this.pass_status = pass_status;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }
    
}
