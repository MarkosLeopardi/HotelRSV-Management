import com.toedter.calendar.JCalendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

public class DateSelectionHandler {

    public static void addDateSelectionFunctionality(JTextField dateField) {
        JCalendar calendar = new JCalendar();
        calendar.setMinSelectableDate(Calendar.getInstance().getTime()); // Set minimum selectable date

        // Create a pop-up for the calendar
        JPanel panel = new JPanel();
        panel.add(calendar);
        JPopupMenu popup = new JPopupMenu();
        popup.setLayout(new BorderLayout());
        popup.add(panel);

        dateField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                popup.show(dateField, 0, dateField.getHeight());
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });

        calendar.addPropertyChangeListener("calendar", evt -> {
            Calendar selectedDate = calendar.getCalendar();
            if (selectedDate != null) {
                dateField.setText(String.format("%tF", selectedDate.getTime()));
                popup.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Date Selection Example");
            JTextField textField = new JTextField(20);

            DateSelectionHandler.addDateSelectionFunctionality(textField);

            frame.setLayout(new FlowLayout());
            frame.add(textField);
            frame.setSize(400, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
