public class WeatherGame {

    public static void main(String[] args) {
        boolean currentlyRaining = false;
        int temperature = 10;

        if (currentlyRaining == true && temperature > 15){
            System.out.println("Wear a waterproof coat");
        }

        if (currentlyRaining == true && temperature < 15){
            System.out.println("Wear a waterproof coat and wrap up");
        }

        if (currentlyRaining == false && temperature > 15){
            System.out.println("Wear shorts and sunscreen");
        }

        if (currentlyRaining == false && temperature < 15){
            System.out.println("Wrap up warm but  you don't need an umbrella");
        }

    }
}
