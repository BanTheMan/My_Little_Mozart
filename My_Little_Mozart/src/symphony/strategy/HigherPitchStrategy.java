package symphony.strategy;

/**
 * Higher pitch strategy
 * Author: Ivan Rhodes
 */
public class HigherPitchStrategy implements PitchStrategy {

	/**
	 *	Increase a note's pitch
	 */
	@Override
	public int modifyPitch(int note) {
		return note + 2;
	}
	
}
