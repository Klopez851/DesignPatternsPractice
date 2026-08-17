package kl.practice.Creational.Builder;

/*
 * BUILDER PATTERN EXERCISE: Computer
 *
 * You are building a system that creates customized computers.
 *
 * Computer fields:
 *   - String cpu
 *   - String gpu
 *   - int ram
 *   - int storage
 *   - boolean wifi
 *   - boolean bluetooth
 *
 * Problem:
 * Many of these fields are optional, so a large constructor would become
 * difficult to read and maintain.
 *
 * Your task:
 * Implement the Computer class using the Builder pattern.
 *
 * Target usage:
 *
 * Computer gamingPC = new Computer.Builder()
 *         .cpu("Ryzen 7")
 *         .gpu("RTX 5070")
 *         .ram(32)
 *         .storage(2000)
 *         .wifi(true)
 *         .bluetooth(true)
 *         .build();
 *
 * Computer basicPC = new Computer.Builder()
 *         .cpu("Intel i5")
 *         .ram(16)
 *         .storage(512)
 *         .build();
 *
 * Requirements:
 *
 * 1. Computer should contain all six fields listed above.
 *
 * 2. Do not expose a giant public constructor for clients to use.
 *
 * 3. Create a Builder that allows each property to be configured individually.
 *
 * 4. Builder methods should return the Builder so method chaining is possible.
 *
 * 5. build() should create and return the final Computer object.
 *
 * 6. Optional properties should have sensible behavior when they aren't
 *    explicitly provided.
 *
 * 7. Add at least ONE validation rule inside build().
 *    Examples:
 *      - CPU must be provided.
 *      - RAM must be greater than 0.
 *      - Storage must be greater than 0.
 *
 * Important:
 * Try to implement this yourself without looking up a Builder implementation.
 * Think about what responsibility belongs to the Builder versus the Computer.
 *
 * Goal:
 * Separate the process of constructing/configuring a Computer from the
 * final Computer object itself.
 */

/*
 * BUILDER PATTERN FOLLOW-UP: Upgrade the Computer
 *
 * You already implemented a Computer + Builder.
 *
 * Now imagine the requirements have changed.
 *
 * ============================================================
 * NEW REQUIREMENTS
 * ============================================================
 *
 * A Computer can now have:
 *
 *   - String cpu
 *   - String gpu
 *   - int ram
 *   - int storage
 *   - boolean wifi
 *   - boolean bluetooth
 *
 * PLUS:
 *
 *   - String operatingSystem
 *   - String motherboard
 *   - int powerSupplyWatts
 *   - boolean liquidCooling
 *   - boolean rgb
 *
 *
 * ============================================================
 * CHALLENGE 1 — ADD THE NEW FIELDS
 * ============================================================
 *
 * Update both Computer and Builder so all of the new properties
 * can be configured through the Builder.
 *
 *
 * ============================================================
 * CHALLENGE 2 — ADD VALIDATION
 * ============================================================
 *
 * Add these rules:
 *
 *   - CPU is required.
 *   - RAM must be greater than 0.
 *   - Storage must be greater than 0.
 *   - Power supply must be at least 300W.
 *   - If liquid cooling is enabled, a GPU must be provided.
 *
 * Decide where the validation should happen.
 *
 * Hint:
 * Ask yourself:
 *
 *   "When should an invalid Computer be allowed to exist?"
 *
 *
 * ============================================================
 * CHALLENGE 3 — DEFAULT VALUES
 * ============================================================
 *
 * Give these properties sensible defaults if the client doesn't
 * explicitly configure them:
 *
 *   - wifi       → false
 *   - bluetooth  → false
 *   - rgb        → false
 *   - liquidCooling → false
 *   - powerSupplyWatts → 500
 *   - operatingSystem → "Windows"
 *
 *
 * ============================================================
 * CHALLENGE 4 — METHOD CHAINING
 * ============================================================
 *
 * Make sure code like this still works:
 *
 * Computer pc = new Computer.Builder()
 *         .cpu("Ryzen 7")
 *         .gpu("RTX 5070")
 *         .ram(32)
 *         .storage(2000)
 *         .operatingSystem("Linux")
 *         .motherboard("X870")
 *         .powerSupplyWatts(750)
 *         .liquidCooling(true)
 *         .rgb(true)
 *         .build();
 *
 *
 * ============================================================
 * CHALLENGE 5 — THINK ABOUT THE DESIGN
 * ============================================================
 *
 * DON'T add a bunch of overloaded constructors to solve the new
 * requirements.
 *
 * The point of this exercise is to see whether the Builder
 * continues to make the Computer easier to construct as the
 * number of configuration options grows.
 *
 *
 * ============================================================
 * CHALLENGE 6 — THINK LIKE A CODE REVIEWER
 * ============================================================
 *
 * After implementing everything, answer these questions:
 *
 * 1. Why should the client configure the Builder rather than
 *    directly modifying Computer's fields?
 *
 * 2. Why does build() make a good place to enforce the rules
 *    that determine whether a Computer is valid?
 *
 * 3. What would become annoying if Computer had 20+ optional
 *    properties and you used constructors instead?
 *
 * 4. Which parts of your implementation are responsible for
 *    CONSTRUCTING the Computer, and which parts represent the
 *    COMPUTER itself?
 *
 * 5. If you later add:
 *
 *       boolean dedicatedSoundCard
 *
 *    how much existing client code should need to change?
 *
 *
 * IMPORTANT:
 *
 * Try to implement this without looking up a Builder example.
 * The goal is to extend YOUR existing implementation and see
 * whether the design naturally scales.
 */

