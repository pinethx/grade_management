package grade_management_program.component.form;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class StudentForm extends JPanel {
	private JTextField tFstdNo;
	private JTextField tFstdName;
	private JTextField tFNo;

	/**
	 * Create the panel.
	 */
	public StudentForm() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uD559\uC0DD \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblNo = new JLabel("번호");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNo);
		
		tFNo = new JTextField();
		add(tFNo);
		tFNo.setColumns(10);
		
		JLabel lblstdNo = new JLabel("학번");
		lblstdNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblstdNo);
		
		tFstdNo = new JTextField();
		add(tFstdNo);
		tFstdNo.setColumns(10);
		
		JLabel lblstdName = new JLabel("이름");
		lblstdName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblstdName);
		
		tFstdName = new JTextField();
		add(tFstdName);
		tFstdName.setColumns(10);
		
		JLabel lblcR = new JLabel("분반");
		lblcR.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblcR);
		
		JComboBox cbcR = new JComboBox();
		add(cbcR);

	}

}
