package ServerRMI;

import ServerRMI.Services;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        // Membuat instance dari Services
        Services serv = new Services();
        
        try {
            // Membuat registry RMI pada port 2000
            Registry register = LocateRegistry.createRegistry(2000);
            
            // Mengikat objek 'services' dengan nama 'services'
            register.bind("services", serv);
            
            // Output informasi server siap
            System.out.println("Server is connected and ready for operation");
        } catch (Exception e) {
            // Menangani kesalahan jika terjadi
            e.printStackTrace();
        }
    }
}
