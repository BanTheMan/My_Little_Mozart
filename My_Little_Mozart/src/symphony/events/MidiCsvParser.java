package symphony.events;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.ShortMessage;

public class MidiCsvParser {
	public static List<MidiEventData> parseCsv(String fp) throws IOException {
		List<MidiEventData> events = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fp))) {
			String line;
			
			// Neat trick!!
			while ((line = reader.readLine()) != null) {
				String[] values = line.split(",");
				if (values.length == 6) {
					int startEndTick = Integer.parseInt(values[0]);
					
					int Note_on_off;
					if (values[1].equals(" Note_on_c")) {
						Note_on_off = ShortMessage.NOTE_ON;
					} else if (values[1].equals(" Note_off_c")) {
						Note_on_off = ShortMessage.NOTE_OFF;
					} else {continue;}
					
					int channel = Integer.parseInt(values[2]);
					int note = Integer.parseInt(values[3]);
					int velocity = Integer.parseInt(values[4]);
					int instrument = Integer.parseInt(values[5]);
					
					// Store parsed event data
					MidiEventData event = new MidiEventData(
						startEndTick, 
						velocity,
						note,
						channel,
						instrument,
						Note_on_off
					);
					
					events.add(event);
				}
			}
		} catch (IOException e) {
		}
		return events;
	}
}
