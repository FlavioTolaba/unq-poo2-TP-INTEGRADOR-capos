
package tpIntegrador;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public abstract class Participante {
	
    

	private long id;	
	private String nombre;
	protected List<Muestra> muestrasEnviadas;
    private List<Opinion> opinionesRealizadas;
    private ClaseParticipante claseParticipante;
    
   

    public Participante(String nombre,long id) {
    	this.setId(id);
    	this.setNombre(nombre);
        this.muestrasEnviadas = new ArrayList<Muestra>();
        this.opinionesRealizadas = new ArrayList<Opinion>();
        this.setClaseParticipante(ClaseParticipante.BASICO);
    }	
    
    private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public void setTipoParticipante(ClaseParticipante clase) {
		this.setClaseParticipante(clase);
	}
	

    
    public String getNombre() {
    	return this.nombre;
    }

    
    public void enviarMuestra(Muestra muestra) {
        muestrasEnviadas.add(muestra);
    }
    
    
    public Opinion enviarOpinion(TipoOpinion opinion1, Muestra muestra) {
        Opinion opinion=new Opinion(opinion1,this.getId());
    	opinionesRealizadas.add(opinion);
    	muestra.recibirOpinion(opinion);
    	return opinion;
    }
    
    
    public List<Muestra> getMuestrasEnviadas() {
		return muestrasEnviadas;
	}
    
    public List<Opinion> getOpinionesEnviadas() {
		return opinionesRealizadas;
	}
    
    public int getCantidadDeMuestrasEnviadas() {
    	
    	int cantidad = this.getMuestrasEnviadas().size();
    	return cantidad;
    	
    }
    
    public int getCantidadDeOpinionesEnviadas() {
    	
    	int cantidad = this.getOpinionesEnviadas().size();
    	return cantidad;
    	
    }
    
    public boolean esExperto() {
    	
    	return this.getCantidadDeMuestrasEnviadas()>=10 && this.getCantidadDeOpinionesEnviadas()>=20;
    }
    
    abstract void actualizarClaseParticipante();

	public ClaseParticipante getClaseParticipante() {
		return claseParticipante;
	}

	public void setClaseParticipante(ClaseParticipante claseParticipante) {
		this.claseParticipante = claseParticipante;
	}
    
   
}

