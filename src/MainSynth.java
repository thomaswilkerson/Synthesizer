import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.FilterStateVariable;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.UnitFilter;
import com.jsyn.unitgen.UnitGenerator;
import com.jsyn.unitgen.WhiteNoise;


public class MainSynth {
	private static LineOut lineOut;
	
	public static void main(String[] argv)
	{
		Synthesizer synth = JSyn.createSynthesizer();
		
		WhiteNoise myNoise = new WhiteNoise();
		UnitFilter myFilter = new FilterStateVariable();
		
		myNoise.output.connect(myFilter.input);
		synth.add(myNoise);
		synth.add(myFilter);
		lineOut = new LineOut();
		synth.add(lineOut);
		
		myFilter.output.connect(0, lineOut.input, 0);
		myFilter.output.connect(0, lineOut.input, 1);
		lineOut.start();
		synth.start();
		
		double time = synth.getCurrentTime();
		try {
			synth.sleepUntil(time + 2.0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synth.stop();
	}
}
