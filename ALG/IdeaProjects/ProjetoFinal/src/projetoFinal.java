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
        // Read File, instance Scanner and declare variables
        File file = new File("files/GameStart.csv");
        Scanner scanner = new Scanner(file);
        int numLines = 0, numColumns = 0, aux = 0;
        String line;

        // Find numLines and numColumns
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            numLines++;
            numColumns = line.split(";").length;
        }
        scanner.close();

        // Declare array and read file again
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
     * The function salesNumber() prints the number of total sales
     * @return salesNumber
     * @throws FileNotFoundException
     */
    public static int salesNumber() throws FileNotFoundException {
        // Declare array (using function readFile()) and declare variable
        String[][] array = readFile();
        int salesNumber = 0;

        // Find salesNumber
        for (int i = 1;i < array.length;i++){
            salesNumber++;
        }

        return salesNumber;
    }

    /**
     * The function salesValue() prints the total sales value
     * @return salesValue
     * @throws FileNotFoundException
     */
    public static double salesValue() throws FileNotFoundException {
        // Declare array (using function readFile()) and declare variable
        String[][] array = readFile();
        double salesValue = 0;

        // Find salesValue
        for (int i = 1;i < array.length;i++){
            salesValue += Double.parseDouble(array[i][8]);
        }

        return salesValue;
    }

    /**
     * The function totalProfit() prints the 10% margin profit from all salesValue
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
     * @param idCliente
     * @return
     * @throws FileNotFoundException
     */
    public static String clientInfo(String idCliente) throws FileNotFoundException {
        // Declare array (using function readFile()) and declare variable
        String[][] array = readFile();
        String clientInfo = "";

        // Find Name, Contact and email
        for (int i = 0;i < array.length;i++){
            if (array[i][1].equals(idCliente)){
                clientInfo = "Name: "+array[i][2]+"\nContact: "+array[i][3]+"\nEmail: "+array[i][4];
                break;
            }
        }

        // Warning if clientInfo is empty
        if (clientInfo.equals("")){
            return clientInfo = "IdCliente not found!";
        }

        return clientInfo;
    }

    /**
     * The function moreExpensiveGame() prints the game value and clients who bought it
     * @return mostExpensiveGame
     * @throws FileNotFoundException
     */
    public static String[] mostExpensiveGame() throws FileNotFoundException {
        // Declare array (using function readFile()) and declare variables
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
        int aux = 0, counter = 0;
        boolean verify = false;

        // Verify how many different games exists
        for (int i = 1;i < array.length;i++){
            for (int j = i+1;j < array.length;j++){
                if (array[i][7].equals(array[j][7])){
                    verify = true;
                }
            }
            if (!verify){
                counter++;
            }
            verify = false;
        }

        String[] allGames = new String[counter];
        // Add the games to the array
        for (int i = 1;i < array.length;i++){
            for (int j = i+1;j < array.length;j++){
                if (array[i][7].equals(array[j][7])){
                    verify = true;
                }
            }
            if (!verify){
                allGames[aux] = array[i][7];
                aux++;
            }
            verify = false;
        }
        return allGames;
    }

    /**
     * The function publisherExists() verify if the publisher given exists
     * @param publisher
     * @return publisherExists
     * @throws FileNotFoundException
     */
    public static boolean publisherExists(String publisher) throws FileNotFoundException {
        // Declare array (using function allPublishers()) and declare variable
        String[][] array = readFile();
        boolean publisherExists;

        // Verify if publisher selected exists
        for (int i = 1;i < array.length;i++){
            if (array[i][5].equalsIgnoreCase(publisher)){
                return publisherExists = true;
            }
        }

        return publisherExists = false;
    }

    /**
     * The function printGamesByPublisherAndCategories() prints all games by categories from a chosen publisher
     * @param publisher
     * @return printGamesByPublisherAndCategories
     * @throws FileNotFoundException
     */
    public static String printGamesByPublisherAndCategories(String publisher) throws FileNotFoundException {
        // Declare array (using function readFile()) and declare variables
        String[][] array = readFile();
        String[] printedCategories = new String[array.length];
        String[] printedGames = new String[array.length];
        int counter1 = 0, counter2 = 0;

        String printGamesByPublisherAndCategories = "****** "+publisher.toUpperCase()+" ******\n";

        // Print categories and games for the given publisher
        for (int i = 1;i < array.length;i++){
            if (array[i][5].equalsIgnoreCase(publisher)) {
                String category = array[i][6];
                String game = array[i][7];

                // Verify if the category has already been printed
                boolean categoryAlreadyPrinted = false;
                for (int j = 0;j < counter1;j++){
                    if (printedCategories[j].equals(category)){
                        categoryAlreadyPrinted = true;
                        break;
                    }
                }

                if (!categoryAlreadyPrinted){
                    printGamesByPublisherAndCategories += "----- "+category+" -----\n";
                    printedCategories[counter1] = category;
                    counter1++;
                }

                // Verify if the game has already been printed
                boolean gameAlreadyPrinted = false;
                for (int j = 0; j < counter2; j++){
                    if (printedGames[j].equals(game)) {
                        gameAlreadyPrinted = true;
                        break;
                    }
                }

                if (!gameAlreadyPrinted){
                    printGamesByPublisherAndCategories += "- "+game+"\n";
                    printedGames[counter2] = game;
                    counter2++;
                }
            }
        }

        return printGamesByPublisherAndCategories;
    }

    /**
     * The function adminMenu() start the admin menu
     * @throws FileNotFoundException
     */
    public static void adminMenu() throws FileNotFoundException {
        // Instance Scanner and declare variable
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        // Start the admin menu
        do {
            do {
                // Prints the information of the menu
                try {
                    System.out.print("********** ADMIN MENU **********\n1 - Print GameStart file\n2 - Print all sales and total value\n3 - Print total profit\n4 - Search Client by id\n5 - Print most espensive game and buyers\n0 - Leave from Admin Menu\n********************************\nSelect the desired option: ");
                    option = scanner.nextInt();
                }catch (InputMismatchException exc){
                    System.out.println("Wrong option selected");
                    scanner.nextLine();
                    option = -1;
                }
            }while (option < 0 || option > 5);
            switch (option){
                case 1: // "Print the file GameStart.csv"
                    System.out.println();
                    String[][] array1 = readFile();
                    System.out.println("***** Option 1 *****");
                    for (int i = 0;i < array1.length;i++){
                        for (int j = 0;j < array1[0].length;j++){
                            System.out.print(array1[i][j]+"\t");
                        }
                        System.out.println(" ");
                    }
                    System.out.println();
                    break;
                case 2: // "Print the number of sales and total value"
                    System.out.println();
                    System.out.println("***** Option 2 *****");
                    System.out.println("Total sales: "+salesNumber());
                    System.out.println("Total sales value: "+salesValue());
                    System.out.println();
                    break;
                case 3: // "Print the total profit from all sales"
                    System.out.println();
                    System.out.println("***** Option 3 *****");
                    System.out.println("Total profit: "+totalProfit());
                    System.out.println();
                    break;
                case 4: // "Given an idCliente print name, contact and email of the client"
                    System.out.println();
                    String idCliente = "";
                    System.out.println("***** Option 4 *****");
                    do {
                        System.out.print("Insert idCliente: ");
                        idCliente = scanner.next();

                        if (idCliente.equals("0")){
                            System.out.println("Invalid IdCliente!");
                            idCliente = "0";
                        }else if (idCliente.equals("sair")){
                            break;
                        }else{
                            System.out.println(clientInfo(idCliente));
                        }

                    }while (idCliente.equals("0"));
                    System.out.println();
                    break;
                case 5: // "Print the most expensive game and the clients that bought it"
                    System.out.println();
                    String[] array5 = mostExpensiveGame();
                    System.out.println("***** Option 5 *****");
                    for (int i = 0;i < array5.length;i++){
                        if (i == 0){
                            System.out.println("The most expensive game costs: "+array5[i]+"€");
                        }else{
                            System.out.println("Client "+i+" : "+array5[i]);
                        }
                    }
                    System.out.println();
                    break;
            }
        }while (option != 0);
        System.out.println("Leaving Admin menu...");
    }

    /**
     * The function clienteMenu() start the cliente menu
     * @throws FileNotFoundException
     */
    public static void clienteMenu() throws FileNotFoundException {
        // Instance Scanner and declare variable
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        // Start the client menu
        do {
            do {
                // Prints the information of the menu
                try {
                    System.out.print("********** CLIENTE MENU **********\n1 - Print all games\n2 - Print all games from one publisher, by categories\n0 - Leave from Admin Menu\n********************************\nSelect the desired option: ");
                    option = scanner.nextInt();
                }catch (InputMismatchException exc){
                    System.out.println("Wrong option! Choose the menu option again!");
                    scanner.next();
                    option = -1;
                }
            }while (option < 0 || option > 2);
            switch (option){
                case 1: // Prints all the games that exists in the GameStart Shop
                    System.out.println();
                    String[] array1 = allGames();
                    System.out.println("***** Option 1 *****");
                    for (int i = 0;i < array1.length;i++){
                        System.out.println((i+1)+" - "+array1[i]);
                    }
                    System.out.println();
                    break;
                case 2: // Prints all the games and categories, using the selected publisher
                    System.out.println();
                    scanner.nextLine();
                    System.out.println("***** Option 2 *****");
                    System.out.print("Enter the publisher name: ");
                    String publisher = scanner.nextLine();

                    if (publisher.equals("sair")){
                        break;
                    }

                    while(!publisherExists(publisher)) {
                        System.out.println("Publisher not found! Please choose a valid publisher.");

                        System.out.print("Enter the publisher name: ");
                        publisher = scanner.nextLine();
                    }

                    String result = printGamesByPublisherAndCategories(publisher);
                    System.out.println(result);
                    System.out.println();
                    break;
            }
        }while (option != 0);
        System.out.println("Leaving Cliente menu...");
    }

    /**
     * The function main() starts the program
     * @param args
     * @throws FileNotFoundException
     */
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
                    repeat = false;
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
