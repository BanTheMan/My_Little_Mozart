package symphony.strategy;

/**
 * Lower pitch strategy
 * Author: Nate Spencer
 */
public class LowerPitchStrategy implements PitchStrategy {

	/**
	 *	Decrease a note's pitch
	 */
	@Override
	public int modifyPitch(int note) {
		return note - 2;
	}
	
}