import java.util.Scanner;

public class Main {

    /*
     * To make this a proper program, i'd add try catches and do whiles, but its a simple practice
     * exercise that will only be used by me, therefore all that isnt a necesity per say
     */
    public static void main(String[] args) {
        // VARIABLES //
        String cpu, os, motherboard;
        int ram,storage, powerSupplyWatts =500;
        String gpu = null;
        boolean wifi, bluetooth, liquidCooling, rgb;


        //get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Build-A-PC! Lets make a pc for you!");
        System.out.println("What CPU would you like your pc to have? dont be shy we dont got a budget :3 ");

        cpu = scanner.nextLine().strip();

        System.out.println("Wonderful!");
        System.out.println("Now do you want a GPU? (y/n)");

        if(scanner.nextLine().strip().equalsIgnoreCase("n")){
            System.out.println("Aight loser ur loss");
        }else{
            System.out.println("Cool! What GPU are u thinking :D? ");
            gpu = scanner.nextLine().strip();
        }
        System.out.println("Great, now tell me how much ram you want in your super awesome and cool pc ");
        ram = Integer.parseInt(scanner.nextLine().strip());

        System.out.println("ok ok now how much storage 0_o? ");
        storage = Integer.parseInt(scanner.nextLine().strip());

        System.out.println("you want access to the internet? (y/n)");
        wifi = scanner.nextLine().strip().equalsIgnoreCase("y")? true : false;

        System.out.println("how about bluetooth, you want that? (y/n)");
        bluetooth = scanner.nextLine().strip().equalsIgnoreCase("y")? true : false;

        System.out.println("ADDITIONAL CONFIGS");
        System.out.println("What motherboard would u like?");
        motherboard = scanner.nextLine();

        System.out.println("Any specific OS?");
        os= scanner.nextLine();

        System.out.println("Specific wattage requirements for the PSU? (y/n)");
        if(scanner.nextLine().equalsIgnoreCase("y")){
            System.out.println("how many watts?");
            powerSupplyWatts = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Do we want liquid cooling 0_o? (y/n)");
        liquidCooling = scanner.nextLine().strip().equalsIgnoreCase("y")? true : false;

        if(liquidCooling){
            System.out.println("did u choose a gpu earlier? (y/n");
            if(scanner.nextLine().equalsIgnoreCase("n")){
                System.out.println("ok we kinda need one for liquid cooling, so what gpu u want?");
                gpu = scanner.nextLine();
            }
            System.out.println("on onto the next thing then");

        }

        System.out.println("RGB? (if u say no please proceed to the nearest exit)(y/n)");
        rgb = scanner.nextLine().strip().equalsIgnoreCase("y")? true : false;

        //build computer based on input
        Computer.ComputerBuilder builder= new Computer.ComputerBuilder();

        builder
                .setCPU(cpu)
                .setRam(ram)
                .setStorage(storage)
                .setGPU(gpu)
                .setWifi(wifi)
                .setBluetooth(bluetooth)
                .setLiquidCooling(liquidCooling)
                .setOS(os)
                .setMotherboard(motherboard)
                .setRgb(rgb)
                .setPowerSupplyWatts(powerSupplyWatts);
        Computer computer = builder.build();

        // show built object to user
        System.out.println("Building computer...ouch my finger...hold on a sec...Done! :D");

        System.out.println("Here is your beautiful wonderful amazing scruptious pc <3");
        System.out.printf("CPU: %s, GPU: %s, Ram: %d, Storage: %d, Wifi: %s, Bluetooth: %s, " +
                        "OS; %s, m: %s, psw: %d, l: %s, r:%s",
                computer.getCpu(),
                computer.getGpu(),
                computer.getRam(),
                computer.getStorage(),
                computer.isWifi(),
                computer.isBluetooth(),
                computer.getOs(),
                computer.getMotherboard(),
                computer.getPowerSupplyWatts(),
                computer.isLiquidCooling(),
                computer.isRbg());
    }

}




















