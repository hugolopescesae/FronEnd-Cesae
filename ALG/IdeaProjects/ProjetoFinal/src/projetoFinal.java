import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
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
        int counter = 0, aux = 1;
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
        String[] mostExpensiveGame = new String[counter+1];
        mostExpensiveGame[0] = Double.toString(max);

        // Store all lines that have the same game price as max
        for (int i = 1;i < array.length;i++){
            if (max == Double.parseDouble(array[i][8])){
                mostExpensiveGame[aux] = array[i][2];
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


    public void  allPublishers(int publisher) throws FileNotFoundException {
        // Declare array (using function readFile()) and Variables
        String[][] array = readFile();
        int aux = 0, counter = 0, aux2 = 0;

        // Verify how many diferent publishers
        for (int i = 1;i < array.length;i++){
            for (int j = i+1;j < array.length;j++){
                if (array[i][5].equals(array[j][5])){
                    aux++;
                }
            }
            if (aux == 0){
                counter++;
            }
            aux = 0;
        }
        String[][] publisher = new String[counter][];

        // Add the publisher to an array
        for (int i = 1;i < array.length;i++){
            for (int j = i+1;j < array.length;j++){
                if (array[i][5].equals(array[j][5])){
                    aux++;
                }
            }
            if (aux == 0){
                for (int k = 0;k < array.length;k++){
                    publisher[aux2][k] = array[i][7];
                    aux2++;
                }
            }
            aux = 0;
        }

        // Add all games to the array and organise them by categories
        for (int i = 1;i < array.length;i++){
            for (int j = i+1;j < array.length;j++){
                if (array[i][5].equals(array[j][5])){
                    aux++;
                }
            }
            if (aux == 0){

                aux2++;
            }
            aux = 0;
        }

    }

    /**
     * The function adminMenu() start the admin menu
     * @throws FileNotFoundException
     */
    public static void adminMenu() throws FileNotFoundException {
        // Instance Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare Variables
        int option;

        // Start the admin menu
        do {
            do {
                try {
                    System.out.print("********** ADMIN MENU **********\n1 - Print GameStart file\n2 - Print all sales and total value\n3 - Print total profit\n4 - Search Client by id\n5 - Print most espensive game and buyers\n0 - Leave from Admin Menu\n********************************\nSelect the desired option: ");
                    option = scanner.nextInt();
                }catch (InputMismatchException exc){
                    System.out.println("Wrong option selected");
                    option = 0;
                }
            }while (option < 0 || option > 5);
            switch (option){
                case 1: // "Print the file GameStart.csv"
                    String[][] array1 = readFile();
                    System.out.println("***** Option 1 *****");
                    for (int i = 0;i < array1.length;i++){
                        for (int j = 0;j < array1[0].length;j++){
                            System.out.print(array1[i][j]+"\t");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2: // "Print the number of sales and total value"
                    System.out.println("***** Option 2 *****");
                    System.out.println("Total sales: "+salesNumber());
                    System.out.println("Total sales value: "+salesValue());
                    break;
                case 3: // "Print the total profit from all sales"
                    System.out.println("***** Option 3 *****");
                    System.out.println("Total profit: "+totalProfit());
                    break;
                case 4: // "Given an idCliente print name, contact and email of the client"
                    int idCliente;
                    System.out.println("***** Option 4 *****");
                    System.out.print("Insert idCliente: ");
                    idCliente = scanner.nextInt();
                    System.out.println(clientInfo(idCliente));
                    break;
                case 5: // "Print the most expensive game and the clients that bought it"
                    String[] array5 = mostExpensiveGame();
                    System.out.println("***** Option 5 *****");
                    for (int i = 0;i < array5.length;i++){
                        if (i == 0){
                            System.out.println("The most expensive game costs: "+array5[i]+"€");
                        }else{
                            System.out.println("Client "+i+" : "+array5[i]);
                        }
                    }
                    break;
            }
        }while (option != 0);
        System.out.println("Leaving Admin menu...");
    }

    /**
     * The function clienteMenu() start the admin menu
     * @throws FileNotFoundException
     */
    public static void clienteMenu() throws FileNotFoundException {
        // Instance Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare Variables
        int option;

        // Start the client menu
        do {
            do {
                System.out.print("********** CLIENTE MENU **********\n1 - Print all games\n2 - Print all games from one publisher, by categories\n0 - Leave from Admin Menu\n********************************\nSelect the desired option: ");
                option = scanner.nextInt();
            }while (option < 0 || option > 2);
            switch (option){
                case 1:
                    String[] array1 = allGames();
                    for (int i = 0;i < array1.length;i++){
                        System.out.println(array1[i]);
                    }
                    break;
                case 2:
                    int publisher;
                    System.out.print("Choose an publisher: ");
                    publisher = scanner.nextInt();


            }
        }while (option != 0);
        System.out.println("Leaving Cliente menu...");
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Instance Scanner to read user answers
        Scanner scanner = new Scanner(System.in);

        // Declare Variable
        String userType, password, stop;
        boolean repeat = false;

        // Start the menu
        System.out.println("***** Welcome to GameStart *****");
        do {
            System.out.print("User type (ADMIN || CLIENTE): ");
            do {
                userType = scanner.nextLine().toLowerCase();
                if (userType.equals("admin")){
                    do {
                        System.out.print("Insert password: ");
                        password = scanner.nextLine();
                        if (password.equals("1234")){
                            adminMenu();
                            repeat = false;
                        }else{
                            System.out.println("Wrong password!");
                            repeat = true;
                        }
                    }while (repeat);
                }else if (userType.equals("cliente")){
                    clienteMenu();
                }else{
                    System.out.print("Please, select Cliente or Admin: ");
                    repeat = true;
                }
            }while (repeat);
            System.out.println("Do you want to leave the GameStart Platform?(yes/no)");
            do {
                stop = scanner.nextLine().toLowerCase();
                if (stop.equals("yes") || stop.equals("y")){
                    System.out.print("Leaving GameStart Platform...");
                    repeat = false;
                }else if (stop.equals("no") || stop.equals("n")){
                    repeat = false;
                }else{
                    System.out.print("Invalid choice! Please, select yes or no: ");
                    repeat = true;
                }
            }while (repeat);
            if (stop.equals("no") || stop.equals("n")){
                repeat = true;
            }
        }while (repeat);
    }
}
