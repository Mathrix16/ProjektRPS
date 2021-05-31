public class Generator_B extends Generator_J {

    public Generator_B(Generator_G obj) {
        super(obj);
    }

    public void setResult(double p) {
        for (int i = 0; i < obj.getSize(); i++) {
            result[i] = result[i] < p ? 1. : 0.;
        }
    }


}
