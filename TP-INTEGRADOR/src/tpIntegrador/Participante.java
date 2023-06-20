
package tpIntegrador;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class Participante {
	
    

	private long id;	
	private String nombre;
	protected List<Muestra> muestrasEnviadas;
    private List<Opinion> opinionesRealizadas;
    private TipoParticipante tipoParticipante;
    
   

    public Participante(String nombre,long id) {
    	this.setId(id);
    	this.setNombre(nombre);
        this.muestrasEnviadas = new ArrayList<Muestra>();
        this.opinionesRealizadas = new ArrayList<Opinion>();
        this.tipoParticipante = new ParticipanteBasico();
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
	
	public void setTipoParticipante(TipoParticipante tipo) {
		this.tipoParticipante = tipo;
	}
	
	public TipoParticipante getTipoParticipante() {
		return tipoParticipante;
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
    
    public ClaseParticipante getNivelUsuario() {

    	ClaseParticipante nivel;
    	
    	if(this.getCantidadDeMuestrasEnviadas()>=10 && this.getCantidadDeOpinionesEnviadas()>=20) {
    		nivel = ClaseParticipante.EXPERTO;
    	} else {
    		nivel = ClaseParticipante.BASICO;
    	}
    	
    	return nivel;
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
    
    public void actualizarTipo(Participante participante) {
    	
    	tipoParticipante.actualizarTipo(participante);
    	
    }
    
   
}

