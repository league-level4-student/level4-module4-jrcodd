package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public Doctor() {

	}

	
	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patients.size() < 3) {
			patients.add(patient);

		} else {
		

		throw new DoctorFullException();
		}
	}

	public ArrayList<Patient> getPatients() {
		return patients;

	}

	public void doMedicine() {
		for (Patient patient : patients) {
			patient.cared = true;
		}
	}

}
