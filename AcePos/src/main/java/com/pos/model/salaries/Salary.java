/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelclasses;

import java.sql.Timestamp;

/**
 *
 * @author Arif
 */
public class Salary {
    public static String SALARYID="SALARYID";
    public static String MEDICALALLOWANCE="MEDICALALLOWANCE";
    public static String GRASS="GRASS";
    public static String PERSONID="PERSONID";
    public static String LASTUPDATEDATE="LASTUPDATEDATE";

    private int salaryID;
    private float medicalAllowance;
    private float grass;
    private int personID;
    private Timestamp lastUpdateDate;

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public float getGrass() {
        return grass;
    }

    public void setGrass(float grass) {
        this.grass = grass;
    }

    public float getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(float medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getSalaryID() {
        return salaryID;
    }

    public void setSalaryID(int salaryID) {
        this.salaryID = salaryID;
    }

    @Override
    public String toString() {
        return "Salary{" + "salaryID=" + salaryID + "medicalAllowance=" + medicalAllowance + "grass=" + grass + "personID=" + personID + "lastUpdateDate=" + lastUpdateDate + '}';
    }

    
    
    


}
