
public class Car {
    String brand, model,engine,doors,seats,colour;
    int power,price; 
    
    public void setCarSpecs(String brand,String model,String engine,int power ,int price,String doors,String seats,String colour)
    {
        this.brand=brand;
        this.model=model;
        this.engine=engine;
        this.power=power;
        this.price=price;
        this.doors=doors;
        this.seats=seats;
        this.colour=colour;
    }
    
    @Override
    public String toString ()
    {
        String str;
        str="Brand : "+brand+"\n";
        str=str +"Model : "+model+"\n";
        str=str +"Engine : "+engine+"\n";
        str=str +"Power : "+power+"\n";
        str=str +"Price : "+price+"\n";
        str=str +"Doors : "+doors+"\n";
        str=str +"Seats : "+seats+"\n";
        str=str +"Colour : "+colour+"\n";
        
        return str;
    }
}
