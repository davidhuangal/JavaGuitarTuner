/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitartuner;

/**
 *
 * @author dhuangal
 */
public interface Playable {
    
    public void populateStrings();
    
    public void playLowE();
    public void playA();
    public void playD();
    public void playG();
    public void playB();
    public void playHighE();
}
