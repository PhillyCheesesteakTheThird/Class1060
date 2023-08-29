public class TempConvert {
    public double convert(double inputInt, String typeSelection) {
        double output;
        if (typeSelection.equals("A")) {
            output = (inputInt * 9 / 5) + 32;
        } else {
            output = (inputInt * 5 / 9) - 32;

        }
        return output;
    }


}

