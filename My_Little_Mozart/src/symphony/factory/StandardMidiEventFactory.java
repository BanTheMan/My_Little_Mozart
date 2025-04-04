package symphony.factory;

import javax.sound.midi.*;

/**
 * Standard Midi event factory
 * Author: Brandon Gomes
 */
public class StandardMidiEventFactory implements MidiEventFactory {

	/**
	 *	Create a standard note start event
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(message, tick);
	}

	/**
	 * Create a standard note end event
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, channel, note, 0);
		return new MidiEvent(message, tick);
	}

}
