public class HW10 {
    public static void section1(){
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.brand = "Tesla";
        myElectricCar.model = "Model X";
        myElectricCar.year = 2025;

        try{
            myElectricCar.checkBattery(35);
            myElectricCar.startEngine();
            myElectricCar.stopEngine();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void section2(){
        CarData myCarData = new CarData("BMW", "X3", 2015);
        CarService myCarService = new CarService();

        myCarService.printCarData(myCarData);

        FunctionalCar myFunctionalCar = new FunctionalCar();
        myFunctionalCar.brand = "Lada";
        myFunctionalCar.model = "Kalina";
        myFunctionalCar.year = 2014;

        myFunctionalCar.startAndPrintInfo();
    }
}

class Car2{
    String brand;
    String model;
    int year;

    public void startEngine() throws NullObjectException {
        if(brand == null){
            throw new NullObjectException("Автомобиль не найден");
        }
        System.out.println("Двигатель запущен");
    }

    public void stopEngine() throws NullObjectException {
        if(brand == null){
            throw new NullObjectException("Автомобиль не найден");
        }
        System.out.println("Двигатель остановлен");
    }
}

class ElectricCar extends Car2{
    @Override
    public void startEngine() throws NullObjectException{
        if(brand == null){
            throw new NullObjectException("Автомобиль не найден");
        }
        System.out.println("Электродвигатель запущен");
    }

    @Override
    public void stopEngine() throws NullObjectException{
        if(brand == null){
            throw new NullObjectException("Автомобиль не найден");
        }
        System.out.println("Электродвигатель остановлен");
    }

    public void checkBattery(int levelBattery) throws NullObjectException{
        if(brand == null){
            throw new NullObjectException("Автомобиль не найден");
        }
        if(levelBattery <= 20){
            System.out.println("Батарея разряжена, требуется зарядка");
        }
    }
}

class NullObjectException extends Exception{
    public NullObjectException(String message){
        super(message);
    }
}

class CarData{
    private String brand;
    private String model;
    private int year;

    public CarData (String brand1, String model1, int year1){
        this.brand = brand1;
        this.model = model1;
        this.year = year1;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
}

class CarService{
    public void printCarData(CarData myCarData){
        System.out.println("Бренд: " + myCarData.getBrand());
        System.out.println("Модель: " + myCarData.getModel());
        System.out.println("Год: " + myCarData.getYear());
    }
}

class FunctionalCar{
    String brand;
    String model;
    int year;

    public void startAndPrintInfo(){
        System.out.println("двигатель запущен");
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год: " + year);
    }
}

