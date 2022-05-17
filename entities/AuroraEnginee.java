package entities;

public class AuroraEnginee{
    private String month; //Mês
    private String loginName; //Nome de quem está acessando
    private String loginPassword; //Senha correspondente
    private String carModel; //Modelo do carro
    private String carName; //Nome do carro
    private Integer carID; //Id do carro é derivado de outros modelos (cada modelo tem um id especifico)
    private Integer carLicensePlate; //Placa do carro
    private Double carPrice; //Preço do carro

    public AuroraEnginee(int carID, String carModel, String carName, int carLicensePlate, double carPrice){
        this.carID = carID;
        this.carModel = carModel;
        this.carName = carName;
        this.carLicensePlate = carLicensePlate;
        this.carPrice = carPrice;
    }

    public AuroraEnginee(String loginName2, String loginPassword2) {
    }

    public String getCarModel(){
        return carModel;    
    }

    public void setCarModel(String carModel){
        this.carModel = carModel;
    }


    public String getCarName(){
        return carName;
    }

    public void setCarName(String carName){
        this.carName = carName;
    }


    public int getCarID(){
        return carID;
    }

    public int getCarLicensePlate(){
        return carLicensePlate;
    }

    public void percentageCalc(double percentage){
        carPrice += carPrice*(percentage/100);
    }

    public void reducePercentageCalc(double percentage){
        carPrice -= carPrice*(percentage/100);
    }

    @Override
    public String toString(){
        return "  CAR ID : " + carID + "/ CAR MODEL : " + carModel+ "/ CAR NAME : " + carName+ "/ CAR LICENSE PLATE : " + carLicensePlate+ "/ CAR PRICE : " + String.format("R$ %.2f ", carPrice) + "\n\n";
    }
}