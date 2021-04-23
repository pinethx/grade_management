package grade_management_program.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import grade_management_program.component.ClassPanel;
import grade_management_program.component.ScorePanel;
import grade_management_program.component.StdPanel;
import grade_management_program.component.SubPanel;

@SuppressWarnings("serial")
public class InsertFormFrame extends JFrame {

	private JPanel contentPane;

	public InsertFormFrame() {
		setTitle("정보 관리");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		SubPanel pSub = new SubPanel();
		tabbedPane.addTab("과목 정보", null, pSub, "과목 정보");
		
		ClassPanel pClass = new ClassPanel();
		tabbedPane.addTab("분반 정보", null, pClass, "분반 정보");
		
		StdPanel pStd = new StdPanel();
		tabbedPane.addTab("학생 정보", null, pStd, "학생 정보");
		
		ScorePanel pScore = new ScorePanel();
		tabbedPane.addTab("성적 정보", null, pScore, "성적 정보");
		
	}

}
