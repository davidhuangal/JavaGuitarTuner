/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitartuner;

import java.io.File;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author dhuangal
 */
public class ElectricGuitar extends Guitar implements Playable{

    @Override
    public void populateStrings() {
        
        notes[0] = "eE1.wav";
        notes[1] = "eA.wav";
        notes[2] = "eD.wav";
        notes[3] = "eG.wav";
        notes[4] = "eB.wav";
        notes[5] = "eE2.wav";
    }

    @Override
    public void playLowE() {
        resetPlayer();
        note = new AudioClip(this.getClass().getResource(notes[0]).toString());
        note.play();
    }

    @Override
    public void playA() {
        resetPlayer();
        note = new AudioClip(this.getClass().getResource(notes[1]).toString());
        note.play();
    }

    @Override
    public void playD() {
        resetPlayer();
        note = new AudioClip(this.getClass().getResource(notes[2]).toString());
        note.play();
    }

    @Override
    public void playG() {
        resetPlayer();
        note = new AudioClip(this.getClass().getResource(notes[3]).toString());
        note.play();
    }

    @Override
    public void playB() {
        resetPlayer();
        note = new AudioClip(this.getClass().getResource(notes[4]).toString());
        note.play();
    }

    @Override
    public void playHighE() {
        resetPlayer();
        note = new AudioClip(this.getClass().getResource(notes[5]).toString());
        note.play();
    }
    
}
