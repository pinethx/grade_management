package grade_management_program.component.form;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class ScoreForm extends JPanel {
	private JTextField tFstdNo;
	private JTextField tFstdName;
	private JTextField tFsubScore;

	/**
	 * Create the panel.
	 */
	public ScoreForm() {
		setBorder(new TitledBorder(null, "\uC810\uC218 \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblstdNo = new JLabel("번호");
		lblstdNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblstdNo);
		
		tFstdNo = new JTextField();
		add(tFstdNo);
		tFstdNo.setColumns(10);
		
		JLabel lblstdName = new JLabel("학번");
		lblstdName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblstdName);
		
		tFstdName = new JTextField();
		add(tFstdName);
		tFstdName.setColumns(10);
		
		JLabel lblsubcode = new JLabel("과목코드");
		lblsubcode.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblsubcode);
		
		JComboBox cbsubcode = new JComboBox();
		add(cbsubcode);
		
		JLabel lblsubScore = new JLabel("점수");
		lblsubScore.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblsubScore);
		
		tFsubScore = new JTextField();
		add(tFsubScore);
		tFsubScore.setColumns(10);

	}

}
