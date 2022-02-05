package service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.giavudangle.protobuf.Laptop;

import exception.AlreadyExistsException;

public class InMemoryLaptopStore implements LaptopStore {

    private ConcurrentMap<String,Laptop> data;

    public InMemoryLaptopStore() {
        data = new ConcurrentHashMap<>(0);
    }

    @Override
    public void Save(Laptop laptop) throws Exception {
        // TODO Auto-generated method stub
        System.out.println(laptop);

        System.out.println(data);
        if (data.containsKey(laptop.getId())){
            throw new AlreadyExistsException("laptop ID already exists");
        }

        // Deep clone
        Laptop other = laptop.toBuilder().build();
        data.put(other.getId(), other);
    }

    @Override
    public Laptop Find(String id) {
        // TODO Auto-generated method stub
        if(!data.containsKey(id)){
            return null;
        }
        Laptop other = data.get(id).toBuilder().build();
        return other;
    }

    
}
