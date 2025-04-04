package symphony.factory;

/**
 * Staccato Midi event factory creator
 * Author: Brandon Gomes
 */
public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	@Override
	public MidiEventFactory createFactory() {
		return new StaccatoMidiEventFactory();
	}

}
