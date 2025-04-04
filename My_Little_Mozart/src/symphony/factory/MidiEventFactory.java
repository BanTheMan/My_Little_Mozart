package symphony.factory;

import javax.sound.midi.*;

/**
 * Midi event factory behavior
 * Author: Ekincan Ufuktepe
 */
public interface MidiEventFactory {
	 /**
	  * Create start event for a note
	 * @param tick
	 * @param note
	 * @param velocity
	 * @param channel
	 * @return MidiEvent
	 * @throws InvalidMidiDataException
	 */
	MidiEvent createNoteOn(int tick , int note , int velocity , int channel) throws InvalidMidiDataException ;
	/**
	 * Create end event for a note
	 * @param tick
	 * @param note
	 * @param channel
	 * @return MidiEvent
	 * @throws InvalidMidiDataException
	 */
	MidiEvent createNoteOff(int tick , int note , int channel) throws InvalidMidiDataException ;
}
