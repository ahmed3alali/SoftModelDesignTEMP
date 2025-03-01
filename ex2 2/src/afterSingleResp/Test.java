package afterSingleResp;

public class Test {
    public static void main(String[] args) {
        RepairService rs=new RepairService();
        rs.setVehicle(new Vehicle("Togg"));
        rs.setVehicle(new Vehicle("Sedan"));
        rs.setVehicle(new Vehicle("BMW"));
        
            VehicleDatabase vehicleDatabase = new VehicleDatabase();
// with the same way we can test all classes ..... etc

        
        
    }
}
