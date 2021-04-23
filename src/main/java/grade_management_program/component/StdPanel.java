package grade_management_program.component;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import grade_management_program.component.form.StudentForm;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class StdPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public StdPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		StudentForm pForm = new StudentForm();
		add(pForm);
		
		JPanel pBtn = new JPanel();
		add(pBtn);
		
		JButton btnAdd = new JButton("입력");
		pBtn.add(btnAdd);
		
		JButton btnDel = new JButton("취소");
		pBtn.add(btnDel);
		
		JPanel pContent = new JPanel();
		add(pContent);
		pContent.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		pContent.add(table);

	}

}
