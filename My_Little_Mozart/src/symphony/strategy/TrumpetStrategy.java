package symphony.strategy;

public class TrumpetStrategy implements InstrumentStrategy
{
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
		catch (exception e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
