public class Generator_W extends Generator_J {

    public Generator_W(Generator_G obj) {
        super(obj);
    }

    public void setResult(double lambda) {
        for (int i = 0; i < obj.getSize(); i++) {
            result[i] = -1 * Math.log(result[i]) / lambda;
        }
    }
}
