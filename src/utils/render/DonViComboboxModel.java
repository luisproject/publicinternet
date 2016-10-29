package utils.render;

import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

@SuppressWarnings("all")
public class DonViComboboxModel implements ComboBoxModel{

	private ArrayList<String> alItems = new ArrayList<String>();
    private Object object = new Object();	
	
    public DonViComboboxModel(){
        alItems.add("Chai");
        alItems.add("Ly");
        alItems.add("Lon");
        object = alItems.get(0);
    }
    
    public DonViComboboxModel(String temp){
        alItems.add("Chai");
        alItems.add("Ly");
        alItems.add("Lon");
        switch(temp){
            case "Chai":
                object = alItems.get(0);
                break;
            case "Ly":
                object = alItems.get(1);
                break;
            case "Lon":
            	break;
            default:
               object = alItems.get(0);
        }
    }    	

	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		return alItems.get(index);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return alItems.size();
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return object;
	}

	@Override
	public void setSelectedItem(Object item) {
		// TODO Auto-generated method stub
		object = item;	
	}
	
	@Override
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub
		
	}
}
