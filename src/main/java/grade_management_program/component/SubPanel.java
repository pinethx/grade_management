package grade_management_program.component;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import grade_management_program.component.form.SubjectForm;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class SubPanel extends JPanel {
	private JTable table;

	public SubPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		SubjectForm pForm = new SubjectForm();
		add(pForm);
		
		JPanel pBtn = new JPanel();
		add(pBtn);
		
		JButton btnAdd = new JButton("추가");
		pBtn.add(btnAdd);
		
		JButton btnDel = new JButton("삭제");
		pBtn.add(btnDel);
		
		JPanel pContent = new JPanel();
		add(pContent);
		pContent.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		pContent.add(table);

	}

}
