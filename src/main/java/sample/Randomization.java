package sample;

import com.giavudangle.protobuf.Keyboard;
import com.giavudangle.protobuf.Screen;

import java.util.Random;

public class Randomization {
    public Random random;

    public Randomization(){
        random = new Random();
    }

    public String randomLaptopBrand(){
        return randomStringFromSet("Dell","Lenovo");
    }

    public String randomLaptopName(String brand){
        return switch (brand){
            case "Dell" -> randomStringFromSet("Vostro","Latitude","Elementary");
            default ->  randomStringFromSet("XPS","Thinkpad");
        };
    }

    public String randomCPUName(String brand) {
        if (brand.equals("Intel")) {
            return randomStringFromSet("Core i3", "Core i5", "Core i7");
        }
        return randomStringFromSet("Ryzen 3", "Ryzen 5", "Ryzen 7");
    }

    public String randomCPUBrand() {
        return randomStringFromSet("Intel","AMD");
    }

    public String randomGPUName(String brand){
        if (brand.equals("NVIDIA")){
            return randomStringFromSet("GTX 1050","GTX 1080");
        }
        return randomStringFromSet("AMD Supercard","AMD Supersuper");
    }

    public String randomGPUBrand(){
        return randomStringFromSet("NVIDIA","AMD");
    }

    public String randomStringFromSet(String ...spread) {
        int n = spread.length;
        if(n==0){
            return "";
        }
        return spread[random.nextInt(n)];
    }

    public Keyboard.Layout randomKeyBoardLayout(){
        return switch (random.nextInt(3)) {
            case 1 -> Keyboard.Layout.QWERTY;
            case 2 -> Keyboard.Layout.QWERTZ;
            default -> Keyboard.Layout.ASTRAZENICA;
        };
    }

    public Screen.Panel randomScreenPanel(){
        if(random.nextBoolean()){
            return Screen.Panel.IPS;
        }
        return Screen.Panel.OLED;
    }

    public double randomDouble(double min,double max){
        return min + random.nextDouble() * (max - min);
    }

    public float randomFloat(float min,float max){
        return min + random.nextFloat() * (max - min);
    }

    public int randomInt(int min,int max){
        return min + random.nextInt(max-min+1);
    }

    public boolean randomBoolean(){
        return random.nextBoolean();
    }

}
