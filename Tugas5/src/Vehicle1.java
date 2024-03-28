package Tugas5.src;

public class Vehicle1 {

    // no 03 a, hasil outputannya bila pada class Vehicle1 di ubah menjadi public
    // Creating a vehicle with a 10,000 kg maximumload.
    // Add box #1 (500kg) : true
    // Add box #2 (250kg) : true
    // Add load(100kg) : 500.0
    // Add box #3 (5000kg) : true
    // Add box #4 (4000kg) : true
    // Add box #5 (300kg) : true
    // Vehicle load is 9800.0kg


    private double load, maxLoad;
    // B no 04, terjadi erorr karena parameternya sama persis dengan atribut yang bawah
    //protected double Load, maxLoad;
    public Vehicle1 (double max){
        this.maxLoad = max;
    }

    // b. no 1 method getLOad & getMaxLoad
    public double getLoad(){
        return this.load;
    }
    public double getMaxLoad(){
        return this.maxLoad;
    }

    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
        this.load = this.load + weight;
        return true;
        } else{
        return false;
        }

}
}