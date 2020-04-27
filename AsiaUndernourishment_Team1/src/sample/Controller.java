package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static java.util.Arrays.stream;

public class Controller implements Initializable {

    //configure table
    @FXML private TableView<asia> tableView2;
    @FXML private TableView<asiaOutstanding> tableView1;
    @FXML private TableView<transportation> tableView3;

    //configure tables for table 3
    @FXML private TableColumn<transportation,String> countryNameTransportationColumn;
    @FXML private TableColumn<transportation,Integer> populationColumn;
    @FXML private TableColumn<transportation,String> transportColumn;
    @FXML private TableColumn<transportation,Integer> foodAmountColumn;
    @FXML private TableColumn<transportation,String> receivingCountryColumn;

    //configure columns for table2
    @FXML private TableColumn<asia, Integer> countryAreaCodesColumn;
    @FXML private TableColumn<asia, Integer> undernourishmentPercentColumn;
    @FXML private TableColumn<asia, String> countryColumn;
    @FXML private TableColumn<asia, String> transportationColumn;

    //confgiure coulmns for table 1
    @FXML private TableColumn<asiaOutstanding, String> outstandingCountryNameColumn;
    @FXML private TableColumn<asiaOutstanding, Integer> outstandingUndernourishmentPercentColumn;
    @FXML private TableColumn<asiaOutstanding, Double> outstandingNumFood;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //set up the columns for table3
        countryNameTransportationColumn.setCellValueFactory(new PropertyValueFactory<transportation, String>("countryNameTransportationColumn"));
        populationColumn.setCellValueFactory(new PropertyValueFactory<transportation, Integer>("populationColumn"));
        transportColumn.setCellValueFactory(new PropertyValueFactory<transportation, String>("transportationColumn"));
        foodAmountColumn.setCellValueFactory(new PropertyValueFactory<transportation, Integer>("foodAmountColumn"));
        receivingCountryColumn.setCellValueFactory(new PropertyValueFactory<transportation, String>("receivingCountryColumn"));

        //set up the columns in the table2
        undernourishmentPercentColumn.setCellValueFactory(new PropertyValueFactory<asia, Integer>("undernourishmentPercent"));
        countryAreaCodesColumn.setCellValueFactory(new PropertyValueFactory<asia, Integer>("countryAreaCode"));
        countryColumn.setCellValueFactory(new PropertyValueFactory<asia, String>("countryName"));
        transportationColumn.setCellValueFactory(new PropertyValueFactory<asia, String>("transportationData"));

        //seting up the coulmns in table1
        outstandingUndernourishmentPercentColumn.setCellValueFactory(new PropertyValueFactory<asiaOutstanding, Integer>("outstandingUndernourishmentPercent"));
        outstandingCountryNameColumn.setCellValueFactory(new PropertyValueFactory<asiaOutstanding, String>("outstandingCountryName"));
        outstandingNumFood.setCellValueFactory(new PropertyValueFactory<asiaOutstanding, Double>("outstandingNumberOfFood"));


