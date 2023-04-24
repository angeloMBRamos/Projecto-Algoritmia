import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex {

    public static void readFileAndPrint(String pathFile) throws FileNotFoundException {

        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);
        //Itera o ficheiro enquanto existe uma linha
        while(readFile.hasNext()){
            System.out.println(readFile.nextLine());
        }
        readFile.close();
    }
    public static void numberOfSalesAndTotalSales(String pathFile) throws FileNotFoundException {
        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar variáveis
        String line;
        int totalSalesNumber = 0, totalLines=0, i=0;
        double totalSales = 0;

        while (readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }
        readFile.close();

        String[][] matrix = new String[totalLines][9];

        Scanner readFileAgain = new Scanner(file);

        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(";");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }

        for (int j = 1; j < matrix.length; j++) {
            totalSales+=Double.parseDouble(matrix[j][8]);
            totalSalesNumber++;
        }
        readFileAgain.close();
        System.out.println("Total number of sales is: " + totalSalesNumber);
        System.out.println("Total sales is: " + totalSales);
    }

    public static void totalProfit(String pathFile) throws FileNotFoundException {
        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar variáveis
        String line;
        int totalLines=0, i=0;
        double totalSales=0, profit, totalProfit=0;

        while (readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }
        readFile.close();

        String[][] matrix = new String[totalLines][9];

        Scanner readFileAgain = new Scanner(file);

        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(";");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }

        for (int j = 1; j < matrix.length; j++) {
            totalSales+=Double.parseDouble(matrix[j][8]);
            totalProfit= totalSales * 0.10;
        }
        readFileAgain.close();
        System.out.println("Total profit sales: " + totalProfit);

    }
    public static void clientInfo(String pathFile) throws FileNotFoundException {
        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar variáveis
        String line, name="", email="";
        int totalLines=0, i=0, contact=0, id=0;
        double totalSales=0, profit, totalProfit=0;

        while (readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }
        readFile.close();

        String[][] matrix = new String[totalLines][9];

        Scanner readFileAgain = new Scanner(file);

        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(";");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }

        int clientId;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter client id: ");
        clientId = input.nextInt();

        for (int j = 1; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                if (Integer.parseInt(matrix[j][1]) == (clientId)) {
                    name = matrix[j][2];
                    contact = Integer.parseInt(matrix[j][3]);
                    email = matrix[j][4];
                }
            }
            }
        readFileAgain.close();
        System.out.println("Name: " + name);
        System.out.println("contact: " + contact);
        System.out.println("email: " + email);

    }

    public static void editorInfo(String pathFile) throws FileNotFoundException {
        //Abre o ficheiro
        File file = new File(pathFile);
        //Lê o ficheiro
        Scanner readFile = new Scanner(file);

        //Declarar variáveis
        String line, game="", gender="";
        int totalLines=0, i=0;

        while (readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }
        readFile.close();

        String[][] matrix = new String[totalLines][9];

        Scanner readFileAgain = new Scanner(file);

        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(";");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }

        String editor;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter editor name: ");
        editor = input.next();

        for (int j = 1; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[j][5].equals(editor)) {
                    gender = matrix[j][6];
                    game = matrix[j][7];
                    System.out.println("Gender: " + gender);
                    System.out.println("Game: " + game);
                }
            }
        }
        readFileAgain.close();

    }


    public static void readFile(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner readFile = new Scanner(file);

        String line;
        int totalLines=0, i=0;

        while (readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }
        readFile.close();
        System.out.println("Total lines: " + totalLines);

        String[][] matrix = new String[totalLines][9];

        Scanner readFileAgain = new Scanner(file);

        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(";");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            matrix[i][4] = itemsOfTheLine[4];
            matrix[i][5] = itemsOfTheLine[5];
            matrix[i][6] = itemsOfTheLine[6];
            matrix[i][7] = itemsOfTheLine[7];
            matrix[i][8] = itemsOfTheLine[8];
            i++;
        }
        //Prints the matrix
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.println("Matrix["+j+"]["+k+"]: " + matrix[j][k]);
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {

        try {
            editorInfo("GameStart.csv");
        } catch (FileNotFoundException exc) {
            System.out.println("File not found!!");
        }

    }
}