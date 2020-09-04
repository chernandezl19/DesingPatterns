package mediador;

import java.util.*;

public class Formulario {
	protected List<Control> controles = 
		new ArrayList<Control>();
	
	protected List<Control> controlesCoprestatario = 
		new ArrayList<Control>();
	
	protected PopupMenu menuCoprestatario;
	
	Boton botonOK;
	
	protected boolean enCurso = true;
	
	public void agregaControl(Control control) {
		controles.add(control);
		control.setDirector(this);
	}
	
	public void agregaControlCoprestatario (Control control) {
		controlesCoprestatario.add(control);
		control.setDirector(this);
	}
	
	public void setMenuCoprestatario (PopupMenu menuCoprestalario) {
		this.menuCoprestatario = menuCoprestalario;
	}
	
	public void setBotonOK (Boton botonOK) {
		this.botonOK = botonOK;
	}
	
	public void controlModificado (Control control) {
		if(control == menuCoprestatario)
			if (control.getValor().equals("con coprestatario")) {
				for(Control elementoCoprestalario: controlesCoprestatario)
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