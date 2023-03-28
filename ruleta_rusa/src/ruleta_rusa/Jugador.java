package ruleta_rusa;

public class Jugador {
	private static int idContador = 1;
	private int iD;
	private String nombre;
	private String nickName;
	private Boolean vivo;

	public Jugador(String nombre, String nickName) {
		super();
		this.iD = idContador++;
		this.nombre = nombre;
		this.nickName = "Jugador " + iD + " " + nickName;
		this.vivo = true;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Boolean getVivo() {
		return vivo;
	}

	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return "Jugador [iD=" + iD + ", nombre=" + nombre + ", nickName=" + nickName + ", vivo=" + vivo + "]";
	}
	
	public void jugar (Revolver revolver) {
		boolean disparo=revolver.disparar();
		if (disparo==true) {
			vivo=false;
		}
	}
	
	

}
