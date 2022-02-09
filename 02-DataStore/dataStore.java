import java.util.*;

public class dataStore {

  public static void main (String[] args){

    String[][] data = {{"Student ID", "Student Name", "Close Contact", "Grades"},
                       {"1234567", "Jimmy Smith", "Y", "90, 80, 95, 90, 180"},
                       {"9876543", "Maria Hernandez", "N", "95, 100, 100, 90, 90"},
                       {"1357911", "Jamal Jenkins", "N", "85, 85, 95, 100, 90"},
                       {"2458101", "Ramiz Ahmed", "Y", "90, 100, 75, 85, 90"},
                       {"1928374", "Michael Green", "Y", "80, 80, 65, 55, 90"}};

    System.out.println();
    System.out.println("Close Contact Students: " + Arrays.toString(closeContact(data)));
    System.out.println();
    
  }

  public static String[] closeContact(String[][] data){

    int k = 0;

    for (int i = 0; i < data.length; i++){
      if (data[i][2] == "Y"){
        k++;
      }
    }

    String[] closeContact = new String[k];

    int j = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i][2] == "Y"){
        closeContact[j] = data[i][1];
        j++;
      }
    }

    return closeContact;
  }

}
