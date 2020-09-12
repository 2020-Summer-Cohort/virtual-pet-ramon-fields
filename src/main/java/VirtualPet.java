//Constructor
public class VirtualPet {
        //Fields
        private int hunger = 27;
        private int thirst = 5;
        private int boredom = 5;
        private int tiredness = 50;
        //Getters and Setters
        public int getHunger() {
            return hunger;
        }
        public int getThirst() {
            return thirst;
        }
        public int getBoredom() {
            return boredom;
        }
        public int getTiredness() {
            return tiredness;
        }
        //Methods
        public void feed() {
            this.hunger -=5;
            System.out.println("Nom Nom Nom Nom");
        }
        public void quenchThirst() {
            this.thirst -=5;
            System.out.println("Aaah");
        }
        public void digivolve() {
            this.boredom -=5;
            System.out.println("Agumon digivolve to - Greymon! Greymon! Greymon, I'm Greymon! I'm big and I'm bad...");
        }
        public void rest() {
            this.tiredness -=5;
            System.out.println("Zzzz");
        }
        public void tick() {
            hunger++;
            thirst++;
            boredom++;
            tiredness++;
        }
    }
