package symphony.factory;

import javax.sound.midi.*;

/**
 * Legato Midi event factory
 * Author: Brandon Gomes
 */
public class LegatoMidiEventFactory implements MidiEventFactory {

	/**
	 *	Create a legato note start event
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(message, tick+80);
	}

	/**
	 * Create a legato note end event
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
		return new MidiEvent(message, tick+80);
	}

}
