
public class Brigitte {
    private int stamina = 100;
    private boolean auraActive = true;

    public void paralyzingSmite() {
        System.out.println("Brigitte strikes! Enemy slowed for 2 seconds.");
    }

    public void shieldSmite() {
        System.out.println("Shield raised! Blocking attacks and creating protective barrier.");
    }

    public void northernVortex() {
        System.out.println("Enemies blinded and disoriented!");
    }

    public void uppsalaHalls() {
        System.out.println("Brigitte charges forward, knocking down and immobilizing enemies!");
    }

    public void passiveAura() {
        if (auraActive) {
            System.out.println("Protective Aura is active: bonus armor and magic resist granted.");
        }
    }
}
