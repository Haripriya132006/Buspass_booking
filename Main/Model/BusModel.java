package Main.Model;

public class BusModel {
    private String bus_id;
    private String source;
    private String destination;
    private float bus_pass_price;
    private int bus_no;
    public BusModel(){

    }
    
    public BusModel(String bus_id,String source,String destination,float bus_pass_price,int bus_no){
        this.bus_id=bus_id;
        this.source=source;
        this.destination=destination;
        this.bus_pass_price=bus_pass_price;
        this.bus_no=bus_no;
    }

    public String getBus_id() {
        return bus_id;
    }
    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public float getBus_pass_price() {
        return bus_pass_price;
    }
    public void setBus_pass_price(float bus_pass_price) {
        this.bus_pass_price = bus_pass_price;
    }

    public int getBus_no() {
        return bus_no;
    }

    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }
    
    public void getdetails(){
        System.out.println("Busno: "+ getBus_no() +" Route: "+getSource()+" - "+getDestination());
    }
}
