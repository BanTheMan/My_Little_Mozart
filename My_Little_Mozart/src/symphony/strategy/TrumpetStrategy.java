package symphony.strategy;

import javax.sound.midi.*;

/**
 * Midi trumpet note strategy
 * Author: Nate Spencer
 */
public class TrumpetStrategy implements InstrumentStrategy
{
	/**
	 * Set a channel in the Midi track to play the trumpet
	 */
	@Override
	public void applyInstrument(Track track , int channel) 
	{
		try 
		{
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0);
		MidiEvent event = new MidiEvent(message, 0);
		track.add(event);
		}
		catch (Exception e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
