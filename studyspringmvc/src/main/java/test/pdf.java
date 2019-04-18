package test;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf {
	public static void main(String[] args) {
		pdf pd= new pdf();
		//pd.text2pdf("", "");
		
	}
	public void text2pdf(String text,String pdf) throws DocumentException, IOException{
		BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		Font FontChinese = new Font(bfChinese, 12, Font.NORMAL);


		FileOutputStream out = new FileOutputStream(pdf);

		Rectangle rect = new Rectangle(PageSize.A4.rotate());
		Document doc = new Document(rect);
		PdfWriter writer = PdfWriter.getInstance(doc, out);
		doc.open();
		Paragraph p = new Paragraph();
		p.setFont(FontChinese);
		BufferedReader read = new BufferedReader(new FileReader(text));
		String line = read.readLine();
		while(line != null){
		System.out.println(line);
		p.add(line+"\n");
		line = read.readLine();
		}
		read.close();

		doc.add(p);

		doc.close();

		}

}
