public class Main {
    public static void main(String[] args) {

        float earthWeightFidelis = 70.0f;
        float marsWeightFidelis;
        float marsWeightdouble;
        float marsWeightChar;
        float gravityofmars = 0.38f;
        double weightofMars = earthWeightFidelis * gravityofmars;

        System.out.printf( "Weight of Mars is %.2f", weightofMars);

        System.out.println("Weight on Mars (int):" +  );
    }

}