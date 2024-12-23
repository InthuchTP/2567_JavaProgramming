import javax.swing.*;


public class Lab501_1 {
	

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptWasFound = false;
		String dept = JOptionPane.showInputDialog("Enter a departmant name");
		for(int i=1 ; i < deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}
		
		if(deptWasFound) {
			JOptionPane.showMessageDialog(null, dept+" was found in the list");
		}else {
			JOptionPane.showMessageDialog(null, dept+" wasn't found in the list");

		}

	}
}	
	