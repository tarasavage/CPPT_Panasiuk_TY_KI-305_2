package KI305.Panasiuk.Lab4;

public interface Fireable {
	public void fire();
	public void fireMultipleTimes(int rounds);
	public void reload();
	public void loadAmmo(int roundsToAdd);
}
