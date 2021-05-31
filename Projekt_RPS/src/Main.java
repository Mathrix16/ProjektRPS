public class Main {


    public static void main(String[] args) {

        //GENERATOR G

        /*


        System.out.println("Generator wyjsciowy: ");
        Generator_G obj = new Generator_G(5, 77, 8191, 10, 1000);
        obj.generate();
        obj.display();

        */

        //GENERATOR J

        /*
        System.out.println("Generator jednostajny: ");
        Generator_J j = new Generator_J(obj);
        j.display();
        System.out.println("Srednia jednostajnego: "+j.getMean());
        System.out.println("Mediana jednostajnego: "+j.getVar());

        */

        //GENERATOR W

        /*

        System.out.println("Generator wykladniczy: ");
        Generator_W w = new Generator_W(obj);
        w.setResult(0.5);
        w.display();
        System.out.println("Srednia wykladniczego: "+w.getMean());
        System.out.println("Mediana wykladniczego: "+w.getVar());

        */

        //GENERATOR N

        /*

        System.out.println("Generator normalny: ");
        Generator_N n = new Generator_N(obj);
        n.setResult(500,66,8191,19);
        n.display();
        System.out.println("Srednia normalnego: "+n.getMean());
        System.out.println("Mediana normalnego: "+n.getVar());

        */
        //BRAK GENERATORA P


        //GENERATOR B

        /*

        System.out.println("Generator Bernoulliego");
        Generator_B b = new Generator_B(obj);
        b.setResult(0.7);
        b.display();
        System.out.println("Srednia Bernoulliego: "+b.getMean());
        System.out.println("Mediana Bernoulliego: "+b.getVar());

        */

        //GENERATOR_D

        /*

        System.out.println("Generator dwumianowy");
        Generator_D d = new Generator_D(obj);
        d.setResult(100,0.3);
        d.display();

        */

    }
}
