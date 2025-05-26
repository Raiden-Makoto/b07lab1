public class Driver {
    public static void main(String[] args) throws IOException {
		Polynomial p = new Polynomial();
        double[] c1 = {6,5};
        int[] e1 = {0, 3};
        Polynomial p1 = new Polynomial(c1, e1);
        Polynomial p2 = new Polynomial('poly.txt');
        Polynomial s = p1.add(p2);
        System.out.println("s(0.1) = " + s.evaluate(0.1));
        if(s.hasRoot(1)){ System.out.println("1 is a root of s"); }
        else{ System.out.println("1 is not a root of s"); }
        Polynomial w = p1.multiply(p2);
        System.out.println(w);
		w.saveToFile('lebronjames.txt');
		
	}
}
