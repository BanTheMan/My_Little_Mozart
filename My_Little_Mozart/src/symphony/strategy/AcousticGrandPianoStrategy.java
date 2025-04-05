package symphony.strategy;

import javax.sound.midi.*;

/**
 * Midi acoustic grand piano note strategy
 * Author: Ivan Rhodes
 */
public class AcousticGrandPianoStrategy implements InstrumentStrategy 
{
	/**
	 * Set a channel in the Midi track to play the acoustic grand piano
	 */
	@Override
	public void applyInstrument(Track track , int channel) 
	{
		try 
		{
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0);
		MidiEvent event = new MidiEvent(message, 0);
		track.add(event);
		}
		catch (Exception e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
