package stream;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

//���� ���α׷��� ��θ� ������ ���۾����� �Է��ϱ� ���� ������ �ټ� �ִ� ��� �� ������ ����
public class FileChosserApp extends JFrame {
	JButton bt,bt2;
	JFileChooser chooser;
	public FileChosserApp() {
		setLayout(new FlowLayout());
		
		add(bt = new JButton("����"));
		add(bt2 = new JButton("����"));
		
		chooser = new JFileChooser(); //�ν��Ͻ��� �̸� ����� ���� 
		
		setSize(300,120);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����Ž���⸦ �������!!
				openFile();
			}
		});
		//�����ư ������...
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����Ž���⸦ �������!!
				saveFile();
			}
		});
	}
	
	public void openFile() {
		int choose = chooser.showOpenDialog(this);
		
		//���� Ž���⿡ ���� ������ ���ð���� �ֻ��غ���!!
		//����� 0, ��Ҵ� 1 : ���������� ���ϹǷ�, ���ڸ� �ϱ��ϱ� ���ٴ� ���� �̹� ������ ����� �̿��ϸ� �������̴�!!
		System.out.println(choose); //Ȯ�� ��� ��ư�� ��� ���
		if(choose==JFileChooser.APPROVE_OPTION) {
			System.out.println("���ϼ����ޱ���");
			//������ ������ �������� ���!!
			//���� ���������� �翬�� �����������˰��ֵ� ���� �޼��带 �����غ���
			File file = chooser.getSelectedFile();
			//����ڰ� ������ ������ Ǯ ���!
			String selectedPath = file.getAbsolutePath();
			System.out.println("����� ������ ������"+selectedPath);
		}else if(choose == JFileChooser.CANCEL_OPTION) {
			System.out.println("����ޱ���");
		}
	}

	//����� Ž���� �����!!
	public void saveFile() {
		chooser.showSaveDialog(this);
	}
	
	public static void main(String[] args) {
		new FileChosserApp();
	}
}
