import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class projetoFinal {
    /**
     * The function readFile() reads file "GameStart.csv" and pass all data to an Array
     * @return fileArray
     * @throws FileNotFoundException
     */
    public static String[][] readFile() throws FileNotFoundException {
        // Read File and instance Scanner
        File file = new File("files/GameStart.csv");
        Scanner scanner = new Scanner(file);

        // Declare Variables
        int numLines = 0, numColumns = 0, aux = 0;
        String line;

        // Find numLines and numColumns
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            numLines++;
            numColumns = line.split(";").length;
        }
        scanner.close();

        // Declarar array and read file again
        scanner = new Scanner(file);
        String[][] fileArray = new String[numLines][numColumns];

        // Fill Array
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            String[] lineItems = line.split(";");
            for (int i = 0;i < lineItems.length;i++){
                    fileArray[aux][i] = lineItems[i];
            }
            aux++;
        }
        scanner.close();

        return fileArray;
    }

    /**
     * The function salesNumber() prints the number of sales
     * @return salesNumber
     * @throws FileNotFoundException
     */
    public static int salesNumber() throws FileNotFoundException {
        // Declare array (using function readFile()) and Variables
        String[][] array = readFile();
        int salesNumber = 0;

        // Find salesNumber
        for (int i = 1;i < array.length;i++){
            salesNumber++;
        }

        // Return salesNumber
        return salesNumber;
    }

    /**
     * The function salesValue() prints the sales Value
     * @return salesValue
     * @throws FileNotFoundException
     */
    public static double salesValue() throws FileNotFoundException {
        // Declare array (using function readFile()) and Variables
        String[][] array = readFile();
        double salesValue = 0;

        // Find salesValue
        for (int i = 1;i < array.length;i++){
            salesValue += Double.parseDouble(array[i][8]);
        }
        // Return salesValue
        return salesValue;
    }

    /**
     * The funtcion totalProfit prints the 10% margin profit from all salesValue
     * @return totalProfit
     * @throws FileNotFoundException
     */
    public static double totalProfit() throws FileNotFoundException {
        // Declare Variable (using function salesValue())
        double totalProfit = salesValue();

        // Find totalProfit with 10% margin of profit from all sales
        totalProfit = totalProfit * 0.10;

        return totalProfit;
    }

    /**
     *
     * @return
     */
    public static String[] clientInfo(int idCliente) throws FileNotFoundException {
        // Declare array (using function readFile()) and Variables
        String[][] array = readFile();

    }
    public static void adminMenu(){

    }

    public static void clientMenu(){

    }

    public static void main(String[] args) throws FileNotFoundException {

    }
}
