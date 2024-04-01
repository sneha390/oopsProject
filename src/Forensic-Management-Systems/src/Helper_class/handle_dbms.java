package Helper_class;
import java.util.ArrayList;
import java.lang.String;

public class handle_dbms {
    
    private ArrayList<String[]> Cases = new ArrayList<String[]>();
    private ArrayList<String[]> Evidence = new ArrayList<String[]>();
    private ArrayList<String[]> People = new ArrayList<String[]>();
    private ArrayList<String[]> Users = new ArrayList<String[]>();


    private handle_dbms(){
        this.Users.add(
            new String[]{"1","sneha","password","admin","yadav","nepal","657878978"}
        );
        this.Users.add(
            new String[]{"2","admin","admin","forensic","admin","nepal","657878978"}
        );
  
    }

    private static handle_dbms instance;

    public static handle_dbms getInstance(){
        //check whether 1 obj is created or not
        if(instance == null){
            instance  = new handle_dbms();
        }
        return instance;

    }

   public boolean write_to_file(String data, String file_name) {
    String[] data_array = data.split(",");
    switch (file_name) {
        case "Cases.csv":
            this.Cases.add(data_array);
            return true;
     
        case "Evidences.csv":
            this.Evidence.add(data_array);
            return true;
       
        case "People.csv":
            this.People.add(data_array);
            return true;
        
        case "Users.csv":
            this.Users.add(data_array);
            return true;

        default:
            System.out.println("File Not Found");
            return false;
        }
    }
    
   public ArrayList<String[]> read(String file_name)  {
       switch (file_name) {
           case "Cases.csv":
               return this.Cases;
           case "Evidences.csv":
               return this.Evidence;
           case "People.csv":
               return this.People;
           case "Users.csv":
               return this.Users;
           default:
               System.out.println("File Not Found");
               return null;
       }
    }
    
    //Write Array 
   public boolean append(String data, String file_name) {
    String[] data_array = data.split(",");
    switch (file_name) {
        case "Cases.csv":
            this.Cases.add(data_array);
            return true;
     
        case "Evidences.csv":
            this.Evidence.add(data_array);
            return true;
       
        case "People.csv":
            this.People.add(data_array);
            return true;
        
        case "Users.csv":
            this.Users.add(data_array);
            return true;

        default:
            System.out.println("File Not Found");
            return false;
        }
    }

    public String convert_to_string(ArrayList<String[]> data) {
        String converted_data = "";
        for (String[] line : data) {
            for(String word : line){
                converted_data = converted_data + word + ',';
            }
            converted_data = converted_data+"\n";
        }
        return converted_data;
    }

}



