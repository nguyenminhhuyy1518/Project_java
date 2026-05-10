package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVmodel;
import model.thisinh;
import model.tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSV_controller;

import javax.swing.JRadioButton;

public class QLSVview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public QLSVmodel model;
	public JTextField Text_mathisinh;
	private JTable table;
	public JTable table_1;
	public JTextField text_dsts_mathisinh;
	public JTextField text_dsts_hovaten;
	public JTextField text_dsts_ngaysinh;
	public JTextField text_dsts_mon1;
	public JTextField text_dsts_mon2;
	public JTextField text_dsts_mon3;
	public JComboBox comboBox_quequan;
	public ButtonGroup bnt_gioitinh;
	public JComboBox comboBox_dsts_quequan;
	public JRadioButton rdbtnButton_nam;
	public JRadioButton rdbtnButton_nu;
	public JScrollPane scrollPane;
	public JButton btn_return;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVview frame = new QLSVview();
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
	public QLSVview() {
		setAutoRequestFocus(false);
		this.model = new QLSVmodel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 486);
		
		ActionListener action = new QLSV_controller(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setSelected(true);
		menuOpen.setHorizontalAlignment(SwingConstants.CENTER);
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setHorizontalAlignment(SwingConstants.CENTER);
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setHorizontalAlignment(SwingConstants.CENTER);
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutme = new JMenuItem("About me");
		menuAbout.add(menuAboutme);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LBquenquan = new JLabel("Quê quán");
		LBquenquan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBquenquan.setBounds(34, 10, 73, 17);
		contentPane.add(LBquenquan);
		
		JLabel LBmathisinh = new JLabel("Mã thí sinh");
		LBmathisinh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh.setBounds(258, 10, 73, 17);
		contentPane.add(LBmathisinh);
		
		Text_mathisinh = new JTextField();
		Text_mathisinh.setBounds(341, 10, 96, 18);
		contentPane.add(Text_mathisinh);
		Text_mathisinh.setColumns(10);
		
		JButton btn_search = new JButton("search");
		btn_search.addActionListener(action);
		btn_search.setBounds(487, 9, 84, 20);
		contentPane.add(btn_search);
		
		comboBox_quequan = new JComboBox();
		comboBox_quequan.setBounds(108, 9, 96, 18);
		ArrayList<tinh> listTinh = tinh.getDStinh();
		comboBox_quequan.addItem("");
		for (tinh tinh : listTinh) {
			comboBox_quequan.addItem(tinh.getTentinh());
		}
		contentPane.add(comboBox_quequan);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(34, 45, 537, 2);
		contentPane.add(separator_1);
		
		JLabel LBdanhsachthisinh = new JLabel("Danh sách thí sinh");
		LBdanhsachthisinh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBdanhsachthisinh.setBounds(34, 57, 129, 18);
		contentPane.add(LBdanhsachthisinh);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn","Qu\u00EA qu\u00E1n", "ngay sinh","Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(34, 80, 537, 140);
		contentPane.add(scrollPane);	
		
		JLabel LBmathisinh_1 = new JLabel("Mã thí sinh");
		LBmathisinh_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh_1.setBounds(34, 274, 73, 17);
		contentPane.add(LBmathisinh_1);
		
		text_dsts_mathisinh = new JTextField();
		text_dsts_mathisinh.setColumns(10);
		text_dsts_mathisinh.setBounds(117, 274, 96, 18);
		contentPane.add(text_dsts_mathisinh);
		
		JLabel LBdanhsachthisinh_1 = new JLabel("Danh sách thí sinh");
		LBdanhsachthisinh_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBdanhsachthisinh_1.setBounds(34, 246, 129, 18);
		contentPane.add(LBdanhsachthisinh_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(34, 230, 537, 8);
		contentPane.add(separator_2);
		
		JLabel LBmathisinh_1_1 = new JLabel("Họ và tên");
		LBmathisinh_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh_1_1.setBounds(34, 301, 73, 17);
		contentPane.add(LBmathisinh_1_1);
		
		text_dsts_hovaten = new JTextField();
		text_dsts_hovaten.setColumns(10);
		text_dsts_hovaten.setBounds(117, 301, 96, 18);
		contentPane.add(text_dsts_hovaten);
		
		JLabel LBquenquan_1 = new JLabel("Quê quán");
		LBquenquan_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBquenquan_1.setBounds(34, 329, 73, 17);
		contentPane.add(LBquenquan_1);
		
		comboBox_dsts_quequan = new JComboBox();
		comboBox_dsts_quequan.setBounds(117, 329, 96, 18);
		comboBox_dsts_quequan.addItem("");
		for (tinh tinh : listTinh) {
			comboBox_dsts_quequan.addItem(tinh.getTentinh());
		}
		contentPane.add(comboBox_dsts_quequan);
		
		JLabel LBmathisinh_1_1_1 = new JLabel("Ngày sinh");
		LBmathisinh_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh_1_1_1.setBounds(34, 356, 73, 17);
		contentPane.add(LBmathisinh_1_1_1);
		
		text_dsts_ngaysinh = new JTextField();
		text_dsts_ngaysinh.setColumns(10);
		text_dsts_ngaysinh.setBounds(117, 356, 96, 18);
		contentPane.add(text_dsts_ngaysinh);
		
		JLabel LBmathisinh_1_2 = new JLabel("Giới tính");
		LBmathisinh_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh_1_2.setBounds(258, 274, 73, 17);
		contentPane.add(LBmathisinh_1_2);
		
		rdbtnButton_nam = new JRadioButton("Nam");
		rdbtnButton_nam.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		rdbtnButton_nam.setBounds(341, 274, 47, 20);
		contentPane.add(rdbtnButton_nam);
		
		rdbtnButton_nu = new JRadioButton("Nữ");
		rdbtnButton_nu.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		rdbtnButton_nu.setBounds(390, 274, 54, 20);
		contentPane.add(rdbtnButton_nu);
		
		bnt_gioitinh = new ButtonGroup();
		bnt_gioitinh.add(rdbtnButton_nam);
		bnt_gioitinh.add(rdbtnButton_nu);
		
		JLabel LBmathisinh_1_1_2 = new JLabel("Môn 1");
		LBmathisinh_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh_1_1_2.setBounds(258, 301, 73, 17);
		contentPane.add(LBmathisinh_1_1_2);
		
		text_dsts_mon1 = new JTextField();
		text_dsts_mon1.setColumns(10);
		text_dsts_mon1.setBounds(341, 301, 96, 18);
		contentPane.add(text_dsts_mon1);
		
		JLabel LBmathisinh_1_1_2_1 = new JLabel("Môn 2");
		LBmathisinh_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh_1_1_2_1.setBounds(258, 329, 73, 17);
		contentPane.add(LBmathisinh_1_1_2_1);
		
		text_dsts_mon2 = new JTextField();
		text_dsts_mon2.setColumns(10);
		text_dsts_mon2.setBounds(341, 329, 96, 18);
		contentPane.add(text_dsts_mon2);
		
		JLabel LBmathisinh_1_1_2_2 = new JLabel("Môn 3");
		LBmathisinh_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		LBmathisinh_1_1_2_2.setBounds(258, 356, 73, 17);
		contentPane.add(LBmathisinh_1_1_2_2);
		
		text_dsts_mon3 = new JTextField();
		text_dsts_mon3.setColumns(10);
		text_dsts_mon3.setBounds(341, 356, 96, 18);
		contentPane.add(text_dsts_mon3);
		
		JButton btn_add = new JButton("Thêm");
		btn_add.setBounds(34, 397, 84, 20);
		btn_add.addActionListener(action);
		contentPane.add(btn_add);
		
		JButton btn_delete = new JButton("Xóa");
		btn_delete.setBounds(144, 397, 84, 20);
		btn_delete.addActionListener(action);
		contentPane.add(btn_delete);
		
		JButton btn_update = new JButton("Cập nhập");
		btn_update.setBounds(258, 397, 96, 20);
		btn_update.addActionListener(action);
		contentPane.add(btn_update);
		
		JButton btn_save = new JButton("Lưu");
		btn_save.setBounds(381, 397, 84, 20);
		btn_save.addActionListener(action);
		contentPane.add(btn_save);
		
		btn_return = new JButton("Hủy bỏ");
		btn_return.addActionListener(action);
		btn_return.setBounds(487, 397, 84, 20);
		btn_return.addActionListener(action);
		contentPane.add(btn_return);
		
		text_dsts_mathisinh.addActionListener(
				e -> text_dsts_hovaten.requestFocusInWindow()
		);

		text_dsts_hovaten.addActionListener(
				e -> text_dsts_ngaysinh.requestFocusInWindow()
		);
		
		text_dsts_ngaysinh.addActionListener(
				e->text_dsts_mon1.requestFocus()
		);
		
		text_dsts_mon1.addActionListener(
				e->text_dsts_mon2.requestFocus()
		);
		text_dsts_mon2.addActionListener(
				e->text_dsts_mon3.requestFocus()
		);
		
		setVisible(true);

	}
	
	
	
	public void xoa_from(){
		text_dsts_mathisinh.setText("");
		text_dsts_hovaten.setText("");
		text_dsts_ngaysinh.setText("");
		text_dsts_mon1.setText("");
		text_dsts_mon2.setText("");
		text_dsts_mon3.setText("");
		comboBox_dsts_quequan.setSelectedIndex(0);
		bnt_gioitinh.clearSelection();
	}

	public void themthisinh(thisinh ts) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// TODO Auto-generated method stub
		DefaultTableModel model_table = (DefaultTableModel) table_1.getModel();
		model_table.addRow(new Object[] {
				ts.getMathisinh()+"",
				ts.getTenthisinh(),
				ts.getQuequan().getTentinh(),
				sdf.format(ts.getNgaysinh()),
				(ts.isGioitinh()?"Nam":"Nữ"),
				ts.getDiemMon1()+"",
				ts.getDiemMon2()+"",
				ts.getDiemMon3()+" "
				});
		
	}

	public void capnhapthisinh(thisinh ts) {
		int row = table_1.getSelectedRow();

	    if(row != -1) {

	        DefaultTableModel model =
	                (DefaultTableModel) table_1.getModel();

	        SimpleDateFormat sdf =
	                new SimpleDateFormat("dd/MM/yyyy");

	        model.setValueAt(ts.getMathisinh(), row, 0);
	        model.setValueAt(ts.getTenthisinh(), row, 1);
	        model.setValueAt(ts.getQuequan().getTentinh(), row, 2);
	        model.setValueAt(sdf.format(ts.getNgaysinh()), row, 3);
	        model.setValueAt(
	                ts.isGioitinh() ? "Nam" : "Nữ",
	                row,
	                4
	        );
	        model.setValueAt(ts.getDiemMon1(), row, 5);
	        model.setValueAt(ts.getDiemMon2(), row, 6);
	        model.setValueAt(ts.getDiemMon3(), row, 7);
	    }
	
	}
	
	public void hienthithongtinthisinh() {
		DefaultTableModel model_table = (DefaultTableModel) table_1.getModel();
		int i_row = table_1.getSelectedRow();
		
		int mts = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		//private String tenthisinh;
		String hoten = model_table.getValueAt(i_row, 1)+"";
		//private tinh quequan;
		tinh t = tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
		//private Date ngaysinh;
		//Date ngaysinh = new Date(this.view.text_dsts_ngaysinh.getText());
		Date ngaysinh = null;

		try {
		    String ns = model_table.getValueAt(i_row, 3)+"";

		    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		    sdf.setLenient(false);

		    ngaysinh = sdf.parse(ns);

		} catch (ParseException e1) {
		    JOptionPane.showMessageDialog(null, "Ngày sinh không đúng định dạng dd/MM/yyyy");
		}
		
		String gioiTinh = model_table.getValueAt(i_row, 4).toString();
		 
		//private float diemMon1,diemMon2,diemMon3;
		float diemmon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemmon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemmon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		
		this.text_dsts_mathisinh.setText(mts+"");
		this.text_dsts_hovaten.setText(hoten+"");
		this.comboBox_dsts_quequan.setSelectedItem(t.getTentinh());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.text_dsts_ngaysinh.setText(sdf.format(ngaysinh));
		if(gioiTinh.equals("Nam")) {
		    rdbtnButton_nam.setSelected(true);
		} else {
		    rdbtnButton_nu.setSelected(true);
		}
		this.text_dsts_mon1.setText(diemmon1+"");
		this.text_dsts_mon2.setText(diemmon2+"");
		this.text_dsts_mon3.setText(diemmon3+"");
	}
	
	public void xoa() {
		DefaultTableModel model_table = (DefaultTableModel) table_1.getModel();
		int i_row = table_1.getSelectedRow();

		    if(i_row != -1) {

		    	model_table.removeRow(i_row);

		    } else {

		        JOptionPane.showMessageDialog(
		            null, 
		            "Vui lòng chọn dòng cần xóa"
		        );
		    }
	}
	public void timkiem(String quequan, String ten) {
		
	}
}
