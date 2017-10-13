/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


/**
 * @author iaw26540084
 *
 */
public class Itv implements Comparable<Itv> {
	/**
	 * La comparable es fa de forma natural i el comparator es fa per ordenar per altre camp
	 */
	private long id;
	private String matricula;
	private LocalDateTime fecha;
	private String lugar;
	
	/**
	 * @param id
	 * @param matricula
	 * @param fecha
	 * @param lugar
	 */
	public Itv(long id, String matricula, LocalDateTime fecha, String lugar) {
		this.id = id;
		this.matricula = matricula;
		this.fecha = fecha;
		this.lugar = lugar;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Itv)) {
			return false;
		}
		Itv other = (Itv) obj;
		if (fecha == null) {
			if (other.fecha != null) {
				return false;
			}
		} else if (!fecha.equals(other.fecha)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (lugar == null) {
			if (other.lugar != null) {
				return false;
			}
		} else if (!lugar.equals(other.lugar)) {
			return false;
		}
		if (matricula == null) {
			if (other.matricula != null) {
				return false;
			}
		} else if (!matricula.equals(other.matricula)) {
			return false;
		}
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Itv [id=%s, matricula=%s, fecha=%s, hora=%s, lugar=%s]", id, matricula, fecha,
				lugar);
	}
	
	/**
	 * negatiu si el id d'aquesta itv es mes petit que l'id de itv
	 * 0 si son iguals
	 * positiu si el id d'aquesta itv es mes gran que l'id de itv
	 */
	@Override
	public int compareTo(Itv itv) {
	
		return (int) (id - itv.id);
	}
	

}
