package utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.text.AttributedString;
import java.util.ArrayList;

import model.bean.DichVuDung;

@SuppressWarnings("all")
public class Document implements Printable{
	
	private final static int POINTS_PER_INCH = 72;
	private ArrayList<DichVuDung> listDVD = new ArrayList<DichVuDung>();
	private String phiDVD;
	
	public Document(ArrayList<DichVuDung> listDVD, String phiDVD) {
		// TODO Auto-generated constructor stub
		this.listDVD = listDVD;
		this.phiDVD = phiDVD;
	}

	public int print(Graphics g, PageFormat pageFormat, int page) {

	      Graphics2D g2d = (Graphics2D) g;

	      g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
	      g2d.setPaint(Color.black);
	      g2d.setStroke(new BasicStroke(1));
	      g2d.draw(new Rectangle2D.Double(0, 0, pageFormat.getImageableWidth(), pageFormat.getImageableHeight()));
	      
	      // Print title of ...
	      printTitle(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
	      // Print description
	      printDescription(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
	      // Print line
	      // Notice line => template to draw object other
	      printLine(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
	      // Print name receipt
	      printTopic(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
	      // Print name computer
	      printCom(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
	      // Print name 
	      printLineBill(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
	      // Print line 
	      printtableHeader(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight());
	      
	      int index = 1;
	      float space = 5.8f;
	      int sumeofService = 0;
	      int temp = 1;
	      
	      for(DichVuDung obj : listDVD){
	    	    String titleInternet = new String();
		    	titleInternet = String.format("   %s%20s%15s%20s%20s",String.valueOf(index),String.valueOf(obj.getTenDichVu()),String.valueOf(obj.getDonGia()),String.valueOf(obj.getSoLuong()),String.valueOf(obj.getDonGia()*obj.getSoLuong()));
		    	temp += obj.getDonGia()*obj.getSoLuong(); 
		    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
		    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Verdana",Font.PLAIN, 10));
		    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
		    	  
		    	Point2D.Double pen = new Point2D.Double(pageFormat.getImageableWidth()/8 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
		    	double width = 7.5 * POINTS_PER_INCH;
		    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*space);
		    	index++;
		    	space += 0.4f;
	      }
	      sumeofService = temp+Integer.parseInt(phiDVD);
	      printCostCom(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight(),phiDVD,space,index);
	      printLineEnd(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight(),space);
	      printSumeValue(g2d,pageFormat.getImageableWidth(),pageFormat.getImageableHeight(),sumeofService,space);
	      return (PAGE_EXISTS);
	    }
	    
		private void printSumeValue(Graphics2D g2d, double pageWidth, double pageHeight,int sumeofValue,float space){
			String titleInternet = new String();
			titleInternet = String.format("                                                              Tổng tiền: "+LibraryString.changeCurrencyVND(String.valueOf(sumeofValue))+" VND");
	    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
	    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Verdana",Font.PLAIN, 10));
	    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	    	  
	    	Point2D.Double pen = new Point2D.Double(pageWidth/8 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	    	double width = 7.5 * POINTS_PER_INCH;
	    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*(space+0.8f));
		}
	
		private void printLineEnd(Graphics2D g2d, double pageWidth, double pageHeight,float space) {
			String titleInternet = new String();
	    	titleInternet = "------------------------------------------------------------------------------------------------";
	    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
	    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.BOLD, 12));
	    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	    	  
	    	Point2D.Double pen = new Point2D.Double(pageWidth/8 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	    	double width = 7.5 * POINTS_PER_INCH;
	    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*(space+0.4f));
		}
		
		private void printCostCom(Graphics2D g2d, double pageWidth, double pageHeight,String phiDVD,float space,int index){
			String titleInternet = new String();
			titleInternet = String.format(" %3s%20s%55s",index,"Sử dụng máy",phiDVD);
	    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
	    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Verdana",Font.PLAIN, 10));
	    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	    	  
	    	Point2D.Double pen = new Point2D.Double(pageWidth/8 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	    	double width = 7.5 * POINTS_PER_INCH;
	    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*space);
		}
	    private void printtableHeader(Graphics2D g2d, double pageWidth, double pageHeight) {
	    	String titleInternet = new String();
	    	titleInternet = "  STT              Tên                Đơn giá              Số lượng           Thành tiền";
	    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
	    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.BOLD, 12));
	    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	    	  
	    	Point2D.Double pen = new Point2D.Double(pageWidth/8 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	    	double width = 7.5 * POINTS_PER_INCH;
	    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*5.0f);
	    }
	    
	    private void printLineBill(Graphics2D g2d, double pageWidth, double pageHeight) {
	    	String titleInternet = new String();
	    	titleInternet = "------------------------------------------------------------------------------------------------";
	    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
	    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.BOLD, 12));
	    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	    	  
	    	Point2D.Double pen = new Point2D.Double(pageWidth/8 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	    	double width = 7.5 * POINTS_PER_INCH;
	    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*5.4f);
	    }
	    
