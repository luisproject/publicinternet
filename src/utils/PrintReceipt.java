package utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.text.AttributedString;
import java.util.ArrayList;

import model.bean.DichVuDung;

@SuppressWarnings("all")
public class PrintReceipt {
	
	private final static int POINTS_PER_INCH = 72;
	private ArrayList<DichVuDung> listDVD = new ArrayList<DichVuDung>();
	private String phiDVD; 
	
	public PrintReceipt(ArrayList<DichVuDung> listDVD, String phiDVD) {
		// TODO Auto-generated constructor stub
		PrinterJob printJob = PrinterJob.getPrinterJob();
		Book book = new Book();
	    PageFormat documentPageFormat = new PageFormat();
	    documentPageFormat.setOrientation(PageFormat.PORTRAIT);
	    book.append(new Document(listDVD,phiDVD), documentPageFormat);
	    printJob.setPageable(book);
	    printJob.setPageable(book);
	    
	    if (printJob.printDialog()) {
	      try {
	        printJob.print();
	      } catch (Exception PrintException) {
	        PrintException.printStackTrace();
	      }
	    }
	}
}
