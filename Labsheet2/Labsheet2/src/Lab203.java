import java.text.DecimalFormat;

import javax.swing.*;

public class Lab203 {
    public static void main(String[] args) {
    	DecimalFormat frm = new DecimalFormat("##.#");
        // รับค่าน้ำหนักจากผู้ใช้
        String weightInput = JOptionPane.showInputDialog(null, "Input Weight (kg):");
        double weight = Double.parseDouble(weightInput);

        // รับค่าส่วนสูงจากผู้ใช้
        String heightInput = JOptionPane.showInputDialog(null, "Input Height (cm):");
        double heightCm = Double.parseDouble(heightInput);

        // แปลงส่วนสูงจากเซนติเมตรเป็นเมตร
        double heightMeter = heightCm / 100;

        // คำนวณค่า BMI
        double bmi = weight / (heightMeter * heightMeter);

        // ตรวจสอบระดับ BMI
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
            JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            bmiCategory = "Normal-weight";
            JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            bmiCategory = "Overweight";
            JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
        } else {
            bmiCategory = "Obesity";
            JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi) +"\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
        }


    }
}