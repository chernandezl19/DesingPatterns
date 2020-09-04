package mediador;

import java.util.*;

public class Formulario {
	protected List<Control> controles = 
		new ArrayList<Control>();
	
	protected List<Control> controlesCoprestalario = 
		new ArrayList<Control>();
	
	protected PopupMenu menuCoprestalario;
	
	Boton botonOK;
	
	protected boolean enCurso = true;
	
	public void agregaControl(Control control) {
		controles.add(control);
		control.setDirector(this);
	}
	
	public void setMenuCoprestalario (PopupMenu menuCoprestalario) {
		this.menuCoprestalario = menuCoprestalario;
	}
	
	public void setBotonOK (Boton botonOK) {
		this.botonOK = botonOK;
	}
	
	public void controlModificado (Control control) {
		if(control == menuCoprestalario)
			if (control.getValor().equals("con prestalario")) {
				for(Control elementoCoprestalario: controlesCoprestalario)
						elementoCoprestalario.informa();
			}
		if(control == botonOK) {
			enCurso = false;
		}
	}
	
	public void informa() {
		while(true) {
			for (Control control: controles) {
				control.informa();
				if(!enCurso)
					return;
			}
		}
	}
}