public class Challenge3 {
    private String name;
    private double mark1;
    private double mark2;
    public Challenge3(){
        name=null;
        mark1=0;
        mark2=0;
    }

    public double getMark1() {
        return mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public Challenge3(String name, double mark1, double mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public double getMarks(int markNumber) {
        if (markNumber == 1) {
            return this.mark1;
        }
        else {
            return this.mark2;
        }
    }
    public double calcTotal(double mark1,double mark2){
        return  mark1+mark2;
    }
}
