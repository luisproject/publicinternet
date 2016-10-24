package utils;

import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class ButtonGroupTT {
	public Boolean getText(ButtonGroup btTrangThai){
        Boolean outString = false;
        Enumeration<AbstractButton> el = btTrangThai.getElements();
        while(el.hasMoreElements()){
            AbstractButton btGT = el.nextElement();
            if(btGT.isSelected()){
                outString = btGT.isSelected();
            }
        }
        return outString;
    }
	public void setText(ButtonGroup btTrangThai,Boolean trangThai){
        Enumeration<AbstractButton> el = btTrangThai.getElements();
        while (el.hasMoreElements()) {
            AbstractButton btGT = el.nextElement();
            if(btGT.isSelected()==trangThai){
                btGT.setSelected(trangThai);
            }
        }
    }
}	
