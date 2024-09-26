import java.util.Scanner;
class MultimediaDevice{
    String brand;
    String model;
    int yearOfManufacture;

    public MultimediaDevice(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void displayInfo(){
        System.out.println("Device: Brand " + brand + ", Model " + model + ", yearOfManufacture " + yearOfManufacture);
    }
}

class BasicMedPlayer extends MultimediaDevice {
    String supportedFormats;

    public BasicMedPlayer(String brand, String model, int yearOfManufacture){
        super.displayInfo();
        this.supportedFormats = supportedFormats;
    }
    public void play(){
        System.out.println("Playing multimedia content. Supported formats: " + supportedFormats);
    }
}
class smartTV extends MultimediaDevice{
    String screenSize;
    String smartFeatures;

    public smartTV(String brand, String model, int yearOfManufacture, String screenSize, String smartFeatures){
        super.displayInfo();
        this.screenSize=screenSize;
        this.smartFeatures=smartFeatures;
    }
    public void adjustSetting(String setting){
        System.out.println("Adjusting " + setting + " on the smart TV.");
    }
    public void displaySmartFeatures(){
        System.out.println("Screen Size: " + screenSize + ", Smart Features: " + smartFeatures);
    }
}

class HomeTheaterSystem extends smartTV{
    public HomeTheaterSystem(String brand, String model, int yearOfManufacture, String screenSize, String smartFeatures) {
        super(brand, model, yearOfManufacture)
    }
    public void controlAudioSettings(String setting) {
        System.out.println("Adjusting " + setting + "in the home theater system.");

    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scnner(Systemi.in);
        BasicMedPlayer mediaPlayer = new BasicMedPlayer("Sony")

    }
}
