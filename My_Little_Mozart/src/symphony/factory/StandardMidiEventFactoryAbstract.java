package symphony.factory;

/**
 * Standard Midi event factory creator 
 * Author: Brandon Gomes
 */
public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 * Create standard Midi event factory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}

}
