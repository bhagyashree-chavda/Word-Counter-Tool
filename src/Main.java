import PACKAGE_NAME.WordCount;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String filePath = "resources" + File.separator + "info.txt";
        WordCount wordCount = new WordCount(filePath);
        wordCount.count();
        wordCount.printStatus();
        System.out.println("\nRunning again on same object...\n");
        wordCount.count();  // ✅ will reset and recount
        wordCount.printStatus();


    }
}