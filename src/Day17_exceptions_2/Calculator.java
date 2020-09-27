package Day17_exceptions_2;

class Calculator {

    int power (int n, int p) throws Exception {
        if (n<0) {
            throw new Exception("n and p should be non-negative");
         } else if (p<0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);

    }
}
