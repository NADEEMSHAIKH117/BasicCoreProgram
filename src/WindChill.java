
public class WindChill {
    public static void main(String[] args) {
        double t = 40; // temperature
        double v = 50; // wind speed (mph)
        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Given a temperature of " + t + " Fahrenheit" + " and a wind speed of " + v + " mph");
        System.out.println("The wind chill is " + windChill);
    }
}