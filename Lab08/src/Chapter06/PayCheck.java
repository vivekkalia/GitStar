package Chapter06;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class PayCheck {

    public static void main(String[] args) {
        int hoursWorked;
        double wage;
        double totalPayCheck;
        String hrsWorkedStr;
        String wageStr;

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        wageStr = JOptionPane.showInputDialog("Enter your wage: ");
        wage = Double.parseDouble(wageStr);
        
        hrsWorkedStr = JOptionPane.showInputDialog("Enter hours worked: ");
        hoursWorked = Integer.parseInt(hrsWorkedStr);
        
        if (hoursWorked <= 40) {
            totalPayCheck = wage*hoursWorked;
        } else {
            totalPayCheck = (wage*40) + ((wage*1.5)*(hoursWorked-40));
        }
        
        JOptionPane.showMessageDialog(null, fmt.format(totalPayCheck));   
        
    }
    
}
