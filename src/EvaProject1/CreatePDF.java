package EvaProject1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {
//private static final String INDEX_DIR= "C:\\Users\\Lenovo\\eclipse-workspace\\Evaluate1\\document.pdf";
	public static void main(String[] args) throws IOException {

		try {
        Scanner sc=new Scanner(System.in);
        String Name;
			int i = 0;
			while (i <= 100) {
				i++;
				// Create a new document
				Document document = new Document();

				// Create a PDF writer
				PdfWriter.getInstance(document, new FileOutputStream("document.pdf" + i + ".pdf"));

				// Open the document
				document.open();
				System.out.println("write to your document ?");
				boolean flag=true;
				while(flag) {
					Name=sc.nextLine();

					// Add some content
					document.add(new Paragraph(" "+Name));
					System.out.println("do you wnat to add another word ?y/n");
					if(sc.nextLine().equals("y")) {
						flag=true;
						System.out.println(Name);
					}
					else {flag=false;}
				}
			
				

				// Close the document
				document.close();

			}
		} catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("itext PDF program executed");

	}
}
//String input_path = ("C:\\Users\\Lenovo\\eclipse-workspace\\Evaluate1\\document.pdf");
