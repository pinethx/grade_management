package grade_management_program.component;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class InsertGradeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public InsertGradeFrame() {
		initialize();
	}

	private void initialize() {
		setTitle("학생 성적 입력");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("학생 성적 입력");
		pNorth.add(lblNewLabel);
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		pSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnInsert = new JButton("입력");
		pSouth.add(btnInsert);
		
		JButton btnDelete = new JButton("삭제");
		pSouth.add(btnDelete);
		
		JPanel pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pStd = new JPanel();
		pCenter.add(pStd);
		pStd.setLayout(new GridLayout(5, 2, 5, 10));
		
		JLabel lblNo = new JLabel("학번");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pStd.add(lblNo);
		
		textField = new JTextField();
		pStd.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pStd.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		pStd.add(textField_1);
		
		JLabel lblClass = new JLabel("분반");
		lblClass.setHorizontalAlignment(SwingConstants.RIGHT);
		pStd.add(lblClass);
		
		JComboBox comboBox = new JComboBox();
		pStd.add(comboBox);
		
		JPanel pScr = new JPanel();
		pCenter.add(pScr);
		pScr.setLayout(new GridLayout(1, 0, 0, 0));
	}

}