        //load data into the columns of the tableView from the excel method
        tableView1.setItems(excel1());  //Overview of Asia tab
        tableView2.setItems(excel2());  //All Data off Asia tab
        tableView3.setItems(excel3());  //All data for the Food Distribution
    }

    /**
     * This class saves the data from the ReadCellCountryData and ReadCountryNames methods as an ObservableList and return it to table3
     * which is on the second tab called Food Distribution
     *
     * NONE of the tables are working
     *
     *
     */

    public ObservableList<transportation> excel3 () {
        Controller MyExcelReadInts = new Controller(); //need to replace this object
        ObservableList<transportation> data3 = FXCollections.observableArrayList(); //declaring the ObservableList

        //adds data into ObservableList, rows are represented by int i
        for (int i = 1; i <= 44; i++) {
            //if doesnt work go to file >> invalidate caches/restart
            //prints (country code, country name, undernourishment percent, transportation data) to the All Data of Asia tab
           data3.addAll(new transportation
                    (MyExcelReadInts.ReadCountryNames(i,3),
                     MyExcelReadInts.ReadCellCountryData(i,14),
                     MyExcelReadInts.ReadCountryNames(i,12),
                     MyExcelReadInts.ReadCellCountryFoodData(i,13),
                     MyExcelReadInts.ReadCountryNames(i,15))); //reading data right into the ObservableList
        }
        return(data3);
    }

    /**
     * This class saves the data from the ReadCellCountryData and ReadCountryNames methods as an ObservableList and return it to table2
     * which is on the second tab called All Data of Asia
     */

    public ObservableList<asia> excel2() {
        Controller MyExcelReadInts = new Controller(); //need to replace this object
        ObservableList<asia> data2 = FXCollections.observableArrayList(); //declaring the ObservableList

        //adds data into ObservableList, rows are represented by int i
        for (int i = 1; i <= 44; i++) {
            //if doesnt work go to file >> invalidate caches/restart
            //prints (country code, country name, undernourishment percent, transportation data) to the All Data of Asia tab
            //currently missing transportation data
            data2.addAll(new asia
                            (MyExcelReadInts.ReadCellCountryData(i, 2),
                             MyExcelReadInts.ReadCountryNames(i,3),
                             MyExcelReadInts.ReadCellCountryData(i, 11),
                             MyExcelReadInts.ReadCountryNames(i,12))); //reading data right into the ObservableList
        }
        return (data2); //returns data
    }

    /**
     * This class saves the data from the ReadCellCountryData and ReadCountryNames methods as an ObservableList and return it to table1
     * which is on the first tab called Overview of Asia
     *
     *
     * Number of food table not working
     *
     */

    public ObservableList<asiaOutstanding> excel1 (){
        Controller MyExcelReadInts = new Controller(); //need to replace this object
        ObservableList<asiaOutstanding> data1 = FXCollections.observableArrayList(); //declaring the ObservableList
        for (int i = 1; i <= 44; i++) {
            if(i == 1 || i == 4 || i == 6 || i == 12 || i == 14 || i == 17 || i == 24 || i ==32 || i == 38 || i == 44){
                //if doesnt work go to file >> invalidate caches/restart
                //prints country name and undernourishment percent data to the Overview of Asia tab
                data1.addAll(new asiaOutstanding(MyExcelReadInts.ReadCellCountryData(i, 11),
                        MyExcelReadInts.ReadCellCountryFoodData(i,13),
                        MyExcelReadInts.ReadCountryNames(i,3)));
            }
        }
        return(data1);
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    /**
     * Code from Sam that uses the apache libraries
     * This method reads in the excel integers, COUNTRY CODE, POPULATION, and UNDERNOURISHMENT PERCENT from the spreadsheet and send it to the ObservableList
     * From the opensource
     */

    public static int ReadCellCountryData(int vRow, int vColumn) {
            int result = 0;
            Workbook wb = null;
            try {
                FileInputStream fis = new FileInputStream("D:/College/Software D&C/.idea/AsiaUndernourishment_Team1/src/sample/Excel Data/Asia_Undernourishment_Data.xlsx");
                wb = new XSSFWorkbook(fis);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(vRow);
            Cell cell = row.getCell(vColumn);
            result = (int) cell.getNumericCellValue();
            return result;
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Code from Sam that uses the apache libraries
     * This method reads in the excel counrty AMOUNT OF FOOD being transported or recieved as double and sends it to the ObservableList
     * From the opensource
     */

    public static double ReadCellCountryFoodData(int vRow, int vColumn) {
        double result = 0;
        Workbook wb = null;
        try {
            FileInputStream fis = new FileInputStream("D:/College/Software D&C/.idea/AsiaUndernourishment_Team1/src/sample/Excel Data/Asia_Undernourishment_Data.xlsx");
            wb = new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        result = (double) cell.getNumericCellValue();
        return result;
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * Code from Sam that uses the apache libraries
     * This method reads in the excel COUNTRY NAMES, if a country is TRANSPORTING OR RECIEVING, and RECIEIVING COUNTRIES as string and sends it to the ObservableList
     * From the opensource
     */

    public static String ReadCountryNames(int vRow, int vColumn)
    {
        String result = null;
        Workbook wb = null;
        try {
            FileInputStream fis = new FileInputStream("D:/College/Software D&C/.idea/AsiaUndernourishment_Team1/src/sample/Excel Data/Asia_Undernourishment_Data.xlsx");
            wb = new XSSFWorkbook(fis);
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        result = cell.getStringCellValue();
        return result;  //returns as a String
    }
}