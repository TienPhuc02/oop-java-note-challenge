public class Challenge2 {
    private String carName;
    private String carModel;

    private String carCapacity;


    public Challenge2(String carName, String carModel, String carCapacity) {
        this.carName = carName;
        this.carModel = carModel;
        this.carCapacity = carCapacity;
    }

    public void getAllData(){
        System.out.println(this.carName+","+ this.carModel+ "," + this.carCapacity);
    }
}
