import com.softsynth.jsyn.*;


public class MainSynth {	
	static FrequencyDirectory f = new FrequencyDirectory();
	public static void main(String[] argv)
	{
		Synth.startEngine(0);
		SineOscillator sineOsc = new SineOscillator();
		SineOscillator sineOsc2 = new SineOscillator();
		sineOsc.frequency.set(f.getFrequency("C4"));
		sineOsc2.frequency.set(f.getFrequency("G4"));
		AddUnit mixer = new AddUnit();
		sineOsc.output.connect( 0, mixer.inputA, 0);
		sineOsc2.output.connect(mixer.inputB);
		LineOut lineOut = new LineOut();
		
		// Pipe the Oscillator into line out
		sineOsc.amplitude.set(0.2);
		sineOsc2.amplitude.set(0.2);
		mixer.output.connect(0, lineOut.input, 0); // Connect sineOscillator to left ear
		mixer.output.connect(0, lineOut.input, 1); // Connect to right channel
		
		
		

		System.out.println(f.getFrequency("Ab0"));
		sineOsc.start();
		sineOsc2.start();
		mixer.start();
		lineOut.start();
		for(;;)
		{
			Synth.sleepForTicks(400);
		
			sineOsc2.frequency.set(f.getFrequency("A4"));
		
			Synth.sleepForTicks(400);
		
			sineOsc.frequency.set(f.getFrequency("E4"));
			
			Synth.sleepForTicks(400);
			
			sineOsc.frequency.set(f.getFrequency("C4"));
			sineOsc2.frequency.set(f.getFrequency("G4"));
		}
	}	
}
