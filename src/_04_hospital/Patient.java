package _04_hospital;

public class Patient {
	boolean cared;

	public Patient() {
	}

	public boolean feelsCaredFor() {
		return cared;
	}

	public void checkPulse() {
		cared = true;
	}

}
