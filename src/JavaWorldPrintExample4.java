/**
 * Class: Example4
 * <p>
 * 
 * Example of using the TextLayout class to format a text paragraph.
 * <p>
 * 
 * @author Jean-Pierre Dube <jpdube@videotron.ca>
 * @version 1.0
 * @since 1.0
 */

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

@SuppressWarnings("all")
public class JavaWorldPrintExample4 {
  public static void main(String[] args) {
    JavaWorldPrintExample4 example = new JavaWorldPrintExample4();
    System.exit(0);
  }

  //--- Private instances declarations
  private final static int POINTS_PER_INCH = 72;
  public JavaWorldPrintExample4() {

    //--- Create a new PrinterJob object
    PrinterJob printJob = PrinterJob.getPrinterJob();

    //--- Create a new book to add pages to
    Book book = new Book();
 
    //--- Add the document page using a landscape page format
    PageFormat documentPageFormat = new PageFormat();
    documentPageFormat.setOrientation(PageFormat.PORTRAIT);
    book.append(new Document(), documentPageFormat);

    //--- Tell the printJob to use the book as the pageable object
    printJob.setPageable(book);
    
    if (printJob.printDialog()) {
      try {
        printJob.print();
      } catch (Exception PrintException) {
        PrintException.printStackTrace();
      }
    }
  }
  private class Document implements Printable {
    public int print(Graphics g, PageFormat pageFormat, int page) {

      Graphics2D g2d = (Graphics2D) g;

      g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
      g2d.setPaint(Color.black);
      g2d.setStroke(new BasicStroke(1));
      g2d.draw(new Rectangle2D.Double(0, 0, pageFormat.getImageableWidth(), pageFormat.getImageableHeight()));
      
      
      print(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
      
      
      String text = new String();
      text += "Manipulating raw fonts would be too complicated to render paragraphs of ";
      
      Point2D.Double pen = new Point2D.Double(0.25 * POINTS_PER_INCH,0.25 * POINTS_PER_INCH);
      double width = 7.5 * POINTS_PER_INCH;
      AttributedString paragraphText = new AttributedString(text);
      paragraphText.addAttribute(TextAttribute.FONT, new Font("serif",Font.PLAIN, 12));

      LineBreakMeasurer lineBreaker = new LineBreakMeasurer(paragraphText.getIterator(), new FontRenderContext(null, true, true));
      TextLayout layout;
      while ((layout = lineBreaker.nextLayout((float) width)) != null) {
    	pen.y += layout.getAscent();
        layout.draw(g2d, (float) pen.x, (float) pen.y);
        pen.y += layout.getDescent() + layout.getLeading();
      }
      return (PAGE_EXISTS);
    }

	private void print(Graphics2D g2d, double pageWidth, double pageHeight) {
	  String titleInternet = new String();
	  titleInternet = "Inet 7.0";
	  AttributedString titleInternetAttr = new AttributedString(titleInternet);
	  titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Helvetica Neue",Font.BOLD, 24));
	  LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	  
	  Point2D.Double pen = new Point2D.Double(pageWidth/3 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	  double width = 7.5 * POINTS_PER_INCH;
	  lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y);
	}
  }
} 
