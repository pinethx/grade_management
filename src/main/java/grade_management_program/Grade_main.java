package grade_management_program;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import grade_management_program.ui.ConfirmAllGradeFrame;
import grade_management_program.ui.ConfirmClassGradeFrame;
import grade_management_program.ui.InsertFormFrame;

@SuppressWarnings("serial")
public class Grade_main extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnInsert;
	private JButton btnConfirmClass;
	private JButton btnconfirmAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grade_main frame = new Grade_main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grade_main() {
		initialize();
	}
	private void initialize() {
		setTitle("성적 관리 프로그램");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pMenu = new JPanel();
		contentPane.add(pMenu, BorderLayout.NORTH);
		
		btnInsert = new JButton("정보 관리");
		btnInsert.addActionListener(this);
		pMenu.add(btnInsert);
		
		btnConfirmClass = new JButton("분반별 성적 확인");
		btnConfirmClass.addActionListener(this);
		pMenu.add(btnConfirmClass);
		
		btnconfirmAll = new JButton("전체 성적 확인");
		btnconfirmAll.addActionListener(this);
		pMenu.add(btnconfirmAll);
		
		JScrollPane sPList = new JScrollPane();
		contentPane.add(sPList, BorderLayout.CENTER);
		
		JList list = new JList();
		sPList.setViewportView(list);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnconfirmAll) {
			actionPerformedBtnconfirmAll(e);
		}
		if (e.getSource() == btnConfirmClass) {
			actionPerformedBtnConfirmClass(e);
		}
		if (e.getSource() == btnInsert) {
			actionPerformedBtnInsert(e);
		}
	}
	protected void actionPerformedBtnInsert(ActionEvent e) {
		InsertFormFrame frame = new InsertFormFrame();
		frame.setTitle("성적입력");
		frame.setVisible(true);
	}
	protected void actionPerformedBtnConfirmClass(ActionEvent e) {
		ConfirmClassGradeFrame frame = new ConfirmClassGradeFrame();
		frame.setTitle("분반별성적확인");
		frame.setVisible(true);
	}
	protected void actionPerformedBtnconfirmAll(ActionEvent e) {
		ConfirmAllGradeFrame frame = new ConfirmAllGradeFrame();
		frame.setTitle("전체성적확인");
		frame.setVisible(true);
	}
}
