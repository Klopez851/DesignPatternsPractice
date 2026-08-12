package kl.practice.Creational.Builder;

import lombok.Getter;

@Getter
public class Computer {
    private String cpu, gpu;
    private int ram,storage;
    private boolean wifi, bluetooth;

    private Computer(String cpu, String gpu, int ram, int storage, boolean wifi, boolean bluetooth){
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
        this.wifi=wifi;
        this.bluetooth=bluetooth;
    }

    /// //////////////////
    // COMPUTER BUILDER //
    /// //////////////////

    //nested classes have access to it parents private fields
    //static means accessible at class level
    public static class ComputerBuilder implements Builder{

        private static final int MIN_RAM_VALUE = 0;
        private static int MIN_STORAGE_VALUE = 0;


        private String cpu = null;
        private String gpu = "No GPU";
        private int ram = MIN_RAM_VALUE;
        private int storage = MIN_STORAGE_VALUE;
        private boolean wifi = true;
        private boolean bluetooth = true;

        public ComputerBuilder(){}

        @Override
        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        @Override
        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        @Override
        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        @Override
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        @Override
        public Builder setWifi(boolean wifi) {
            this.wifi=wifi;
            return this;
        }

        @Override
        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth =bluetooth;
            return this;
        }

        @Override
        public Computer build() {
            if(cpu==null || cpu.isBlank()){
                throw  new IllegalArgumentException("CPU cannot be empty or null, set one using ComputerBuilder.setCpu()");
            }
            if(gpu.isBlank()){
                gpu = "No GPU";
            }

            if(ram <= MIN_RAM_VALUE){
                throw  new IllegalArgumentException("RAM must have a value bigger than "+MIN_RAM_VALUE+
                        " set one using ComputerBuilder.setRam()");
            }

            if(storage <= MIN_STORAGE_VALUE){
                throw  new IllegalArgumentException("Storage must have a value bigger than "+MIN_STORAGE_VALUE+
                        " set one using ComputerBuilder.setStorage()");
            }
            Computer computer = new Computer(cpu,gpu,ram,storage,wifi,bluetooth);

            return computer;
        }
    }

}
