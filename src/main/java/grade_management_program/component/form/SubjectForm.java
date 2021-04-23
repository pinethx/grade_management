package grade_management_program.component.form;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class SubjectForm extends JPanel {
	private JTextField tFSubNo;
	private JTextField tFSubName;

	/**
	 * Create the panel.
	 */
	public SubjectForm() {
		setBorder(new TitledBorder(null, "\uACFC\uBAA9 \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblSubNo = new JLabel("과목코드");
		lblSubNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblSubNo);
		
		tFSubNo = new JTextField();
		add(tFSubNo);
		tFSubNo.setColumns(10);
		
		JLabel lblSubName = new JLabel("과목이름");
		lblSubName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblSubName);
		
		tFSubName = new JTextField();
		add(tFSubName);
		tFSubName.setColumns(10);

	}

}
