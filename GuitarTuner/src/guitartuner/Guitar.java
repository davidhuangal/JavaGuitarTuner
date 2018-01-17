/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitartuner;

import javafx.scene.media.AudioClip;

/**
 *
 * @author dhuangal
 */
public class Guitar {
    
    public Guitar() {
        
    }
    
    public String[] notes = new String[6];
    AudioClip note;
    public void resetPlayer() {
        if(note != null) {
            note.stop();
            note = null;
        }
    }
}
