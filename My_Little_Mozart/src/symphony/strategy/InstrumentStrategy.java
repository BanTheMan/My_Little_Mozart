package symphony.strategy;

import javax.sound.midi.*;

/**
 * Instrument strategy behavior
 * Author: Ekincan Ufuktepe
 */
public interface InstrumentStrategy {
	/**
	 * Set a track's channel to play a specific instrument
	 * @param track value
	 * @param channel value
	 */
	void applyInstrument (Track track , int channel);
}
