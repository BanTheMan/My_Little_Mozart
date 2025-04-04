package symphony.strategy;

/**
 * Pitch strategy behavior
 * Author: Ekincan Ufuktepe
 */
public interface PitchStrategy {
	/**
	 * Alter a note's pitch
	 * @param note
	 * @return new note value
	 */
	int modifyPitch(int note);
}

