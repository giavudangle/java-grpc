package service;

import com.giavudangle.protobuf.Laptop;

public interface LaptopStore {
    
    void Save(Laptop laptop) throws Exception;
    Laptop Find(String id);
}
