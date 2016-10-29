package utils;

import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class ButtonGroupTT {
	public Boolean isSelected(ButtonGroup btTrangThai){
        String outString = "";
        Boolean result = false;
        Enumeration<AbstractButton> el = btTrangThai.getElements();
        while(el.hasMoreElements()){
            AbstractButton btGT = el.nextElement();
            if(btGT.isSelected()){
                outString = btGT.getText();
            }
        }
        switch(outString){
	        case "ON":
	        	result = true;
	        	break;
	        case "OFF":
	        	result = false;
	        	break;
        }
        return result;
    }
}	
