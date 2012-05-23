import java.util.*;


public class FrequencyDirectory {
	static Map<String, Double> FrequencyMap;
	static int NoteCount = 150;
	
	FrequencyDirectory(){
		if(FrequencyMap == null)
		{
			FrequencyMap = new HashMap<String,Double>(NoteCount);
			FrequencyMap.put("C0", 16.35);
			FrequencyMap.put("C1", 32.70);
			FrequencyMap.put("C2", 65.41);
			FrequencyMap.put("C3", 130.81);
			FrequencyMap.put("C4", 261.64);
			FrequencyMap.put("C5", 523.25);
			FrequencyMap.put("C6", 1046.50);
			FrequencyMap.put("C7", 2093.00);
			FrequencyMap.put("C#0", 17.32);
			FrequencyMap.put("C#1", 34.65);
			FrequencyMap.put("C#2", 69.30);
			FrequencyMap.put("C#3", 138.59);
			FrequencyMap.put("C#4", 277.18);
			FrequencyMap.put("C#5", 554.37);
			FrequencyMap.put("C#6", 1108.73);
			FrequencyMap.put("C#7", 2217.46);
			FrequencyMap.put("Db0", 17.32);
			FrequencyMap.put("Db1", 34.65);
			FrequencyMap.put("Db2", 69.30);
			FrequencyMap.put("Db3", 138.59);
			FrequencyMap.put("Db4", 277.18);
			FrequencyMap.put("Db5", 554.37);
			FrequencyMap.put("Db6", 1108.73);
			FrequencyMap.put("Db7", 2217.46);	
			FrequencyMap.put("D0", 18.35);
			FrequencyMap.put("D1", 36.71);
			FrequencyMap.put("D2", 73.42);
			FrequencyMap.put("D3", 146.83);
			FrequencyMap.put("D4", 293.66);
			FrequencyMap.put("D5", 587.33);
			FrequencyMap.put("D6", 1174.66);
			FrequencyMap.put("D7", 2349.32);
			FrequencyMap.put("D#0", 19.45);
			FrequencyMap.put("D#1", 38.89);
			FrequencyMap.put("D#2", 77.78);
			FrequencyMap.put("D#3", 155.56);
			FrequencyMap.put("D#4", 311.13);
			FrequencyMap.put("D#5", 622.25);
			FrequencyMap.put("D#6", 1244.51);
			FrequencyMap.put("D#7", 2489.02);
			FrequencyMap.put("Eb0", 19.45);
			FrequencyMap.put("Eb1", 38.89);
			FrequencyMap.put("Eb2", 77.78);
			FrequencyMap.put("Eb3", 155.56);
			FrequencyMap.put("Eb4", 311.13);
			FrequencyMap.put("Eb5", 622.25);
			FrequencyMap.put("Eb6", 1244.51);
			FrequencyMap.put("Eb7", 2489.02);
			FrequencyMap.put("E0", 20.60);
			FrequencyMap.put("E1", 41.20);
			FrequencyMap.put("E2", 82.41);
			FrequencyMap.put("E3", 164.81);
			FrequencyMap.put("E4", 329.23);
			FrequencyMap.put("E5", 659.26);
			FrequencyMap.put("E6", 1318.51);
			FrequencyMap.put("E7", 2637.02);
			FrequencyMap.put("F0", 21.83);
			FrequencyMap.put("F1", 43.65);
			FrequencyMap.put("F2", 87.31);
			FrequencyMap.put("F3", 174.61);
			FrequencyMap.put("F4", 349.23);
			FrequencyMap.put("F5", 698.46);
			FrequencyMap.put("F6", 1396.91);
			FrequencyMap.put("F7", 2793.83);
			FrequencyMap.put("F#0", 23.12);
			FrequencyMap.put("F#1", 46.25);
			FrequencyMap.put("F#2", 92.50);
			FrequencyMap.put("F#3", 185.00);
			FrequencyMap.put("F#4", 369.99);
			FrequencyMap.put("F#5", 739.99);
			FrequencyMap.put("F#6", 1479.98);
			FrequencyMap.put("F#7", 2959.96);
			FrequencyMap.put("G0", 24.50);
			FrequencyMap.put("G1", 49.00);
			FrequencyMap.put("G2", 98.00);
			FrequencyMap.put("G3", 196.00);
			FrequencyMap.put("G4", 392.00);
			FrequencyMap.put("G5", 783.99);
			FrequencyMap.put("G6", 1567.98);
			FrequencyMap.put("G7", 3135.96);
			FrequencyMap.put("G#0", 25.96);
			FrequencyMap.put("G#1", 51.91);
			FrequencyMap.put("G#2", 103.83);
			FrequencyMap.put("G#3", 207.65);
			FrequencyMap.put("G#4", 415.30);
			FrequencyMap.put("G#5", 932.33);
			FrequencyMap.put("G#6", 1661.22);
			FrequencyMap.put("G#7", 3322.44);
			FrequencyMap.put("Ab0", 25.96);
			FrequencyMap.put("Ab1", 51.91);
			FrequencyMap.put("Ab2", 103.83);
			FrequencyMap.put("Ab3", 207.65);
			FrequencyMap.put("Ab4", 415.30);
			FrequencyMap.put("Ab5", 932.33);
			FrequencyMap.put("Ab6", 1661.22);
			FrequencyMap.put("Ab7", 3322.44);
			FrequencyMap.put("A0", 27.50);
			FrequencyMap.put("A1", 55.00);
			FrequencyMap.put("A2", 110.0);
			FrequencyMap.put("A3", 220.0);
			FrequencyMap.put("A4", 440.0);
			FrequencyMap.put("A5", 880.0);
			FrequencyMap.put("A6", 1760.0);
			FrequencyMap.put("A7", 3520.0);
			FrequencyMap.put("A#0", 29.12);
			FrequencyMap.put("A#1", 58.27);
			FrequencyMap.put("A#2", 116.54);
			FrequencyMap.put("A#3", 233.08);
			FrequencyMap.put("A#4", 466.16);
			FrequencyMap.put("A#5", 932.33);
			FrequencyMap.put("A#6", 1864.66);
			FrequencyMap.put("A#7", 3729.31);
			FrequencyMap.put("Bb0", 29.12);
			FrequencyMap.put("Bb1", 58.27);
			FrequencyMap.put("Bb2", 116.54);
			FrequencyMap.put("Bb3", 233.08);
			FrequencyMap.put("Bb4", 466.16);
			FrequencyMap.put("Bb5", 932.33);
			FrequencyMap.put("Bb6", 1864.66);
			FrequencyMap.put("Bb7", 3729.31);
			FrequencyMap.put("B0", 30.87);
			FrequencyMap.put("B1", 61.74);
			FrequencyMap.put("B2", 123.47);
			FrequencyMap.put("B3", 246.94);
			FrequencyMap.put("B4", 493.88);
			FrequencyMap.put("B5", 987.77);
			FrequencyMap.put("B6", 1975.52);
			FrequencyMap.put("B7", 3951.07);
		}
	}
	
	double getFrequency(String note)
	{
		Double value = FrequencyMap.get(note);
		if(value != null)
		{
			return value.doubleValue();
		}
		return 0.0;
	}
}
