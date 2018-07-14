package demo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;
import java.net.URL;

public class PDFCreateDemo {

	public static void main(String[] args) throws Exception{
			Document document = new Document();
			
		
				PdfWriter.getInstance(document, 
					new FileOutputStream("E:\\CoreJava.pdf"));
				
				document.open();
				
				document.add(new Paragraph("Welcome to IACADEMY"));
				
				document.add(new Phrase("This is sentence 1. "));
				document.add(new Phrase("This is sentence 2. "));
				document.add(new Phrase("This is sentence 3. "));
				document.add(new Phrase("This is sentence 4. "));
				document.add(new Phrase("This is sentence 5. "));
				document.add(new Phrase("This is sentence 6. "));
				
				//adding an image from URL
				
				String imageUrl = "http://i1.sndcdn.com/avatars-000096809773-8evvur-t500x500.jpg";
				Image image = Image.getInstance(new URL(imageUrl));
				document.add(image);
				
				document.add(new Paragraph(""));
				
				//adding an image from local machine
				image = 
					Image.getInstance("E:\\10488029_845038722184399_4646955521286705435_n.jpg");
				document.add(image);
				document.close();
				
			} 
			
				
}
				


