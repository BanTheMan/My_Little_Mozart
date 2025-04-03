package symphony.strategy;

public class ElectricBassGuitarStrategy implements InstrumentStrategy
{
	@Override
	public void applyInstrument(Track track , int channel) 
	{
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 33, 0);
		MidiEvent event = new MidiEvent(message, 0);
		track.add(event);
	}
}
