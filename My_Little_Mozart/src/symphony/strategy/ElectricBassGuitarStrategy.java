package symphony.strategy;

import javax.sound.midi.*;

/**
 * Midi electric bass guitar note strategy
 * Author: Ivan Rhodes
 */
public class ElectricBassGuitarStrategy implements InstrumentStrategy
{
	/**
	 * Set a channel in the Midi track to play the electric bass guitar
	 */
	@Override
	public void applyInstrument(Track track , int channel) 
	{
		try
		{
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 33, 0);
		MidiEvent event = new MidiEvent(message, 0);
		track.add(event);
		}
		catch (Exception e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
