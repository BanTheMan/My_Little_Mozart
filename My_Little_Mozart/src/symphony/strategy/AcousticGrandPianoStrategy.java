package symphony.strategy;

import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy 
{
	@Override
	public void applyInstrument(Track track , int channel) 
	{
		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0);
		MidiEvent event = new MidiEvent(message, 0);
		track.add(event);
	}
}
