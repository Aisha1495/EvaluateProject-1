package EvaProject1;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {

	public static void main(String[] args) {
		 try {
		      // Create a new document
		      Document document = new Document();

		      // Create a PDF writer
		      PdfWriter.getInstance(document, new FileOutputStream("document.pdf"));

		      // Open the document
		      document.open();

		      // Add some content
		      document.add(new Paragraph("Hello, World!"));

		      // Close the document
		      document.close();
		    } catch (Exception e) {
		      e.printStackTrace();
		      
		    }
		  }
		}

