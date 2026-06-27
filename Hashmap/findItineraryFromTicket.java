
import java.util.*;

public class findItineraryFromTicket {

    // Function to find the starting point of the journey
    // The starting city is the one that never appears as a destination
    public static String startPoint(HashMap<String, String> tickets) {

        // Reverse map to store destination -> source
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Find the city that is not present in the reverse map
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    // Function to print the complete itinerary
    public static void iTneraryFromTickets(HashMap<String, String> tickets) {

        // Find the starting city
        String start = startPoint(tickets);

        // Print the starting city
        System.out.print(start);

        // Traverse and print the journey path
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
    }

    public static void main(String[] args) {

        // Creating a HashMap of source and destination cities
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Print the complete itinerary
        iTneraryFromTickets(tickets);
    }
}


