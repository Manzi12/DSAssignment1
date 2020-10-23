import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class Table extends JTable {

    private static final String[] COLUMN_NAMES = {"Tax Number", "First Name", "Last Name", "Job Tittle", "Salary", "Email"};
    private static final Object[][] DATA = new Object[][]{
            {1, "John", "Smith", "Clerk", "0", "email@email.com"},
            {2, "Lisa", "Smith", "Clerk", "110", "email2@email.com"},
            {3, "Joe", "Smith", "Cleaner", "200", "email3@email.com"},
    };

    public Table() {
        super(DATA, COLUMN_NAMES);
        JTableHeader header = this.getTableHeader();
        header.setBackground(Color.DARK_GRAY);
        header.setForeground(Color.WHITE);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int index_row, int index_col) {
        Component comp = super.prepareRenderer(renderer, index_row, index_col);
        if (isCellSelected(index_row, index_col)) {
            comp.setBackground(Color.CYAN);
        } else {
            if (index_row % 2 == 0) {
                comp.setBackground(Color.LIGHT_GRAY);
            } else {
                comp.setBackground(Color.WHITE);
            }
        }
        comp.setForeground(Color.BLACK);
        return comp;
    }
}
