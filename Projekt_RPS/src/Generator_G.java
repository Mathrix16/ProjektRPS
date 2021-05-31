public class Generator_G {
    private int x0;
    private int a;
    private int m;
    private int c;
    private int size;
    private int[] result;


    public int[] getResult() {
        return result;
    }
    public int getM(){
        return m;
    }
    public int getSize(){
        return size;
    }

    public Generator_G(int x0, int a, int m, int c, int size) {
        this.x0 = x0;
        this.a = a;
        this.m = m;
        this.c = c;
        this.size = size;
        result = new int[size];
        result[0] = x0;
    }

    public void generate() {

        for (int i = 1; i < size; i++) {
            result[i] = ((a * result[i - 1] + c) % m);
        }

    }
    public void display(){
        for (int i: result
             ) {
            System.out.println(i);
        }
    }
}
