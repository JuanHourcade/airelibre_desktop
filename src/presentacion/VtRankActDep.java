package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class VtRankActDep extends JInternalFrame{
	private JTable tableRank;
	private JButton btnCerrar;
	private JInternalFrame yo = this;
	private VtPrincipal principal;
	
	public VtRankActDep(VtPrincipal VtPrincipal) {
		setTitle("Ranking");
		principal = VtPrincipal;
		principal.bajarFrameActual();
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize( 650, 370);
		getContentPane().setLayout(null);	
		getContentPane().setBackground(Color.decode("#cbdad5"));
		principal.setFrameActual(yo);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yo.dispose();
			}
		});
		btnCerrar.setBounds(10, 285, 226, 21);
		this.getContentPane().add(btnCerrar);
	    
		testTabla();
		
	}	
	
	public void testTabla() {
		String[][] data = new String[4][2];
		data[0][0] = "a"; data[0][0] = "a"; data[0][1] = "1"; data[1][0] = "b"; data[1][1] = "2"; data[2][0] = "c"; data[2][1] = "3"; data[3][0] = "d"; data[3][1] = "4";  
		String [] titulo = {"Letra", "Numero"};
	    
		tableRank = new JTable(data, titulo);
		getContentPane().add(tableRank);
		
		// adding it to JScrollPane
        JScrollPane sp = new JScrollPane(tableRank);
        sp.setBounds(10, 36, 226, 238);
        getContentPane().add(sp);
		
	}
}