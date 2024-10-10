package conversion;

public class Conversor {

	private final static double KM_A_MILLAS = 0.621371;
	private final static double MB_A_ATM = 0.000986923;
	private final static double CAL_A_JULIOS = 4.1868;
	
	public Conversor() {
		
	}
	
	static public double millas(double km) {
		return KM_A_MILLAS * km;
	}
	
	static public double km(double millas) {
		return  millas / KM_A_MILLAS;
	}
	
	static public double atmosferas(double mili) {
		return MB_A_ATM * mili;
	}
	
	static public double milibares(double atmo) {
		return  atmo / MB_A_ATM;
	}
	
	static public double julios(double calo) {
		return  CAL_A_JULIOS * calo;
	}
	
	static public double calorias(double juli) {
		return  juli / CAL_A_JULIOS;
	}
	
	
	
}
