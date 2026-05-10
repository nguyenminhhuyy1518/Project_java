package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import model.thisinh;
import model.tinh;
import view.QLSVview;

public class QLSV_controller implements ActionListener {
	
	public QLSVview view;

	public QLSV_controller(QLSVview view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String actionCommand = e.getActionCommand();
		
		
		if(actionCommand.equals("Thêm")) {
			this.view.model.setLuachon("Thêm");
			this.view.text_dsts_mathisinh.requestFocusInWindow();
			
		}
		
		else if(actionCommand.equals("Cập nhập")){
			this.view.hienthithongtinthisinh();
			this.view.model.setLuachon("Cập nhập");
			
		}
					
		
		else if(actionCommand.equals("Lưu")){
			//private int mathisinh;
			int mts = Integer.valueOf(this.view.text_dsts_mathisinh.getText());
			//private String tenthisinh;
			String hoten = this.view.text_dsts_hovaten.getText();
			//private tinh quequan;
			int quequan = this.view.comboBox_dsts_quequan.getSelectedIndex();
			tinh t = tinh.gettinh(quequan);
			//private Date ngaysinh;
			//Date ngaysinh = new Date(this.view.text_dsts_ngaysinh.getText());
			Date ngaysinh = null;

			try {
			    String ns = this.view.text_dsts_ngaysinh.getText();

			    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			    sdf.setLenient(false);

			    ngaysinh = sdf.parse(ns);

			} catch (ParseException e1) {
			    JOptionPane.showMessageDialog(null, "Ngày sinh không đúng định dạng dd/MM/yyyy");
			}
			//private boolean gioitinh;
			boolean giotinh = true;
			if(this.view.rdbtnButton_nam.isSelected()) {
				giotinh = true;
			}
			else if(this.view.rdbtnButton_nu.isSelected()) {
				giotinh = false;
			}
			//private float diemMon1,diemMon2,diemMon3;
			float diemmon1 = Float.valueOf(this.view.text_dsts_mon1.getText());
			float diemmon2 = Float.valueOf(this.view.text_dsts_mon2.getText());
			float diemmon3 = Float.valueOf(this.view.text_dsts_mon3.getText());
			
			thisinh ts = new thisinh(mts, hoten, t, ngaysinh, giotinh, diemmon1, diemmon2, diemmon3);
			
			if(this.view.model.getLuachon().equals("")||this.view.model.getLuachon().equals("Thêm")) {
				this.view.themthisinh(ts);
			}else if(this.view.model.getLuachon().equals("Cập nhập")) {
				this.view.capnhapthisinh(ts);
			}
			this.view.xoa_from();
		}

		else if(actionCommand.equals("Xóa")) {
			this.view.xoa();
		}
		
		else if(actionCommand.equals("search")) {
			
			this.view.model.setLuachon("search");
			
			if (this.view.comboBox_quequan.getSelectedItem()==null
			        || this.view.Text_mathisinh.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "vui lòng nhập đầy đủ thông tin cần tìm!");
			}else {
				 String mathisinh =
				            this.view.Text_mathisinh.getText().trim();

				    String quequan =
				            this.view.comboBox_quequan
				                    .getSelectedItem()
				                    .toString();

				    DefaultTableModel model =
				            (DefaultTableModel) this.view.table_1.getModel();

				    TableRowSorter<DefaultTableModel> sorter =
				            new TableRowSorter<>(model);

				    this.view.table_1.setRowSorter(sorter);

				    RowFilter<DefaultTableModel, Object> rf =
				            new RowFilter<DefaultTableModel, Object>() {

				        @Override
				        public boolean include(
				                Entry<? extends DefaultTableModel,
				                ? extends Object> entry) {

				            String mts =
				                    entry.getStringValue(0);

				            String qq =
				                    entry.getStringValue(2);

				            return mts.equalsIgnoreCase(mathisinh)
				                    && qq.equalsIgnoreCase(quequan);
				        }
				    };

				    sorter.setRowFilter(rf);

				    if(this.view.table_1.getRowCount() == 0) {

				        JOptionPane.showMessageDialog(
				                null,
				                "Không tìm thấy thí sinh!"
				        );
				    }
			}
		}
		
		else if(actionCommand.equals("Hủy bỏ")) {
			this.view.table_1.setRowSorter(null);
		}
		
	}
	
	

}
