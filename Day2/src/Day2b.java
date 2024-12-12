import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day2b {
    
    public static void main(String[] args) {
        // Initialize a list to store the reports
        List<String> reports = new ArrayList<>();
        
        // Read input file
        try {
            // Create a file object for input.txt
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            
            // Read each line of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim(); // Read the next line and trim leading/trailing spaces
                reports.add(line); // Add the line to the reports list
            }
            
            scanner.close(); // Close the scanner after reading all lines
            
        } catch (FileNotFoundException e) {
            // Handle case where the file is not found
            System.err.println("File not found: " + e.getMessage());
            return;
        }
        
        int safeCount = 0;
        
        // Process each report
        for (String report : reports) {
            String[] levelsStr = report.split(" "); // Split by spaces
            int[] levels = new int[levelsStr.length];
            
            // Convert the string levels to integers
            for (int i = 0; i < levelsStr.length; i++) {
                levels[i] = Integer.parseInt(levelsStr[i]);
            }
            
            // Check if the report is safe or if removing one level makes it safe
            if (isSafe(levels) || canBeMadeSafeByRemovingOneLevel(levels)) {
                safeCount++;
            }
        }
        
        // Output the count of safe reports
        System.out.println("Number of safe reports: " + safeCount);
    }
    
    // Method to check if a report is safe
    public static boolean isSafe(int[] levels) {
        // Check if the levels are either all increasing or all decreasing
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        
        // Check adjacent differences
        for (int i = 0; i < levels.length - 1; i++) {
            int diff = levels[i+1] - levels[i];
            
            // If the difference is not in the range of 1 to 3, return false
            if (Math.abs(diff) < 1 || Math.abs(diff) > 3) {
                return false;
            }
            
            // Determine if the sequence is increasing or decreasing
            if (diff > 0) {
                isDecreasing = false;
            } else if (diff < 0) {
                isIncreasing = false;
            }
        }
        
        // The sequence should be either all increasing or all decreasing
        return isIncreasing || isDecreasing;
    }

    // Method to check if removing a single level can make the report safe
    public static boolean canBeMadeSafeByRemovingOneLevel(int[] levels) {
        for (int i = 0; i < levels.length; i++) {
            // Create a new array without the current level (removing one level)
            int[] modifiedLevels = new int[levels.length - 1];
            int index = 0;
            for (int j = 0; j < levels.length; j++) {
                if (j != i) {
                    modifiedLevels[index++] = levels[j];
                }
            }
            
            // Check if this new array is safe
            if (isSafe(modifiedLevels)) {
                return true;
            }
        }
        return false;
    }
}
