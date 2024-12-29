/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerRMI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Services extends UnicastRemoteObject implements OperationRMI {

    protected Services() throws RemoteException {
        super();
    }

    @Override
    public double hitungLuas(double sisi) throws RemoteException {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling(double sisi) throws RemoteException {
        return 4 * sisi;
    }

    @Override
    public double hitungSkala(double sisi, double faktor) throws RemoteException {
        return sisi * faktor;
    }
}
