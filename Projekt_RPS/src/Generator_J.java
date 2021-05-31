public class Generator_J {
    Generator_G obj;
    double[] result;

    public Generator_J(Generator_G obj) {
        this.obj = obj;
        result = new double[obj.getSize()];
        int[] res = obj.getResult();
        for (int i = 0; i < obj.getSize(); i++) {
            result[i] = (double) res[i] / obj.getM();
        }
    }

    public double[] getResult() {
        return result;
    }

    public double getMean(){
        double mean = 0;
        for (double i: result) {
            mean+=i;
        }
        return mean/ obj.getSize();
    }
    public double getVar(){
        double var = 0;
        double mean = getMean();
        for (double i: result) {
        var+=(i-mean)*(i-mean);
        }
        return var/obj.getSize();
    }
    public void display(){
        for (double i: result
        ) {
            System.out.println(i);
        }
    }

}
