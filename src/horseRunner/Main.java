package horseRunner;

public hclass orseRunner {

    public static void main(String[] args) {
        // write your code here
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail", 22000);
        Horse horse3 = new Mustang("Silver", 12000);

        Horse[] horse = new Horse[6];

        horse[1] = horse1;
        horse[2] = horse2;
        horse[3] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println("Dusty trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Dusty trail is now in space: " + barn.findHorseSpace("Dusty Trail"));
    }
    public int findHorseSpace(String name) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i]!=null && name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public void consolidate() {
        for (int i = 0; i < this.spaces.length-1; i++) {
            if (this.spaces[i] == null) {
                for (int j = i+1; j < this.spaces.length; j++) {
                    if (this.spaces[j] != null) {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }
//    public void consolidate() {
//        Horse[] newSpaces = new Horse[this.spaces.length];
//        int nextSpot = 0;
//        for (Horse nextHorse : this.spaces) {
//            if (nextHorse != null) {
//                newSpaces[nextSpot] = nextHorse;
//                nextSpot++;
//            }
//        }
//        this.spaces = newSpaces;
//    }
//    public void consolidate() {
//        List<Horse> horseList = new ArrayList<Horse>();
//        for (Horse h : this.spaces) {
//            if (h != null) horseList.add(h);
//        }
//        for (int i = 0; i < this.spaces.length; i++) {
//            this.spaces[i] = null;
//        }
//        for (int i = 0; i < horseList.size(); i++) {
//            this.spaces[i] = horseList.get(i);
//        }
//    }
}
