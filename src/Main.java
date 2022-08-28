import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, NumberFormatException {
        Scanner scanner = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\SberInternship\\Task_List_City\\src\\Task_BC_Java_Sber.csv"));
        List<City> cityList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] strArray = scanner.nextLine().split(";");
            //test
            //System.out.println(strArray[0] + strArray[1] + " " + strArray.length);
            String[] cityStrArray = new String[6];
            for(int i = 0;i < strArray.length;i++){
                cityStrArray[i] = strArray[i];
            }
            cityList.add(new City(cityStrArray[1], cityStrArray[2], cityStrArray[3], Integer.parseInt(cityStrArray[4]), cityStrArray[5]));
        }
        scanner.close();
        for (City city: cityList) {
            System.out.println(city);
        }
    }
}
