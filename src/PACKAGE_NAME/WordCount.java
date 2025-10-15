package PACKAGE_NAME;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    private String filePath;
    private int lineCount;
    private int wordCount;
    private int charCount;

    public WordCount(String filePath)
    {
        this.filePath = filePath;
        reset();
    }
    private void reset() {
        lineCount = 0;
        wordCount = 0;
        charCount = 0;
    }

     public void count()
     {
         reset();
         try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
         {
           String  line;
           while ((line = reader.readLine()) != null)
           {
               lineCount++;
               String[] words = line.trim().split("\\s");
               if(line.trim().isEmpty())
               {
                   continue;
               }
               wordCount += words.length;
               charCount += line.length();

           }
         }
         catch (FileNotFoundException e)
         {
             System.out.println("File not found" +filePath);
         }
         catch (IOException e )
         {
             System.out.println("An error occured" +filePath);
         }
     }
      public void printStatus()
      {
          System.out.println("Lines : " + lineCount);
          System.out.println("Words : " +wordCount);
          System.out.println("charactes " +charCount);
      }

}
