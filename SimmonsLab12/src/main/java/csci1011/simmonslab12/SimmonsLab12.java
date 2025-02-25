package csci1011.simmonslab12;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;

/**
 *CSCI 1011 Lab 12
 * @author Brandon Simmons
 * Description: A tool to allow a user to create, write to, append, and read a file.
 */
public class SimmonsLab12 {

    public static void main(String[] args) {
        
        String fileName = "myfile.txt";
        
        PrintWriter outFile;
        
        outFile = openFileForWriting(fileName);
        System.out.println("Opened file " + fileName + " for writing.");
        //outFile.println("This is line 1");
        //outFile.println("This is line 2");
        int linesWritten = writeLinesToFile(outFile);
        System.out.println("Wrote " + linesWritten + " lines to " + fileName + ".");
        outFile.close();
        
        outFile = openFileForAppending(fileName);
        System.out.println("Opened file " + fileName + " for appending.");
        //outFile.println("Appending line 3");
        //outFile.println("Appending line 4");
        int linesAppended = writeLinesToFile(outFile);
        System.out.println("Appended " + linesAppended + " lines in " + fileName + ".");
        outFile.close();
        
        Scanner inputFile;
        inputFile = openFileForReading(fileName);
        System.out.println("Opened file " + fileName + " for reading.");
        int linesRead = readLinesFromFile(inputFile);
        System.out.println("Read " + linesRead + " lines from " + fileName + ".");
        inputFile.close();
        
    }
    
    //Opens the file to write to it, or error message if not.
    public static PrintWriter openFileForWriting(String fileName)
    {
        PrintWriter outputFile = null;
        
        try
        {
            outputFile = new PrintWriter(fileName);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("404: File Not Found");
            System.exit(0);
        }
        
        return outputFile;
    }
    
    //Opens the file to append to it, or error message if not.
    public static PrintWriter openFileForAppending(String fileName)
    {
        PrintWriter outputFile = null;
        
        try
        {
            outputFile = new PrintWriter(new FileOutputStream(fileName,true));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("404: File Not Found");
            System.exit(0);
        }
        
        return outputFile;
    }
    
    //Opens the file to read it, or error message if not.
    public static Scanner openFileForReading(String fileName)
    {
        Scanner inputFile = null;
        
        try
        {
            inputFile = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("404: File Not Found");
            System.exit(0);
        }
        
        return inputFile;
    }
    
    //Reads from the file and keeps track of # of lines read
    public static int readLinesFromFile(Scanner inputFile)
    {
        int linesRead = 0;
        while(inputFile.hasNextLine())
        {
            String line = inputFile.nextLine();
            System.out.println(line);
            linesRead++;
        }
        
        return linesRead;
    }
    
    //This allows the user to write to the file
    public static int writeLinesToFile(PrintWriter outputFile)
    {
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        int linesWritten = 0;
        
        System.out.println("Enter the text you want to write to the file.");
        System.out.println("Enter a blank line when you are done.");
        
        do
        {
            line = keyboard.nextLine();
            if (line.length() > 0)
            {
                outputFile.println(line);
                linesWritten++;
            }
            
        } while (line.length() > 0);
        
        return linesWritten;
    }
    
    
    
    
}
