package grade_management_program.component.form;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class ClassRForm extends JPanel {
	private JTextField tFClassR;
	
	public ClassRForm() {
		setBorder(new TitledBorder(null, "\uBD84\uBC18 \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblClassR = new JLabel("분반");
		lblClassR.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblClassR);
		
		tFClassR = new JTextField();
		add(tFClassR);
		tFClassR.setColumns(10);

	}

}
