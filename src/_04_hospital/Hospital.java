package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Patient> patients;
	ArrayList<Doctor> doctors;

	public Hospital() {
		patients = new ArrayList<Patient>();
		doctors = new ArrayList<Doctor>();
	}

	public void addDoctor(GeneralPractictioner generalPractictioner) {
		doctors.add(generalPractictioner);
	}

	public void addDoctor(Surgen surgen) {
		doctors.add(surgen);
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int currentDoctor = 0;
		for (int i = 0; i < patients.size(); i++) {
			if (doctors.get(currentDoctor).patients.size() ==3) {
				currentDoctor += 1;
			}
				doctors.get(currentDoctor).assignPatient(patients.get(i));
			
		}
	}

}
