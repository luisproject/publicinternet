package utils;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
/**
 *
 * @author vuongluis
 */
public class ButtonGroupAdmin {
    public Boolean isSelect(ButtonGroup btAdmin){
        String outString = "";
        Boolean result = false;
        Enumeration<AbstractButton> el = btAdmin.getElements();
        while(el.hasMoreElements()){
            AbstractButton btadmin = el.nextElement();
            if(btadmin.isSelected()){
                outString = btadmin.getText();
            }
        }
        switch(outString){
	        case "Có":
	        	result = true;
	        	break;
	        case "Không":
	        	result = false;
	        	break;
        }
        return result;
    }
}
