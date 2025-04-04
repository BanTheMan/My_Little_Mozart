package symphony.factory;

/**
 * Legato Midi event factory creator
 * Author: Brandon Gomes
 */
public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 *	Create Legato note factory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}

}
