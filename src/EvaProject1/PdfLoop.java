package EvaProject1;


import java.io.File;
import java.io.IOException;
public class PdfLoop {

	public static void main(String[] args) {
		
	      // Load the PDF document
        File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Evaluate1\\document.pdf");
      

        // Get the number of pages
        int numPages = 100;
        numPages = document.getNumberOfPages();

        // Loop through the pages
        for (int i = 0; i < numPages; i++) {
            PDPage page = document.getPage(i);
            // Do something with the page here
            // ...
        }

        // Close the document
        document.close();
    }
}
	

	}

}
