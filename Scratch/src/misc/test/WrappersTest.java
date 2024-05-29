package misc.test;

class WrappersTest {
    public static void main(String[] args) {

        String ageInput = "57";
        int age = Integer.parseInt(ageInput);  // makes the string an integer
        Integer ageInteger = Integer.valueOf(ageInput);  // takes the string and makes it an Integer class with 57 inside


        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput); // parse makes a string an int
        Long populationLong = Long.valueOf(populationInput);  // valueOf assignes the value to the Integer class


        String sizeInput = "10.5";
        double size = Double.parseDouble(sizeInput);
        Double sizeDouble = Double.valueOf(sizeInput);

        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput);
        Boolean isRainingBoolean = Boolean.valueOf(isRainingInput);
    }
}