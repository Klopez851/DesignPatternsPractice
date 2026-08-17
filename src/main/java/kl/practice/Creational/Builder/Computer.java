package kl.practice.Creational.Builder;

import lombok.Getter;

@Getter
public class Computer {
    private String cpu, gpu, os, motherboard;
    private int ram,storage,powerSupplyWatts;
    private boolean wifi, bluetooth, liquidCooling,rbg;

    private Computer(String cpu, String gpu, String os, String motherboard, int ram, int storage, int powerSupplyWatts,
                     boolean wifi, boolean bluetooth, boolean liquidCooling, boolean rbg){
        this.cpu = cpu;
        this.gpu = gpu;
        this.os = os;
        this.motherboard = motherboard;
        this.ram = ram;
        this.storage = storage;
        this.powerSupplyWatts=powerSupplyWatts;
        this.wifi=wifi;
        this.bluetooth=bluetooth;
        this.liquidCooling=liquidCooling;
        this.rbg=rbg;
    }

    /// //////////////////
    // COMPUTER BUILDER //
    /// //////////////////

    //nested classes have access to it parents private fields
    //static means accessible at class level
    public static class ComputerBuilder implements Builder{

        private static final int MIN_RAM_VALUE = 0;
        private static final int MIN_STORAGE_VALUE = 0;
        private static final int MIN_WATT_VALUE= 300;


        private String cpu = null;
        private String gpu = null ;
        private String os = "Windows";
        private String motherboard = "MSI B760M GAMING PLUS WIFI"; //looked up most popular motherboard
        private int ram = MIN_RAM_VALUE;
        private int storage = MIN_STORAGE_VALUE;
        private int powerSupplyWatts = 500;
        private boolean wifi = false;
        private boolean bluetooth = false;
        private boolean liquidCooling = false;
        private boolean rgb = false;

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
        public Builder setOS(String os) {
            this.os =os;
            return this;
        }

        @Override
        public Builder setMotherboard(String motherboard) {
            this.motherboard=motherboard;
            return this;
        }

        @Override
        public Builder setPowerSupplyWatts(int powerSupplyWatts) {
            this.powerSupplyWatts=powerSupplyWatts;
            return this;
        }

        @Override
        public Builder setLiquidCooling(boolean liquidCooling) {
            this.liquidCooling=liquidCooling;
            return this;
        }

        @Override
        public Builder setRgb(boolean rgb) {
            this.rgb=rgb;
            return this;
        }

        @Override
        public Computer build() {
            if(cpu==null || cpu.isBlank()){
                throw  new IllegalArgumentException("CPU cannot be empty or null, set one using ComputerBuilder.setCPU()");
            }
            if(os.isBlank()){
                os="Windows";
            }

            if(liquidCooling){
                if(gpu==null){
                    throw new IllegalArgumentException("In order to have liquid cooling a gpu must be provided");
                }
            }

            if(gpu==null){
                gpu = "No GPU";
            }

            if(powerSupplyWatts<MIN_WATT_VALUE){
                throw new IllegalArgumentException("power supply wattage must have a value bigger than "+MIN_WATT_VALUE+
                        " set one using ComputerBuilder.setPowerSupplyWatts()");
            }

            if(ram <= MIN_RAM_VALUE){
                throw  new IllegalArgumentException("RAM must have a value bigger than "+MIN_RAM_VALUE+
                        " set one using ComputerBuilder.setRam()");
            }

            if(storage <= MIN_STORAGE_VALUE){
                throw  new IllegalArgumentException("Storage must have a value bigger than "+MIN_STORAGE_VALUE+
                        " set one using ComputerBuilder.setStorage()");
            }
            Computer computer = new Computer(cpu,gpu,os,motherboard,ram,storage,
                    powerSupplyWatts,wifi,bluetooth,liquidCooling,rgb);

            return computer;
        }
    }

}
