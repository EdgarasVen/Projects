import lt.itakademija.exam.*;
import lt.itakademija.exam.Package;

import java.util.*;
import java.util.stream.Collectors;

public class MyWarehouse extends Warehouse {
    Map<Integer,Package> packageMap = new HashMap<>();
    Map<Integer,Client> clientMap = new HashMap<>();

    public MyWarehouse(IdGenerator clientIdGenerator, IdGenerator packageIdGenerator, int totalSpace) {
        super(clientIdGenerator, packageIdGenerator,totalSpace);
        if (totalSpace<=0) throw new IllegalArgumentException();
    }

    public int getTotalSpace() {
        return totalSpace;
    }

    public int getAvailableSpace() {
        return totalSpace-getReservedSpace();
    }

    public int getTotalAvailableSpace() {
        int all=clientMap.values().stream()
                .flatMapToInt(client -> client.getPackages().stream()
                        .mapToInt(Package::getSpace)).sum();
        return totalSpace-all;
    }

    public int getReservedSpace() {
        return clientMap.values().stream()
                .mapToInt(Client::getReservedSpace)
                .sum();
    }

    public Client registerClient(String name, int reservedSpace) {
        if(getTotalAvailableSpace()<reservedSpace) throw new InsufficientSpaceException("space too low");
        if(name==null||name.equals("")) throw new IllegalArgumentException();
        int id = clientIdGenerator.generateId();
        Client client =new Client(id,name,reservedSpace);
        clientMap.put(id,client);
        return client;
    }

    public Package createPackage(String name, int space) {
        if(space<=0) throw new IllegalArgumentException();
        if(getAvailableSpace()-space<0) throw new InsufficientSpaceException("space too low");
        int id=packageIdGenerator.generateId();
        Package p=new Package(id,name,space);
        packageMap.put(id,p);
        return p;
    }

    public void storePackage(Client client, Package aPackage) {
        if (client.getAvailableSpace()<aPackage.getSpace()) throw new InsufficientSpaceException("space too low");
        clientMap.get(client.getId()).addPackage(packageMap.get(aPackage.getId()));
    }

    public Client getClientById(int i) {
        return clientMap.get(i);
    }

    public boolean hasClientById(int i) {
        return clientMap.containsKey(i);
    }

    public List<Client> findClientsBy(ClientPredicate clientPredicate) {
        return clientMap.values().stream()
                .filter(clientPredicate::test)
                .collect(Collectors.toList());
    }
}
