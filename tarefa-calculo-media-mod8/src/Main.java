class Main{

    public static void main(String[] args) {
        calcularMedia(6.4,5.5,3.5,7.8);
    }

    private static void calcularMedia(double val1, double val2,double val3,double val4) {
        double result = (val1 + val2 + val3 + val4)/4;
        System.out.println("Sua media foi de "+result);
    }
}