	    private void printCom(Graphics2D g2d, double pageWidth, double pageHeight) {
	    	String titleInternet = new String();
	    	titleInternet = "                        MÁY 02";
	    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
	    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.BOLD, 12));
	    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	    	  
	    	Point2D.Double pen = new Point2D.Double(pageWidth/3 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	    	double width = 7.5 * POINTS_PER_INCH;
	    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*4.2f);
	    }
	    
	    private void printTopic(Graphics2D g2d, double pageWidth, double pageHeight) {
	    	String titleInternet = new String();
	    	titleInternet = "            PHIẾU THANH TOÁN";
	    	AttributedString titleInternetAttr = new AttributedString(titleInternet);
	    	titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.BOLD, 12));
	    	LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	    	  
	    	Point2D.Double pen = new Point2D.Double(pageWidth/3 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	    	double width = 7.5 * POINTS_PER_INCH;
	    	lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*3.4f);
	    }
	    
	    private void printLine(Graphics2D g2d, double pageWidth, double pageHeight) {
	      String titleInternet = new String();
	  	  titleInternet = "----------------------------------------------";
	  	  AttributedString titleInternetAttr = new AttributedString(titleInternet);
	  	  titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.PLAIN, 12));
	  	  LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
	  	  
	  	  Point2D.Double pen = new Point2D.Double(pageWidth/3 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
	  	  double width = 7.5 * POINTS_PER_INCH;
	  	  lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*2.6f);
	    }
	    
		private void printDescription(Graphics2D g2d, double pageWidth, double pageHeight) {
		  String titleInternet = new String();
		  titleInternet = "54 Nguyễn Lương Bằng, Hòa Khánh Bắc, Liên Chiểu, Đà Nẵng";
		  AttributedString titleInternetAttr = new AttributedString(titleInternet);
		  titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.ITALIC, 12));
		  LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
		  
		  Point2D.Double pen = new Point2D.Double(pageWidth/5 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
		  double width = 7.5 * POINTS_PER_INCH;
		  lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y*1.8f);
		}

		private void printTitle(Graphics2D g2d, double pageWidth, double pageHeight) {
		  String titleInternet = new String();
		  titleInternet = "Võ Lâm Hội Quán";
		  AttributedString titleInternetAttr = new AttributedString(titleInternet);
		  titleInternetAttr.addAttribute(TextAttribute.FONT, new Font("Times New Roman",Font.BOLD, 24));
		  LineBreakMeasurer lineBreakerAttr = new LineBreakMeasurer(titleInternetAttr.getIterator(), new FontRenderContext(null, true, true));
		  
		  Point2D.Double pen = new Point2D.Double(pageWidth/3 - 0.25 * POINTS_PER_INCH,0.35 * POINTS_PER_INCH);
		  double width = 7.5 * POINTS_PER_INCH;
		  lineBreakerAttr.nextLayout((float) width).draw(g2d, (float) pen.x, (float) pen.y);
		}
}
