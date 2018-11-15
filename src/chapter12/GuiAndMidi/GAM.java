package chapter12.GuiAndMidi;

import javax.sound.midi.*;
import javax.swing.*;

public class GAM implements ControllerEventListener {

    public static void main(String[] args)
    {
        GAM app = new GAM();
        app.go();
    }

    public void go()
    {
        try {
            System.out.println("started");

            JFrame f = new JFrame();

            f.setSize(400,400);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWait = {127};
            sequencer.addControllerEventListener(this, eventsIWait);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 61; i+=4) {
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,i,100,i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception e) {
            System.out.println("Oops. Reason:" + e.getMessage());
        }
    }

    @Override
    public void controlChange(ShortMessage shortMessage) {
        System.out.println("la");
    }

    public static MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick)
    {
        MidiEvent event = null;

        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(cmd,chan, one, two);
            event = new MidiEvent(a, tick);

        } catch (Exception e) {

        }

        return event;
    }
}
