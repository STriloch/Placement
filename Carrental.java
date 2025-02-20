class CarRental{
    int CarId;
    String CarType;
    float Rent;
    
    void getCar(int CarId,String CarType){
        this.CarId = CarId;
        this.CarType = CarType;
    }
    void getRent(){
        if(this.CarType.equals("SmallCar")){
            this.Rent = 1000;
        }
        else if(this.CarType.equals("Van")){
            this.Rent = 800;
        }
        else if(this.CarType.equals("SUV")){
            this.Rent = 2500;
        }
        
    }
    void showCar(){
        System.out.println(this.CarId);
        System.out.println(this.CarType);
        System.out.println(this.Rent);
    }
}
class CarRentalMain{
    public static void main(String args[]){
        CarRental car = new CarRental();
        car.getCar(10,"Van");
        car.getRent();
        car.showCar();
    }
}