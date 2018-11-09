package chapter11.midi;

import javax.sound.midi.*;

public class MiniMusicApp {

    public void play()
    {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track1 = seq.createTrack();

            int i = 0;
            for (i=0; i < 127; i++) {
                ShortMessage a = (new ShortMessage());
                a.setMessage(144, 7, i, 127);
                MidiEvent noteOn = new MidiEvent(a, i);
                track1.add(noteOn);
                ShortMessage b = (new ShortMessage());
                b.setMessage(144, 7, i, 127);
                MidiEvent noteOff = new MidiEvent(b, i);
                track1.add(noteOff);
            }


            player.setSequence(seq);
            player.start();
        } catch (MidiUnavailableException mue) {
            System.out.println("Midi is unavailable");
        } catch (Exception e) {
            System.out.println("Something went wrong. Reason:" + e.getMessage());
        }

    }

    public static void main(String[] args)
    {

        MiniMusicApp app = new MiniMusicApp();

        app.play();


    }
}
