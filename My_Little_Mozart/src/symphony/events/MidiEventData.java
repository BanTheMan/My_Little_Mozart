package symphony.events;

/**
 * Class to hold Midi event data
 * Author: Brandon Gomes & Ekincan Ufuktepe
 */
public class MidiEventData {
	
	 private int startEndTick , velocity , note , channel , noteOnOff;
	 private int instrument ;
	 
	 /**
	  * Constructor
	 * @param startEndTick
	 * @param velocity
	 * @param note
	 * @param channel
	 * @param instrument
	 * @param noteOnOff
	 */
	public MidiEventData(int startEndTick , int velocity , int note ,
			 	int channel , int instrument , int noteOnOff) 
	 {
		 this.startEndTick = startEndTick ;
		 this.velocity = velocity ;
		 this.note = note;
		 this.channel = channel ;
		 this.instrument = instrument ;
		 this.noteOnOff = noteOnOff;
	 }

	/**
	 * Retrieve startEndTick value
	 * @return startEndTick value
	 */
	public int getStartEndTick() {
		return startEndTick;
	}

	/**
	 * Set startEndTick value
	 * @param startEndTick value
	 */
	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}

	/**
	 * Retrieve velocity value
	 * @return velocity value
	 */
	public int getVelocity() {
		return velocity;
	}

	/**
	 * Set velocity value
	 * @param velocity value
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	/**
	 * Retrieve note value
	 * @return note value
	 */
	public int getNote() {
		return note;
	}

	/**
	 * Set note value
	 * @param note value
	 */
	public void setNote(int note) {
		this.note = note;
	}

	/**
	 * Retrieve channel value
	 * @return channel value
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * Set channel value
	 * @param channel
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}

	/**
	 * Retrieve noteOnOff value
	 * @return noteOnOFf value
	 */
	public int getNoteOnOff() {
		return noteOnOff;
	}

	/**
	 * Set noteOnOff value
	 * @param noteOnOff
	 */
	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}

	/** 
	 * Retrieve instrument value
	 * @return instrument value
	 */
	public int getInstrument() {
		return instrument;
	}

	/**
	 * Set instrument value
	 * @param instrument
	 */
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	 
	 
}
