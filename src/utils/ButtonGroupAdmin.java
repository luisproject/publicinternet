package utils;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
/**
 *
 * @author vuongluis
 */
public class ButtonGroupAdmin {
    public Boolean getText(ButtonGroup btAdmin){
        Boolean outString = false;
        Enumeration<AbstractButton> el = btAdmin.getElements();
        while(el.hasMoreElements()){
            AbstractButton btGT = el.nextElement();
            if(btGT.isSelected()){
                outString = btGT.isSelected();
            }
        }
        return outString;
    }
    public void setText(ButtonGroup btAdmin,Boolean isAdmin){
        Enumeration<AbstractButton> el = btAdmin.getElements();
        while (el.hasMoreElements()) {
            AbstractButton btGT = el.nextElement();
            if(btGT.isSelected()==isAdmin){
                btGT.setSelected(isAdmin);
            }
        }
    }
}
