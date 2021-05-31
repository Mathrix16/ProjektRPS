public class Generator_D extends Generator_J {
    double res;
    public Generator_D(Generator_G obj) {
        super(obj);
        res = 0.0;
    }

    public void setResult(int n, double p) {
        for (int i = 0; i < n; i++) {
            if (result[i] < p)
                res += 1.0;
        }
    }

    @Override
    public void display() {
        System.out.println(res);
        res = 0;
    }
}
