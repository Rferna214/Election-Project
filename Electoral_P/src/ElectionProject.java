import com.sun.jdi.connect.Connector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ElectionProject {
    public static void states() {
        String[] State = {"Alaska",
                "Alabama",
                "Arkansas",
                "American Samoa",
                "Arizona",
                "California",
                "Colorado",
                "Connecticut",
                "District of Columbia",
                "Delaware",
                "Florida",
                "Georgia",
                "Guam",
                "Hawaii",
                "Iowa",
                "Idaho",
                "Illinois",
                "Indiana",
                "Kansas",
                "Kentucky",
                "Louisiana",
                "Massachusetts",
                "Maryland",
                "Maine",
                "Michigan",
                "Minnesota",
                "Missouri",
                "Mississippi",
                "Montana",
                "North Carolina",
                " North Dakota",
                "Nebraska",
                "New Hampshire",
                "New Jersey",
                "New Mexico",
                "Nevada",
                "New York",
                "Ohio",
                "Oklahoma",
                "Oregon",
                "Pennsylvania",
                "Puerto Rico",
                "Rhode Island",
                "South Carolina",
                "South Dakota",
                "Tennessee",
                "Texas",
                "Utah",
                "Virginia",
                "Virgin Islands",
                "Vermont",
                "Washington",
                "Wisconsin",
                "West Virginia",
                "Wyoming"};
    }

    public static void main(String[] args) {
        ArrayList<State> states = new ArrayList<>();
        File file = new File("electoral_data.csv");
        try {
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                String stateName = data[0];
                int electoralVotes = Integer.parseInt(data[1]);
                String party = data[2];
                State state = new State(stateName, electoralVotes, party);
                states.add(state);


            }
            System.out.println(states.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        }
            }












