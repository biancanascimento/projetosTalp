package exercicio2;

public enum EnumDispositivoMovelPlataforma {
	ANDROID(1), IOS(2), WINDOWS(99);
	private int codigo;
	
	EnumDispositivoMovelPlataforma(int codigo){
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public static EnumDispositivoMovelPlataforma getDispositivoPorCodigo(int codigo){
		if(codigo == ANDROID.getCodigo())
			return ANDROID;
		else if(codigo == IOS.getCodigo())
			return IOS;
		else if(codigo == WINDOWS.getCodigo())
			return WINDOWS;
		throw new IllegalArgumentException();
	}
}
