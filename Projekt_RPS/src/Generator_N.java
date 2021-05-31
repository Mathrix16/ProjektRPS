public class Generator_N extends Generator_J {

    public Generator_N(Generator_G obj) {
        super(obj);
    }

    public void setResult(int x0, int a, int m, int c) {
        Generator_G supp = new Generator_G(x0, a, m, c, obj.getSize());
        supp.generate();
        Generator_J supp2 = new Generator_J(supp);
        double[] suppRes = supp2.getResult();
        int i = 0;
        while (i < obj.getSize()) {
            result[i] = Math.sqrt(-2 * Math.log(suppRes[i])) * Math.cos(2 * Math.PI * result[i]);
            if (i + 1 == obj.getSize())
                break;
            result[i + 1] = Math.sqrt(-2 * Math.log(suppRes[i])) * Math.sin(2 * Math.PI * result[i]);
            i += 2;
        }

    }

}
