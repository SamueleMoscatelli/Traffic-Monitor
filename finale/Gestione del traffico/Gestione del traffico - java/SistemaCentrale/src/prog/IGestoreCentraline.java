package prog;
import java.rmi.*;

public interface IGestoreCentraline extends Remote{
    public void aggiungiCentralinaStradale(int id) throws RemoteException;
    public void rimuoviCentralinaStradale(int id) throws RemoteException; 
    public void segnalaDatabaseS(DatoTraffico dato) throws RemoteException, NotBoundException;
    public void aggiungiCentralinaAuto(int id) throws RemoteException;
    public void rimuoviCentralinaAuto(int id) throws RemoteException; 
    public void segnalaDatabaseA(StatoVeicolo stato) throws RemoteException, NotBoundException;
}
