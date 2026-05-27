package ejemploObjetos2;

import java.time.LocalDate;
import java.time.Period;

public class Empleado extends Object {

	private String dni;
	private String nombre;
	private LocalDate fechaInicio;
	private float salario;
	private boolean baja;
	private LocalDate fechaBaja;
	
	//Constructores
	 public Empleado() {
		 dni = null;
		 nombre = null;
		 fechaInicio = null;
		 salario = 0;
		  }
	 
	 public Empleado(String dni,String nombre,LocalDate fechaInicio,float salario) {
		 this.dni = dni;
		 this.nombre = nombre;
		 this.fechaInicio = fechaInicio;
		 this.salario = salario;	 
	 }

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	@Override
	public String toString() {
		
		if(this.baja) {
			return "Datos del empleado: " + this.nombre + " \n" + " dni=" + dni + "\n nombre=" + nombre + 
					"\n fechaInicio=" + fechaInicio + "\n salario=" + salario + "\n Fecha Baja: " + this.fechaBaja;
		}
		
		return "Datos del empleado: " + this.nombre + " \n" + " dni=" + dni + "\n nombre=" + nombre + 
				"\n fechaInicio=" + fechaInicio + "\n salario=" + salario;
	}

	public void tramitarBaja() {
		setBaja(true);
		setFechaBaja(LocalDate.now());
	}
	
	public void tramitarBaja(LocalDate fecha) {
		setBaja(true);
		setFechaBaja(fecha);
	}
	
	public int calcularDiasBaja() {
	   int dias = Period.between(this.fechaBaja, LocalDate.now()).getDays();
	   return dias;
	}
	
}
