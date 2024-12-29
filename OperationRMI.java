/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ServerRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OperationRMI extends Remote {
    double hitungLuas(double sisi) throws RemoteException;
    double hitungKeliling(double sisi) throws RemoteException;
    double hitungSkala(double sisi, double faktor) throws RemoteException;
}
