package kl.practice.Creational.Builder;

public interface Builder {
    Builder setCPU(String cpu);
    Builder setGPU(String gpu);
    Builder setRam(int ram);
    Builder setStorage(int storage);
    Builder setWifi(boolean wifi);
    Builder setBluetooth(boolean bluetooth);
    Computer build();
}
