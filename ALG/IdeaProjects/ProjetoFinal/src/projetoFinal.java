import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
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
     * The funtcion totalProfit() prints the 10% margin profit from all salesValue
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
     * The function clientInfo() prints the client name, contact and email
     * @return clientInfo
     * @throws FileNotFoundException
     */
    public static String clientInfo(int idCliente) throws FileNotFoundException {
        // Declare array (using function readFile()) and Variables
        String[][] array = readFile();
        String clientInfo = new String();

        // Find Name, Contact and email
        for (int i = 0;i < array.length;i++){
            if (array[i][1].equals(Integer.toString(idCliente))){
                clientInfo = "Name: "+array[i][2]+"\nContact: "+array[i][3]+"\nEmail: "+array[i][4];
                break;
            }
        }

        return clientInfo;
    }

    /**
     * The function moreExpensiveGame() prints the game value and clients who bought it
     * @return
     * @throws FileNotFoundException
     */
    public static String[] mostExpensiveGame() throws FileNotFoundException {
        // Declare array (using function readFile()) and Variables
        String[][] array = readFile();
        int counter = 0, aux = 0;
        double max = Double.parseDouble(array[1][8]);

        // Find the most expensive game
        for (int i = 1;i < array.length;i++){
            if (max < Double.parseDouble(array[i][8])){
                max = Double.parseDouble(array[i][8]);
            }
        }

        // Find how many times the max value appears on GameStart.csv
        for (int i = 1;i < array.length;i++){
            if (max == Double.parseDouble(array[i][8])){
                counter++;
            }
        }
        String[] mostExpensiveGame = new String[counter];

        // Store all lines that have the same game price as max
        for (int i = 1;i < array.length;i++){
            if (max == Double.parseDouble(array[i][8])){
                mostExpensiveGame[aux] = Arrays.toString(array[i]);
                aux++;
            }
        }

        return mostExpensiveGame;
    }

    /**
     * The function allGames() prints all the games existing on GameStart
     * @return allGames
     * @throws FileNotFoundException
     */
    public static String[] allGames() throws FileNotFoundException{
        // Declare array (using function readFile()) and Variables
        String[][] array = readFile();
        int aux = 0, counter = 0, aux2 = 0;

        // Verify how many diferent games exists
        for (int i = 1;i < array.length;i++){
            for (int j = i+1;j < array.length;j++){
                if (array[i][7].equals(array[j][7])){
                    aux++;
                }
            }
            if (aux == 0){
                counter++;
            }
            aux = 0;
        }
        System.out.println(counter);

        String[] allGames = new String[counter];
        // Add the games to the array
        for (int i = 1;i < array.length;i++){
            for (int j = i+1;j < array.length;j++){
                if (array[i][7].equals(array[j][7])){
                    aux++;
                }
            }
            if (aux == 0){
                allGames[aux2] = array[i][7];
                aux2++;
            }
            aux = 0;
        }
        return allGames;
    }

    public static String[] allPublishers() throws FileNotFoundException {

    }
    public static void adminMenu() throws FileNotFoundException {

    }

    public static void clientMenu(){

    }

    public static void main(String[] args) throws FileNotFoundException {
        // Instance Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare Variables
        String tipoUtilizador;
        String[] array = allGames();

        // Starting menu
        System.out.println("***** GameStart - Game shop *****");
        System.out.println("Tipo de Utilizador (ADMIN || CLIENTE): ");
        tipoUtilizador = scanner.nextLine().toLowerCase();

        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }

    }
}
