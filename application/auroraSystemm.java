package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import entities.AuroraEnginee;
import java.util.stream.IntStream;
import java.util.Calendar;

public class auroraSystemm {
    public static void main(String[] args) throws InterruptedException, IOException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<AuroraEnginee> auroraDataList = new ArrayList<>();
        Calendar c = Calendar.getInstance();

        String loginName;
        String loginPassword;


        do{
        if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
        else
            Runtime.getRuntime().exec("clear");
        System.out.print("Name : ");
            loginName = scan.nextLine();
            System.out.print("Password : ");
            loginPassword = scan.nextLine();
            if(loginPassword.equals("auroraSystem3323")){
                if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                else
                    Runtime.getRuntime().exec("clear");

                int hora = c.get(Calendar.HOUR_OF_DAY);

                int minute = c.get(Calendar.MINUTE);

                if(hora > 6 && hora < 12){
                    System.out.println("Good Morning, welcome "+loginName);
                } else if(hora > 12 && hora < 18){
                    System.out.println("Good Afternoon, welcome "+loginName);
                } else{
                    System.out.println("Good Night, welcome "+loginName);
                }
                System.out.printf("Login at %d:%d", hora, minute);

                Thread.sleep(5000);

                if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
                else
                    Runtime.getRuntime().exec("clear");
                    
                System.out.print(" \n                   AURORA                  ");
                System.out.print(" \n =====  =   =  =====   =====  =====   =====");
                System.out.print(" \n =   =  =   =  =   =   =   =  =   =   =   =");
                System.out.print(" \n =====  =   =  =====   =   =  =====   =====");
                System.out.print(" \n =   =  =   =  =    =  =   =  =    =  =   =");
                System.out.print(" \n =   =  =====  =    =  =====  =    =  =   =");
        
                int choice = 0;
                System.out.print("\n\nHow many registrations would you like to make ? ");
                int auroraCarRegister = scan.nextInt(); 
        
                for(int i=0; i<auroraCarRegister; i++){
                    if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                    else
                        Runtime.getRuntime().exec("clear");
        
                    System.out.printf("\n\n\n-- %d REGISTER --", i+1);
                    System.out.print("\nInsert the car ID : ");
                    int carID = scan.nextInt();
                    while(checkID(auroraDataList, carID)){
                        System.out.print("This ID already exist, try again\n\n");
                        System.out.print("Insert the ID : ");
                        carID = scan.nextInt(); 
                    }
                    System.out.print("\nInsert the car model : ");
                    scan.nextLine();
                    String carModel = scan.nextLine();
                    System.out.print("\nInsert the car name : ");
                    String carName = scan.nextLine();
                    System.out.print("\nInsert the car license plate : ");
                    int carLicensePlate = scan.nextInt();
                    while(checkLicensePlate(auroraDataList, carLicensePlate)){
                        System.out.print("This license plate already exist, try again\n\n");
                        System.out.print("Insert the car license plate : ");
                        carLicensePlate = scan.nextInt(); 
                    }
                    System.out.print("\nInsert the car price R$ ");
                    double carPrice = scan.nextDouble();
        
                    AuroraEnginee auroraData = new AuroraEnginee(carID, carModel, carName, carLicensePlate, carPrice);
        
                    auroraDataList.add(auroraData);
                }
        
                System.out.print("Register sucessfully !!!\n\n\n");
        
                do{
                    if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                    else
                        Runtime.getRuntime().exec("clear");
        
                    System.out.print("\n\nWhat would you like to do now ? ");
                    System.out.print("\n\n 1 - VIEW REGISTER\n 2 - CHANGE CAR MODEL\n 3 - CHANGE CAR NAME\n 4 - SEARCH CAR BY ID\n 5 - SEARCH CAR BY CAR LICENSE PLATE\n 6 - INCREASE PERCENTAGE THE CAR PRICE\n 7 - REDUCE PERCENTAGE THE CAR PRICE\n 8 - DELETE REGISTER\n 9 - EXIT\n\nInsert your choice : ");
                    choice = scan.nextInt();
                    switch(choice){
                        case 1:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nVIEW REGISTER\n\n");
                            System.out.print(auroraDataList);
                            System.out.print("\n\nView was sucessfully !!!");
                            System.out.print("\n\nPress Enter to continue...");
                            String enter = scan.nextLine();
                            Thread.sleep(6000);
                            break;
        
                        case 2:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nCHANGE CAR MODEL");
                            System.out.print("\n\nInsert car ID to change model : ");
                            int carChangeModel = scan.nextInt();
                            AuroraEnginee carChangeeModel = auroraDataList.stream().filter(x -> x.getCarID() == carChangeModel).findFirst().orElse(null);
                            if(carChangeeModel== null){
                                System.out.print("\nCar ID inserted doesnt exist, try again");
                            }
                            else{
                                System.out.print("Insert new car model : ");
                                scan.nextLine();
                                String newCarModel = scan.nextLine();
                                carChangeeModel.setCarModel(newCarModel);
                                System.out.print("\nModel changed was sucessfully !!!");
                            }
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(3000);
                            break;
        
        
                        case 3:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nCHANGE CAR NAME");
                            System.out.print("\n\nInsert car ID to change name : ");
                            int carIDchangeName = scan.nextInt();
                            AuroraEnginee carChangeName = auroraDataList.stream().filter(x -> x.getCarID() == carIDchangeName).findFirst().orElse(null);
                            if(carChangeName== null){
                                System.out.print("\nCar ID inserted doesnt exist, try again");
                            }
                            else{
                                System.out.print("Insert new car name : ");
                                scan.nextLine();
                                String newCarName = scan.nextLine();
                                carChangeName.setCarName(newCarName);
                                System.out.print("\nCar name changed was sucessfully !!!");
                            }
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(3000);
                            break;
        
                        case 4:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nSEARCH CAR BY ID");
                            System.out.print("\n\nInsert car ID to search : ");
                            int carIDsearch = scan.nextInt();
                            AuroraEnginee carIDtoSearch = auroraDataList.stream().filter(x -> x.getCarID() == carIDsearch).findFirst().orElse(null);
                            if(carIDtoSearch== null){
                                System.out.print("\nCar ID inserted doesnt exist, try again");
                            }
                            else{
                                System.out.printf("Car ID %d was found sucessfully in system", carIDsearch);
                            }
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(3000);
                            break;
        
                        case 5:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nSEARCH CAR BY LICENSE PLATE");
                            System.out.print("\n\nInsert car license plate to search : ");
                            int carLicensePlateSearch = scan.nextInt();
                            AuroraEnginee carLicensePlateToSearch = auroraDataList.stream().filter(x -> x.getCarLicensePlate() == carLicensePlateSearch).findFirst().orElse(null);
                            if(carLicensePlateToSearch== null){
                                System.out.print("\nCar license plate inserted doesnt exist, try again");
                            }
                            else{
                                System.out.printf("Car license plate %d was found sucessfully in system", carLicensePlateSearch);
                            };
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(3000);
                            break;
                            
                        case 6:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nINCREASE PERCENTAGE THE CAR PRICE");    
                            System.out.print("\n\nInsert the car ID to increase percentage at value : "); 
                            int findID = scan.nextInt();
                            AuroraEnginee addValuePercentage = auroraDataList.stream().filter(x -> x.getCarID() == findID).findFirst().orElse(null);
                            if(addValuePercentage == null){
                                System.out.print("\nError, the employee ID inserted doesnt exist");
                            }                
                            else{
                                System.out.print("Insert the percentage value : ");
                                double valuePercentage = scan.nextDouble();
                                addValuePercentage.percentageCalc(valuePercentage);
                                System.out.printf("Percentage inserted was sucessfully to ID %d", findID);
                            }
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(2000);
                            break;
        
                        case 7:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nREDUCE PERCENTAGE THE CAR PRICE");    
                            System.out.print("\n\nInsert the car ID to increase percentage at value : "); 
                            findID = scan.nextInt();
                            AuroraEnginee reduceValuePercentage = auroraDataList.stream().filter(x -> x.getCarID() == findID).findFirst().orElse(null);
                            if(reduceValuePercentage == null){
                                System.out.print("\nError, the employee ID inserted doesnt exist");
                            }                
                            else{
                                System.out.print("Insert the percentage value : ");
                                double valuePercentage = scan.nextDouble();
                                reduceValuePercentage.reducePercentageCalc(valuePercentage);
                                System.out.printf("Percentage inserted was sucessfully to ID %d", findID);
                            }
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(2000);
                            break;
        
                        case 8:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.println("\n\nDELETE REGISTER");
                            System.out.print("\n\nInsert the position to remove all data : ");
                            int registerPosition = scan.nextInt();
                            int convertPosition = (registerPosition-1);
                            auroraDataList.remove(convertPosition);
                            System.out.print("\nRemoved was sucessfully !!!");
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(2000);
                            break;    
                        
                        case 9:
                            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();          
                            else
                                Runtime.getRuntime().exec("clear");
                            System.out.print("\n\nThanks for using any services !!! Back later : )");
                            System.out.print("\n\nPress Enter to continue...");
                            scan.nextLine();
                            Thread.sleep(2000);
                            System.out.print("\n\n");    
                            break;
                        }
        
                }while(choice != 9);
            }

            else {
                System.out.print("Password is not correct, try again");
                Thread.sleep(3000);
                System.out.print("...");
                Thread.sleep(3000);
            }
            
        }while(!loginPassword.equals("auroraSystem3323"));
    }       
    
    public static boolean checkID(List<AuroraEnginee> auroraDataList, int carID){
        AuroraEnginee carCheckID = auroraDataList.stream().filter(x -> x.getCarID() == carID).findFirst().orElse(null);
        return carCheckID != null;
    }
    
    public static boolean checkLicensePlate(List<AuroraEnginee> auroraDataList, int carLicensePlate){
        AuroraEnginee carCheckLicensePlate = auroraDataList.stream().filter(x -> x.getCarLicensePlate() == carLicensePlate).findFirst().orElse(null);
        return carCheckLicensePlate != null;
    }  
}